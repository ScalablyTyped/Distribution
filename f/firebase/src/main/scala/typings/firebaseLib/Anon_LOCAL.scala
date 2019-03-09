package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCAL extends js.Object {
  /**
    * Indicates that the state will be persisted even when the browser window is
    * closed or the activity is destroyed in react-native.
    */
  var LOCAL: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  /**
    * Indicates that the state will only be stored in memory and will be cleared
    * when the window or activity is refreshed.
    */
  var NONE: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  /**
    * Indicates that the state will only persist in current session/tab, relevant
    * to web only, and will be cleared when the tab is closed.
    */
  var SESSION: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
}

object Anon_LOCAL {
  @scala.inline
  def apply(
    LOCAL: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence,
    NONE: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence,
    SESSION: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence
  ): Anon_LOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL, NONE = NONE, SESSION = SESSION)
  
    __obj.asInstanceOf[Anon_LOCAL]
  }
}

