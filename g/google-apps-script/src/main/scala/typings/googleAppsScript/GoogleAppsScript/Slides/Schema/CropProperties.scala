package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var bottomOffset: js.UndefOr[Double] = js.undefined
  var leftOffset: js.UndefOr[Double] = js.undefined
  var rightOffset: js.UndefOr[Double] = js.undefined
  var topOffset: js.UndefOr[Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    bottomOffset: Int | Double = null,
    leftOffset: Int | Double = null,
    rightOffset: Int | Double = null,
    topOffset: Int | Double = null
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (leftOffset != null) __obj.updateDynamic("leftOffset")(leftOffset.asInstanceOf[js.Any])
    if (rightOffset != null) __obj.updateDynamic("rightOffset")(rightOffset.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

