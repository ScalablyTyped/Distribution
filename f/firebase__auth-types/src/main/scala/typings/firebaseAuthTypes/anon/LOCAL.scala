package typings.firebaseAuthTypes.anon

import typings.firebaseAuthTypes.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LOCAL extends js.Object {
  var LOCAL: Persistence
  var NONE: Persistence
  var SESSION: Persistence
}

object LOCAL {
  @scala.inline
  def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): LOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[LOCAL]
  }
}

