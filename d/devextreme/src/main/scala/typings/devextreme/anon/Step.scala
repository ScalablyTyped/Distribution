package typings.devextreme.anon

import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var direction: js.UndefOr[left | none | right] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    direction: left | none | right = null,
    opacity: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Step = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

