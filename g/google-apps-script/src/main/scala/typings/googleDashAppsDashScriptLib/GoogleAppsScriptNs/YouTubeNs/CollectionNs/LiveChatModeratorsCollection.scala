package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorsCollection extends js.Object {
  // Adds a new moderator for the chat.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModerator,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModerator = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModeratorListResponse = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: java.lang.String, part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModeratorListResponse = js.native
  // Removes a chat moderator.
  def remove(id: java.lang.String): scala.Unit = js.native
}

