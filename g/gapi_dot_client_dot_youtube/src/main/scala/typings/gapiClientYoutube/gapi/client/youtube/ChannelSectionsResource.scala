package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltChannelIdFieldsHl
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: AnonAltFieldsIdKeyOauthtoken): Request_[Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: AnonAltChannelIdFieldsHl): Request_[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtoken => Request_[Unit],
    insert: AnonAltFieldsKeyOauthtoken => Request_[ChannelSection],
    list: AnonAltChannelIdFieldsHl => Request_[ChannelSectionListResponse],
    update: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[ChannelSection]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}

