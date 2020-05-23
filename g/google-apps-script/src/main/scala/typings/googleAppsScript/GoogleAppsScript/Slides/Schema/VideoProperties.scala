package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    outline: Outline = null,
    start: js.UndefOr[Double] = js.undefined
  ): VideoProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
}

