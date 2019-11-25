package typings.expo

import typings.expo.buildAuthSessionMod.AuthSessionResult
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.dismiss
import typings.expo.expoStrings.locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends AuthSessionResult {
  var `type`: cancel | dismiss | locked
}

object Anon_Cancel {
  @scala.inline
  def apply(`type`: cancel | dismiss | locked): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

