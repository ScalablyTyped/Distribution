package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMapping extends StObject {
  
  var CgroupPermissions: String
  
  var PathInContainer: String
  
  var PathOnHost: String
}
object DeviceMapping {
  
  @scala.inline
  def apply(CgroupPermissions: String, PathInContainer: String, PathOnHost: String): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions.asInstanceOf[js.Any], PathInContainer = PathInContainer.asInstanceOf[js.Any], PathOnHost = PathOnHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMapping]
  }
  
  @scala.inline
  implicit class DeviceMappingMutableBuilder[Self <: DeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCgroupPermissions(value: String): Self = StObject.set(x, "CgroupPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathInContainer(value: String): Self = StObject.set(x, "PathInContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathOnHost(value: String): Self = StObject.set(x, "PathOnHost", value.asInstanceOf[js.Any])
  }
}
