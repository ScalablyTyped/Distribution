package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracksListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#tracksListResponse". */
  var kind: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[Track]] = js.native
}

object TracksListResponse {
  @scala.inline
  def apply(): TracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracksListResponse]
  }
  @scala.inline
  implicit class TracksListResponseOps[Self <: TracksListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTracksVarargs(value: Track*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[Track]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
  
}

