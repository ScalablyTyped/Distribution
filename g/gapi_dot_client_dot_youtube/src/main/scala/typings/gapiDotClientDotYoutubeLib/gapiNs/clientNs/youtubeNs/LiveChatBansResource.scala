package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtokenId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new ban to the chat. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LiveChatBan]
}

