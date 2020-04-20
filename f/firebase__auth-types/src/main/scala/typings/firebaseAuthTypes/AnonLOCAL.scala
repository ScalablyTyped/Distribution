package typings.firebaseAuthTypes

import typings.firebaseAuthTypes.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOCAL extends js.Object {
  var LOCAL: Persistence
  var NONE: Persistence
  var SESSION: Persistence
}

object AnonLOCAL {
  @scala.inline
  def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): AnonLOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLOCAL]
  }
}

