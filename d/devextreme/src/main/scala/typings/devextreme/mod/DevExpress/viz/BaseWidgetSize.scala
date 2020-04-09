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
  def apply(height: Int | Double = null, width: Int | Double = null): BaseWidgetSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetSize]
  }
}

