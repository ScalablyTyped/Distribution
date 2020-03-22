package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the widget's size in pixels. */
trait BaseWidgetSize extends js.Object {
  /** Specifies the height of the widget in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the widget in pixels. */
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

