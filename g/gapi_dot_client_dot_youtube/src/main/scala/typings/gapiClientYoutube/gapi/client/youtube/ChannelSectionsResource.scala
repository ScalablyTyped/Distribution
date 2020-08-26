package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Hl
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[ChannelSection] = js.native
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: Hl): Request[ChannelSectionListResponse] = js.native
  /** Update a channelSection. */
  def update(request: Part): Request[ChannelSection] = js.native
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
  @scala.inline
  implicit class ChannelSectionsResourceOps[Self <: ChannelSectionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: PrettyPrint => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: OnBehalfOfContentOwnerChannel => Request[ChannelSection]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Hl => Request[ChannelSectionListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Part => Request[ChannelSection]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

