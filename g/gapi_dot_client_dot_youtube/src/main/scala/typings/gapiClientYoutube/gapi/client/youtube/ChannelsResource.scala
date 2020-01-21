package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltCategoryId
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: AnonAltCategoryId): Request_[ChannelListResponse]
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[Channel]
}

object ChannelsResource {
  @scala.inline
  def apply(
    list: AnonAltCategoryId => Request_[ChannelListResponse],
    update: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[Channel]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

