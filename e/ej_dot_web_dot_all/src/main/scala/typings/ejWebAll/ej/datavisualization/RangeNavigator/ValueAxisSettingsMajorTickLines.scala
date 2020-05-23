package typings.ejWebAll.ej.datavisualization.RangeNavigator

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
  def apply(
    size: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ValueAxisSettingsMajorTickLines = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
  }
}

