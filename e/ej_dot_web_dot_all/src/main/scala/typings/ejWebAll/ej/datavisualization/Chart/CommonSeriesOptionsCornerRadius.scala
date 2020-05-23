package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsCornerRadius extends js.Object {
  /** Specifies the radius for the bottom left corner.
    * @Default {0}
    */
  var bottomLeft: js.UndefOr[Double] = js.undefined
  /** Specifies the radius for the bottom right corner.
    * @Default {0}
    */
  var bottomRight: js.UndefOr[Double] = js.undefined
  /** Specifies the radius for the top left corner.
    * @Default {0}
    */
  var topLeft: js.UndefOr[Double] = js.undefined
  /** Specifies the radius for the top right corner.
    * @Default {0}
    */
  var topRight: js.UndefOr[Double] = js.undefined
}

object CommonSeriesOptionsCornerRadius {
  @scala.inline
  def apply(
    bottomLeft: js.UndefOr[Double] = js.undefined,
    bottomRight: js.UndefOr[Double] = js.undefined,
    topLeft: js.UndefOr[Double] = js.undefined,
    topRight: js.UndefOr[Double] = js.undefined
  ): CommonSeriesOptionsCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottomLeft)) __obj.updateDynamic("bottomLeft")(bottomLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomRight)) __obj.updateDynamic("bottomRight")(bottomRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topRight)) __obj.updateDynamic("topRight")(topRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsCornerRadius]
  }
}

