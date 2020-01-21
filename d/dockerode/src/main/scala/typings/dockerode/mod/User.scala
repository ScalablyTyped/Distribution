package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var GID: Double
  var UID: Double
}

object User {
  @scala.inline
  def apply(GID: Double, UID: Double): User = {
    val __obj = js.Dynamic.literal(GID = GID.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[User]
  }
}

