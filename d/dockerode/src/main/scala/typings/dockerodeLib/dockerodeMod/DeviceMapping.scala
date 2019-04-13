package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMapping extends js.Object {
  var CgroupPermissions: java.lang.String
  var PathInContainer: java.lang.String
  var PathOnHost: java.lang.String
}

object DeviceMapping {
  @scala.inline
  def apply(
    CgroupPermissions: java.lang.String,
    PathInContainer: java.lang.String,
    PathOnHost: java.lang.String
  ): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions, PathInContainer = PathInContainer, PathOnHost = PathOnHost)
  
    __obj.asInstanceOf[DeviceMapping]
  }
}

