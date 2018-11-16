package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_HlCategoryId): gapiDotClientLib.gapiNs.clientNs.Request[ChannelListResponse]
  /**
               * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
               * objects and their child properties.
               */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

