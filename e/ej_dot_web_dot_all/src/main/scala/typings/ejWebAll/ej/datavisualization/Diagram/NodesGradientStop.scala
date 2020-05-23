package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientStop extends js.Object {
  /** Sets the color to be filled over the specified region
    */
  var color: js.UndefOr[String] = js.undefined
  /** Sets the position where the previous color transition ends and a new color transition starts
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Describes the transparency level of the region
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object NodesGradientStop {
  @scala.inline
  def apply(
    color: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): NodesGradientStop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGradientStop]
  }
}

