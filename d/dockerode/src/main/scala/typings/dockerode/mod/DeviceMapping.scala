package typings.dockerode.mod

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
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions.asInstanceOf[js.Any], PathInContainer = PathInContainer.asInstanceOf[js.Any], PathOnHost = PathOnHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMapping]
  }
}

