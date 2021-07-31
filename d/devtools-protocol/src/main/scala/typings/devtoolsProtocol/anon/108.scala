package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.SetPressureNotificationsSuppressedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var paramsType: js.Array[SetPressureNotificationsSuppressedRequest]
  
  var returnType: Unit
}
object `108` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetPressureNotificationsSuppressedRequest], returnType: Unit): `108` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`108`]
  }
  
  @scala.inline
  implicit class `108MutableBuilder`[Self <: `108`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetPressureNotificationsSuppressedRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetPressureNotificationsSuppressedRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
