package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new moderator for the chat. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatModerator]
  /** Lists moderators for a live chat. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyLiveChatId): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatModeratorListResponse]
}

