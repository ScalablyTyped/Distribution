package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModerator
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.LiveChatModeratorListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorsCollection extends js.Object {
  // Adds a new moderator for the chat.
  def insert(resource: LiveChatModerator, part: String): LiveChatModerator = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: String, part: String): LiveChatModeratorListResponse = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: String, part: String, optionalArgs: js.Object): LiveChatModeratorListResponse = js.native
  // Removes a chat moderator.
  def remove(id: String): Unit = js.native
}

