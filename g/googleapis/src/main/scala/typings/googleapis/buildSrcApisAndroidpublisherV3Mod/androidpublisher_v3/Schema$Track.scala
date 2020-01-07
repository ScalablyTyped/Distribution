package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Track extends js.Object {
  /**
    * A list of all active releases in this track during a read request. On an
    * update request, it represents desired changes.
    */
  var releases: js.UndefOr[js.Array[Schema$TrackRelease]] = js.native
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
}

object Schema$Track {
  @scala.inline
  def apply(releases: js.Array[Schema$TrackRelease] = null, track: String = null): Schema$Track = {
    val __obj = js.Dynamic.literal()
    if (releases != null) __obj.updateDynamic("releases")(releases.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Track]
  }
}

