package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientRadialGradient extends js.Object {
  /** Defines the position of the outermost circle
    * @Default {0}
    */
  var cx: js.UndefOr[Double] = js.undefined
  /** Defines the outer most circle of the radial gradient
    * @Default {0}
    */
  var cy: js.UndefOr[Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fx: js.UndefOr[Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fy: js.UndefOr[Double] = js.undefined
  /** Defines the different colors and the region of color transitions.
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the type of gradient
    * @Default {radial}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodesGradientRadialGradient {
  @scala.inline
  def apply(
    cx: Int | Double = null,
    cy: Int | Double = null,
    fx: Int | Double = null,
    fy: Int | Double = null,
    stops: js.Array[_] = null,
    `type`: String = null
  ): NodesGradientRadialGradient = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodesGradientRadialGradient]
  }
}

