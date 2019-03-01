package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsMajorTickLines extends js.Object {
  /** Specifies the size of the majorTickLines in range navigator
    * @Default {0}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Toggles the visibility of major tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies width of the major tick lines.
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ValueAxisSettingsMajorTickLines {
  @scala.inline
  def apply(
    size: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ValueAxisSettingsMajorTickLines = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsMajorTickLines]
  }
}

