package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.LiveChatBan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansCollection extends js.Object {
  // Adds a new ban to the chat.
  def insert(resource: LiveChatBan, part: String): LiveChatBan
  // Removes a chat ban.
  def remove(id: String): Unit
}

object LiveChatBansCollection {
  @scala.inline
  def apply(insert: (LiveChatBan, String) => LiveChatBan, remove: String => Unit): LiveChatBansCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[LiveChatBansCollection]
  }
}

