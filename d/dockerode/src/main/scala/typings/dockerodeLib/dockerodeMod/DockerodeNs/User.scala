package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var GID: scala.Double
  var UID: scala.Double
}

object User {
  @scala.inline
  def apply(GID: scala.Double, UID: scala.Double): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GID")(GID)
    __obj.updateDynamic("UID")(UID)
    __obj.asInstanceOf[User]
  }
}

