package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `109` extends StObject {
  
  var paramsType: js.Array[SimulatePressureNotificationRequest] = js.native
  
  var returnType: Unit = js.native
}
object `109` {
  
  @scala.inline
  def apply(paramsType: js.Array[SimulatePressureNotificationRequest], returnType: Unit): `109` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit class `109MutableBuilder`[Self <: `109`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SimulatePressureNotificationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SimulatePressureNotificationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
