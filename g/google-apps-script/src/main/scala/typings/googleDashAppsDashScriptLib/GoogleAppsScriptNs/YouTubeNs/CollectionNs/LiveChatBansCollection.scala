package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansCollection extends js.Object {
  // Adds a new ban to the chat.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatBan,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatBan
  // Removes a chat ban.
  def remove(id: java.lang.String): scala.Unit
}

object LiveChatBansCollection {
  @scala.inline
  def apply(
    insert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatBan, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatBan,
    remove: java.lang.String => scala.Unit
  ): LiveChatBansCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[LiveChatBansCollection]
  }
}

