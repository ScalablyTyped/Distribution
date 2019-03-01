package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltCategoryId): gapiDotClientLib.gapiNs.clientNs.Request[ChannelListResponse]
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object ChannelsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltCategoryId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ChannelListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner, 
      gapiDotClientLib.gapiNs.clientNs.Request[Channel]
    ]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ChannelsResource]
  }
}

