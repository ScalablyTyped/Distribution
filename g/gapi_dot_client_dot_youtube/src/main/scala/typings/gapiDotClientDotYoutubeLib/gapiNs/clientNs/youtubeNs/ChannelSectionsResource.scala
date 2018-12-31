package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintOnBehalfOfContentOwnerChannel): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_HlMine): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
}

