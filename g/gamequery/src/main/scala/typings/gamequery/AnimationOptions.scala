package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var delta: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var imageURL: String
  var numberOfFrame: js.UndefOr[Double] = js.undefined
  var offsetx: js.UndefOr[Double] = js.undefined
  var offsety: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    imageURL: String,
    delta: Int | Double = null,
    distance: Int | Double = null,
    numberOfFrame: Int | Double = null,
    offsetx: Int | Double = null,
    offsety: Int | Double = null,
    rate: Int | Double = null,
    `type`: Int | Double = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal(imageURL = imageURL)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (numberOfFrame != null) __obj.updateDynamic("numberOfFrame")(numberOfFrame.asInstanceOf[js.Any])
    if (offsetx != null) __obj.updateDynamic("offsetx")(offsetx.asInstanceOf[js.Any])
    if (offsety != null) __obj.updateDynamic("offsety")(offsety.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

