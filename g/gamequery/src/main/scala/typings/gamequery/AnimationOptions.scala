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
    delta: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    numberOfFrame: js.UndefOr[Double] = js.undefined,
    offsetx: js.UndefOr[Double] = js.undefined,
    offsety: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal(imageURL = imageURL.asInstanceOf[js.Any])
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfFrame)) __obj.updateDynamic("numberOfFrame")(numberOfFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetx)) __obj.updateDynamic("offsetx")(offsetx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsety)) __obj.updateDynamic("offsety")(offsety.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

