package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesErrorBarCap extends js.Object {
  /** Color of the error bar cap.
    * @Default {#000000}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Length of the error bar cap.
    * @Default {1}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Show/Hides the error bar cap.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the error bar cap.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesErrorBarCap {
  @scala.inline
  def apply(
    fill: String = null,
    length: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SeriesErrorBarCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesErrorBarCap]
  }
}

