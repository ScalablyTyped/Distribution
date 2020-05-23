package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientLinearGradient extends js.Object {
  /** Defines the different colors and the region of color transitions
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the type of gradient
    * @Default {linear}
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Defines the left most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var x1: js.UndefOr[Double] = js.undefined
  /** Defines the right most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var x2: js.UndefOr[Double] = js.undefined
  /** Defines the top most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var y1: js.UndefOr[Double] = js.undefined
  /** Defines the bottom most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var y2: js.UndefOr[Double] = js.undefined
}

object NodesGradientLinearGradient {
  @scala.inline
  def apply(
    stops: js.Array[_] = null,
    `type`: String = null,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): NodesGradientLinearGradient = {
    val __obj = js.Dynamic.literal()
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGradientLinearGradient]
  }
}

