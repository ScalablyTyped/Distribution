package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrack extends js.Object {
  /**
    * A list of all active releases in this track during a read request. On an
    * update request, it represents desired changes.
    */
  var releases: js.UndefOr[js.Array[SchemaTrackRelease]] = js.native
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
}

object SchemaTrack {
  @scala.inline
  def apply(): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrack]
  }
  @scala.inline
  implicit class SchemaTrackOps[Self <: SchemaTrack] (val x: Self) extends AnyVal {
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
    def setReleasesVarargs(value: SchemaTrackRelease*): Self = this.set("releases", js.Array(value :_*))
    @scala.inline
    def setReleases(value: js.Array[SchemaTrackRelease]): Self = this.set("releases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleases: Self = this.set("releases", js.undefined)
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
  
}

