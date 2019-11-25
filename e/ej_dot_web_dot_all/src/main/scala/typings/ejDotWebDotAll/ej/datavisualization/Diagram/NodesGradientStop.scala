package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  def apply(color: String = null, offset: Int | Double = null, opacity: Int | Double = null): NodesGradientStop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGradientStop]
  }
}

