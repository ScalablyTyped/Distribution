package typings
package dockerodeLib.dockerodeMod

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
    val __obj = js.Dynamic.literal(GID = GID, UID = UID)
  
    __obj.asInstanceOf[User]
  }
}

