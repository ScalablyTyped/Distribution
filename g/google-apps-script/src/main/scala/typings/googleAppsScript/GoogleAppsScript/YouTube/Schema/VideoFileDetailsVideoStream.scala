package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsVideoStream extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var bitrateBps: js.UndefOr[String] = js.undefined
  var codec: js.UndefOr[String] = js.undefined
  var frameRateFps: js.UndefOr[Double] = js.undefined
  var heightPixels: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    bitrateBps: String = null,
    codec: String = null,
    frameRateFps: js.UndefOr[Double] = js.undefined,
    heightPixels: js.UndefOr[Double] = js.undefined,
    rotation: String = null,
    vendor: String = null,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRateFps)) __obj.updateDynamic("frameRateFps")(frameRateFps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
}

