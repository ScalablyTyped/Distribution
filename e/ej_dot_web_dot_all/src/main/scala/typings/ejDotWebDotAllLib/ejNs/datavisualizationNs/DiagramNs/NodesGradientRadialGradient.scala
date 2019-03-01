package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesGradientRadialGradient extends js.Object {
  /** Defines the position of the outermost circle
    * @Default {0}
    */
  var cx: js.UndefOr[scala.Double] = js.undefined
  /** Defines the outer most circle of the radial gradient
    * @Default {0}
    */
  var cy: js.UndefOr[scala.Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fx: js.UndefOr[scala.Double] = js.undefined
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fy: js.UndefOr[scala.Double] = js.undefined
  /** Defines the different colors and the region of color transitions.
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the type of gradient
    * @Default {radial}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodesGradientRadialGradient {
  @scala.inline
  def apply(
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    fx: scala.Int | scala.Double = null,
    fy: scala.Int | scala.Double = null,
    stops: js.Array[_] = null,
    `type`: java.lang.String = null
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

