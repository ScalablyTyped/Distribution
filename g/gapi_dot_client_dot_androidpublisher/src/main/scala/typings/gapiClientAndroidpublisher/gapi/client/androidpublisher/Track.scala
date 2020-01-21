package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var track: js.UndefOr[String] = js.undefined
  var userFraction: js.UndefOr[Double] = js.undefined
  var versionCodes: js.UndefOr[js.Array[Double]] = js.undefined
}

object Track {
  @scala.inline
  def apply(track: String = null, userFraction: Int | Double = null, versionCodes: js.Array[Double] = null): Track = {
    val __obj = js.Dynamic.literal()
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (userFraction != null) __obj.updateDynamic("userFraction")(userFraction.asInstanceOf[js.Any])
    if (versionCodes != null) __obj.updateDynamic("versionCodes")(versionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
}

