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
  
  inline def apply(CgroupPermissions: String, PathInContainer: String, PathOnHost: String): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions.asInstanceOf[js.Any], PathInContainer = PathInContainer.asInstanceOf[js.Any], PathOnHost = PathOnHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMapping]
  }
  
  extension [Self <: DeviceMapping](x: Self) {
    
    inline def setCgroupPermissions(value: String): Self = StObject.set(x, "CgroupPermissions", value.asInstanceOf[js.Any])
    
    inline def setPathInContainer(value: String): Self = StObject.set(x, "PathInContainer", value.asInstanceOf[js.Any])
    
    inline def setPathOnHost(value: String): Self = StObject.set(x, "PathOnHost", value.asInstanceOf[js.Any])
  }
}
