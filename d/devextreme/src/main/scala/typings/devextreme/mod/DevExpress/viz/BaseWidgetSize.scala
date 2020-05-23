package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.size */
trait BaseWidgetSize extends js.Object {
  /** @name BaseWidget.Options.size.height */
  var height: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.size.width */
  var width: js.UndefOr[Double] = js.undefined
}

object BaseWidgetSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): BaseWidgetSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetSize]
  }
}

