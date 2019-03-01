package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var track: js.UndefOr[java.lang.String] = js.undefined
  var userFraction: js.UndefOr[scala.Double] = js.undefined
  var versionCodes: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Track {
  @scala.inline
  def apply(
    track: java.lang.String = null,
    userFraction: scala.Int | scala.Double = null,
    versionCodes: js.Array[scala.Double] = null
  ): Track = {
    val __obj = js.Dynamic.literal()
    if (track != null) __obj.updateDynamic("track")(track)
    if (userFraction != null) __obj.updateDynamic("userFraction")(userFraction.asInstanceOf[js.Any])
    if (versionCodes != null) __obj.updateDynamic("versionCodes")(versionCodes)
    __obj.asInstanceOf[Track]
  }
}

