package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Hl
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: PrettyPrint): Request[Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: Hl): Request[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: Part): Request[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[ChannelSection],
    list: Hl => Request[ChannelSectionListResponse],
    update: Part => Request[ChannelSection]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}

