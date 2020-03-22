package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Generates space around the widget. */
trait BaseWidgetMargin extends js.Object {
  /** Specifies the bottom margin of the widget in pixels. */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Specifies the left margin of the widget in pixels. */
  var left: js.UndefOr[Double] = js.undefined
  /** Specifies the right margin of the widget in pixels. */
  var right: js.UndefOr[Double] = js.undefined
  /** Specifies the top margin of the widget in pixels. */
  var top: js.UndefOr[Double] = js.undefined
}

object BaseWidgetMargin {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): BaseWidgetMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetMargin]
  }
}

