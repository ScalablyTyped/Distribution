package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.UpdateRegistrationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  var paramsType: js.Array[UpdateRegistrationRequest]
  
  var returnType: Unit
}
object `180` {
  
  @scala.inline
  def apply(paramsType: js.Array[UpdateRegistrationRequest], returnType: Unit): `180` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit class `180MutableBuilder`[Self <: `180`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[UpdateRegistrationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: UpdateRegistrationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
