package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdFieldsHl
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: Anon_AltFieldsIdKeyOauthtoken): Request[Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: Anon_AltChannelIdFieldsHl): Request[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtoken => Request[Unit],
    insert: Anon_AltFieldsKeyOauthtoken => Request[ChannelSection],
    list: Anon_AltChannelIdFieldsHl => Request[ChannelSectionListResponse],
    update: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[ChannelSection]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}

