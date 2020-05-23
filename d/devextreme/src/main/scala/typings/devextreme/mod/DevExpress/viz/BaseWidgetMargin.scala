package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.margin */
trait BaseWidgetMargin extends js.Object {
  /** @name BaseWidget.Options.margin.bottom */
  var bottom: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.margin.left */
  var left: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.margin.right */
  var right: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.margin.top */
  var top: js.UndefOr[Double] = js.undefined
}

object BaseWidgetMargin {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): BaseWidgetMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetMargin]
  }
}

