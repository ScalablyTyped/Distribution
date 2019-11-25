package typings.expo

import typings.expo.buildUpdatesUpdatesMod.UpdateEvent
import typings.expo.expoStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends UpdateEvent {
  var message: String
  var `type`: error
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(message: String, `type`: error): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

