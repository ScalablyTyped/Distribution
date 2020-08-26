package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AltFields
import typings.gapiClientYoutube.anon.Mine
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AltFields): Request[Unit] = js.native
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[LiveStream] = js.native
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: Mine): Request[LiveStreamListResponse] = js.native
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: OnBehalfOfContentOwnerChannel): Request[LiveStream] = js.native
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AltFields => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[LiveStream],
    list: Mine => Request[LiveStreamListResponse],
    update: OnBehalfOfContentOwnerChannel => Request[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LiveStreamsResource]
  }
  @scala.inline
  implicit class LiveStreamsResourceOps[Self <: LiveStreamsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: AltFields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: OnBehalfOfContentOwnerChannel => Request[LiveStream]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Mine => Request[LiveStreamListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: OnBehalfOfContentOwnerChannel => Request[LiveStream]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

