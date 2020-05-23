package typings.friendlyErrorsWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  var messages: js.Array[String]
  var notes: js.Array[String]
}

object Messages {
  @scala.inline
  def apply(messages: js.Array[String], notes: js.Array[String]): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
}

