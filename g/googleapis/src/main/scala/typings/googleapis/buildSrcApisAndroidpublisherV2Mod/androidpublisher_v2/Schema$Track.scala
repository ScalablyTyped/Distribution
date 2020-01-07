package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Track extends js.Object {
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
  var userFraction: js.UndefOr[Double] = js.native
  /**
    * Version codes to make active on this track. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$Track {
  @scala.inline
  def apply(track: String = null, userFraction: Int | Double = null, versionCodes: js.Array[Double] = null): Schema$Track = {
    val __obj = js.Dynamic.literal()
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (userFraction != null) __obj.updateDynamic("userFraction")(userFraction.asInstanceOf[js.Any])
    if (versionCodes != null) __obj.updateDynamic("versionCodes")(versionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Track]
  }
}

