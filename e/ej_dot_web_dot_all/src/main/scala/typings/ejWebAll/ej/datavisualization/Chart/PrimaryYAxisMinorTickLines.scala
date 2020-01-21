package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisMinorTickLines extends js.Object {
  /** Length of the minor tick lines.
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Show/hides the minor tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the minor tick line
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxisMinorTickLines {
  @scala.inline
  def apply(size: Int | Double = null, visible: js.UndefOr[Boolean] = js.undefined, width: Int | Double = null): PrimaryYAxisMinorTickLines = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisMinorTickLines]
  }
}

