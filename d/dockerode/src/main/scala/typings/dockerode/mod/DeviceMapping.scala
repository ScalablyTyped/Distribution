package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMapping extends js.Object {
  
  var CgroupPermissions: String = js.native
  
  var PathInContainer: String = js.native
  
  var PathOnHost: String = js.native
}
object DeviceMapping {
  
  @scala.inline
  def apply(CgroupPermissions: String, PathInContainer: String, PathOnHost: String): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions.asInstanceOf[js.Any], PathInContainer = PathInContainer.asInstanceOf[js.Any], PathOnHost = PathOnHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMapping]
  }
  
  @scala.inline
  implicit class DeviceMappingOps[Self <: DeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCgroupPermissions(value: String): Self = this.set("CgroupPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathInContainer(value: String): Self = this.set("PathInContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathOnHost(value: String): Self = this.set("PathOnHost", value.asInstanceOf[js.Any])
  }
}
