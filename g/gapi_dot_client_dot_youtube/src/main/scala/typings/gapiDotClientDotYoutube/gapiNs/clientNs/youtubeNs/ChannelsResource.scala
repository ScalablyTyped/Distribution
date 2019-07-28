package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltCategoryId
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: Anon_AltCategoryId): Request[ChannelListResponse]
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[Channel]
}

object ChannelsResource {
  @scala.inline
  def apply(
    list: Anon_AltCategoryId => Request[ChannelListResponse],
    update: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[Channel]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

