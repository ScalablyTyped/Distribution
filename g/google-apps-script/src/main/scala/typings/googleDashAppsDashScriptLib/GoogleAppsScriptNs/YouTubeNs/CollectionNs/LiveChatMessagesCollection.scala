package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatMessagesCollection extends js.Object {
  // Adds a message to a live chat.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatMessage,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatMessage = js.native
  // Lists live chat messages for a specific chat.
  def list(liveChatId: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatMessageListResponse = js.native
  // Lists live chat messages for a specific chat.
  def list(liveChatId: java.lang.String, part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatMessageListResponse = js.native
  // Deletes a chat message.
  def remove(id: java.lang.String): scala.Unit = js.native
}

