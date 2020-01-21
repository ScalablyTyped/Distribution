package typings.expo

import typings.expo.expoStrings.error
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorMessage extends UpdateEvent {
  var message: String
  var `type`: error
}

object AnonErrorMessage {
  @scala.inline
  def apply(message: String, `type`: error): AnonErrorMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorMessage]
  }
}

