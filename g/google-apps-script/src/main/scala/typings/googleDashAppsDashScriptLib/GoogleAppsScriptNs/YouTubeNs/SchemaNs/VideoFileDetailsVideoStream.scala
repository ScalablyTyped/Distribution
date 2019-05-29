package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsVideoStream extends js.Object {
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var bitrateBps: js.UndefOr[java.lang.String] = js.undefined
  var codec: js.UndefOr[java.lang.String] = js.undefined
  var frameRateFps: js.UndefOr[scala.Double] = js.undefined
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[java.lang.String] = js.undefined
  var vendor: js.UndefOr[java.lang.String] = js.undefined
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    bitrateBps: java.lang.String = null,
    codec: java.lang.String = null,
    frameRateFps: scala.Int | scala.Double = null,
    heightPixels: scala.Int | scala.Double = null,
    rotation: java.lang.String = null,
    vendor: java.lang.String = null,
    widthPixels: scala.Int | scala.Double = null
  ): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (frameRateFps != null) __obj.updateDynamic("frameRateFps")(frameRateFps.asInstanceOf[js.Any])
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
}

