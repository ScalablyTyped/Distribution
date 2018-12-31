package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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

