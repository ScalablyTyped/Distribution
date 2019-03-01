package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesShadow extends js.Object {
  /** Defines the angle of the shadow relative to node
    * @Default {45}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Sets the distance to move the shadow relative to node
    * @Default {5}
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /** Defines the opaque of the shadow
    * @Default {0.7}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object NodesShadow {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): NodesShadow = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesShadow]
  }
}

