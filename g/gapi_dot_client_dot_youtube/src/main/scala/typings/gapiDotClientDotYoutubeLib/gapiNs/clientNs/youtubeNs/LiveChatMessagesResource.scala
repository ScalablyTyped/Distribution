package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a message to a live chat. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_Hl): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatMessageListResponse]
}

