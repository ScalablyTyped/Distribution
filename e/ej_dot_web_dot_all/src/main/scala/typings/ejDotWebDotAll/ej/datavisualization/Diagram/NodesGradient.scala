package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradient extends js.Object {
  /** Paints the node with linear color transitions
    */
  var LinearGradient: js.UndefOr[NodesGradientLinearGradient] = js.undefined
  /** Paints the node with radial color transitions. A focal point defines the beginning of the gradient, and a circle defines the end point of the gradient.
    */
  var RadialGradient: js.UndefOr[NodesGradientRadialGradient] = js.undefined
  /** Defines the color and a position where the previous color transition ends and a new color transition starts
    */
  var Stop: js.UndefOr[NodesGradientStop] = js.undefined
}

object NodesGradient {
  @scala.inline
  def apply(
    LinearGradient: NodesGradientLinearGradient = null,
    RadialGradient: NodesGradientRadialGradient = null,
    Stop: NodesGradientStop = null
  ): NodesGradient = {
    val __obj = js.Dynamic.literal()
    if (LinearGradient != null) __obj.updateDynamic("LinearGradient")(LinearGradient)
    if (RadialGradient != null) __obj.updateDynamic("RadialGradient")(RadialGradient)
    if (Stop != null) __obj.updateDynamic("Stop")(Stop)
    __obj.asInstanceOf[NodesGradient]
  }
}

