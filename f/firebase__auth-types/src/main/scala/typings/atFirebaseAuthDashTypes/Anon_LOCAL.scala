package typings.atFirebaseAuthDashTypes

import typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCAL extends js.Object {
  var LOCAL: Persistence
  var NONE: Persistence
  var SESSION: Persistence
}

object Anon_LOCAL {
  @scala.inline
  def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): Anon_LOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL, NONE = NONE, SESSION = SESSION)
  
    __obj.asInstanceOf[Anon_LOCAL]
  }
}

