package typings.expo

import typings.expo.authSessionMod.AuthSessionResult
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.dismiss
import typings.expo.expoStrings.locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends AuthSessionResult {
  var `type`: cancel | dismiss | locked
}

object AnonType {
  @scala.inline
  def apply(`type`: cancel | dismiss | locked): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

