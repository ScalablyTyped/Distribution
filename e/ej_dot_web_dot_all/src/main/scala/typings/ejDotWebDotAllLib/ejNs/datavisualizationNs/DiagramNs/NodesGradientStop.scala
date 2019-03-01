package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientStop extends js.Object {
  /** Sets the color to be filled over the specified region
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the position where the previous color transition ends and a new color transition starts
    * @Default {0}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Describes the transparency level of the region
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object NodesGradientStop {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): NodesGradientStop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesGradientStop]
  }
}

