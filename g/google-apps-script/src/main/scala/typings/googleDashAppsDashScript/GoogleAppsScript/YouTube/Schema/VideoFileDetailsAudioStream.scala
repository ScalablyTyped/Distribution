package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsAudioStream extends js.Object {
  var bitrateBps: js.UndefOr[String] = js.undefined
  var channelCount: js.UndefOr[Double] = js.undefined
  var codec: js.UndefOr[String] = js.undefined
  var vendor: js.UndefOr[String] = js.undefined
}

object VideoFileDetailsAudioStream {
  @scala.inline
  def apply(
    bitrateBps: String = null,
    channelCount: Int | Double = null,
    codec: String = null,
    vendor: String = null
  ): VideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[VideoFileDetailsAudioStream]
  }
}

