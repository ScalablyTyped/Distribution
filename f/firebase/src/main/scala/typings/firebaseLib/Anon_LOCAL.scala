package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCAL extends js.Object {
  var LOCAL: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  var NONE: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  var SESSION: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
}

object Anon_LOCAL {
  @scala.inline
  def apply(
    LOCAL: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence,
    NONE: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence,
    SESSION: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  ): Anon_LOCAL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOCAL")(LOCAL)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("SESSION")(SESSION)
    __obj.asInstanceOf[Anon_LOCAL]
  }
}

