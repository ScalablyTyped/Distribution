package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `73` extends StObject {
  
  var paramsType: js.Array[SetDeviceOrientationOverrideRequest] = js.native
  
  var returnType: Unit = js.native
}
object `73` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetDeviceOrientationOverrideRequest], returnType: Unit): `73` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  
  @scala.inline
  implicit class `73MutableBuilder`[Self <: `73`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetDeviceOrientationOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetDeviceOrientationOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
