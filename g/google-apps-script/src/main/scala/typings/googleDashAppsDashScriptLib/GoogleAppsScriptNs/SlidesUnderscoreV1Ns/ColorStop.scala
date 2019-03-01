package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  // The alpha value of this color in the gradient band. Defaults to 1.0,
  // fully opaque.
  var alpha: scala.Double
  // The color of the gradient stop.
  var color: OpaqueColor
  // The relative position of the color stop in the gradient band measured
  // in percentage. The value should be in the interval [0.0, 1.0].
  var position: scala.Double
}

object ColorStop {
  @scala.inline
  def apply(alpha: scala.Double, color: OpaqueColor, position: scala.Double): ColorStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ColorStop]
  }
}

