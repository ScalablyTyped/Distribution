package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Id to name association of a track.
  */
@js.native
trait Schema$TrackInfo extends js.Object {
  /**
    * A modifiable name for a track. This is the visible name in the play
    * developer console.
    */
  var trackAlias: js.UndefOr[String] = js.native
  /**
    * Unmodifiable, unique track identifier. This identifier is the
    * releaseTrackId in the url of the play developer console page that
    * displays the track information.
    */
  var trackId: js.UndefOr[String] = js.native
}

object Schema$TrackInfo {
  @scala.inline
  def apply(trackAlias: String = null, trackId: String = null): Schema$TrackInfo = {
    val __obj = js.Dynamic.literal()
    if (trackAlias != null) __obj.updateDynamic("trackAlias")(trackAlias.asInstanceOf[js.Any])
    if (trackId != null) __obj.updateDynamic("trackId")(trackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrackInfo]
  }
}

