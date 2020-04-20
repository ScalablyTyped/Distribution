package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Messages

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsCollection extends js.Object {
  // Gets the specified message attachment.
  def get(userId: String, messageId: String, id: String): MessagePartBody
}

object AttachmentsCollection {
  @scala.inline
  def apply(get: (String, String, String) => MessagePartBody): AttachmentsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[AttachmentsCollection]
  }
}

