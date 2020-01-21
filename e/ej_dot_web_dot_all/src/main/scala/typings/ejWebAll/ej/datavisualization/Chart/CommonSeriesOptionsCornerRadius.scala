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
    bottomLeft: Int | Double = null,
    bottomRight: Int | Double = null,
    topLeft: Int | Double = null,
    topRight: Int | Double = null
  ): CommonSeriesOptionsCornerRadius = {
    val __obj = js.Dynamic.literal()
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsCornerRadius]
  }
}

