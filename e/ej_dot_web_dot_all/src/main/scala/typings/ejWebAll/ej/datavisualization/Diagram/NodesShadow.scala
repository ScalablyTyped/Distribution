package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesShadow extends js.Object {
  /** Defines the angle of the shadow relative to node
    * @Default {45}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Sets the distance to move the shadow relative to node
    * @Default {5}
    */
  var distance: js.UndefOr[Double] = js.undefined
  /** Defines the opaque of the shadow
    * @Default {0.7}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object NodesShadow {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): NodesShadow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesShadow]
  }
}

