package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatModeratorsCollection extends js.Object {
  // Adds a new moderator for the chat.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveChatModerator,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveChatModerator = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: java.lang.String, part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveChatModeratorListResponse = js.native
  // Lists moderators for a live chat.
  def list(liveChatId: java.lang.String, part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveChatModeratorListResponse = js.native
  // Removes a chat moderator.
  def remove(id: java.lang.String): scala.Unit = js.native
}

