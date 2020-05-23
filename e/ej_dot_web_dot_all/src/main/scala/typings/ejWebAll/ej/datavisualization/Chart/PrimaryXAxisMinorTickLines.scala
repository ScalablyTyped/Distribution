package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisMinorTickLines extends js.Object {
  /** Length of the minor tick lines.
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Show/hides the minor tick lines.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the minor tick line.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PrimaryXAxisMinorTickLines {
  @scala.inline
  def apply(
    size: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PrimaryXAxisMinorTickLines = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisMinorTickLines]
  }
}

