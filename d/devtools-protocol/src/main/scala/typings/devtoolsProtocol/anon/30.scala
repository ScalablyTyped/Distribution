package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.BackgroundService.StopObservingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var paramsType: js.Array[StopObservingRequest]
  
  var returnType: Unit
}
object `30` {
  
  @scala.inline
  def apply(paramsType: js.Array[StopObservingRequest], returnType: Unit): `30` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[StopObservingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: StopObservingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
