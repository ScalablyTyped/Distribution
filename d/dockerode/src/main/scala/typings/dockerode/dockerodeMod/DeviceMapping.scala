package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMapping extends js.Object {
  var CgroupPermissions: String
  var PathInContainer: String
  var PathOnHost: String
}

object DeviceMapping {
  @scala.inline
  def apply(CgroupPermissions: String, PathInContainer: String, PathOnHost: String): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions, PathInContainer = PathInContainer, PathOnHost = PathOnHost)
  
    __obj.asInstanceOf[DeviceMapping]
  }
}

