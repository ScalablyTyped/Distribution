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
  def apply(releases: js.Array[SchemaTrackRelease] = null, track: String = null): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    if (releases != null) __obj.updateDynamic("releases")(releases.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrack]
  }
}

