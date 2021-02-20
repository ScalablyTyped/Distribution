package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceId extends StObject {
  
  var DeviceId: String = js.native
  
  var DeviceName: String = js.native
  
  var DeviceSize: String = js.native
}
object DeviceId {
  
  @scala.inline
  def apply(DeviceId: String, DeviceName: String, DeviceSize: String): DeviceId = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceSize = DeviceSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
  
  @scala.inline
  implicit class DeviceIdMutableBuilder[Self <: DeviceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSize(value: String): Self = StObject.set(x, "DeviceSize", value.asInstanceOf[js.Any])
  }
}
