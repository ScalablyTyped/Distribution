package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsMajorTickLines extends js.Object {
  /** Specifies the size of the majorTickLines in range navigator
    * @Default {0}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Toggles the visibility of major tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies width of the major tick lines.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ValueAxisSettingsMajorTickLines {
  @scala.inline
  def apply(size: Int | Double = null, visible: js.UndefOr[Boolean] = js.undefined, width: Int | Double = null): ValueAxisSettingsMajorTickLines = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
  }
}

