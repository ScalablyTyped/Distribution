package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesSubGauge extends js.Object {
  /** Specify subGauge Height of circular gauge
    * @Default {150}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specify position for sub-gauge of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesSubGaugesPosition] = js.undefined
  /** Specify subGauge Width of circular gauge
    * @Default {150}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesSubGauge {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    position: ScalesSubGaugesPosition = null,
    width: js.UndefOr[Double] = js.undefined
  ): ScalesSubGauge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesSubGauge]
  }
}

