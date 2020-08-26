package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistContentDetails extends js.Object {
  /** The number of videos in the playlist. */
  var itemCount: js.UndefOr[Double] = js.native
}

object PlaylistContentDetails {
  @scala.inline
  def apply(): PlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistContentDetails]
  }
  @scala.inline
  implicit class PlaylistContentDetailsOps[Self <: PlaylistContentDetails] (val x: Self) extends AnyVal {
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
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
  }
  
}

