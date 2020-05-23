package typings.expo.anon

import typings.expo.expoStrings.error
import typings.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends UpdateEvent {
  var message: String
  var `type`: error
}

object Message {
  @scala.inline
  def apply(message: String, `type`: error): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

