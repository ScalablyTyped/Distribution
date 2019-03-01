package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  // The blue component of the color, from 0.0 to 1.0.
  var blue: scala.Double
  // The green component of the color, from 0.0 to 1.0.
  var green: scala.Double
  // The red component of the color, from 0.0 to 1.0.
  var red: scala.Double
}

object RgbColor {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[RgbColor]
  }
}

