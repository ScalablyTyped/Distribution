package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  // The magnitude.
  var magnitude: scala.Double
  // The units for magnitude.
  var unit: Unit
}

object Dimension {
  @scala.inline
  def apply(magnitude: scala.Double, unit: Unit): Dimension = {
    val __obj = js.Dynamic.literal(magnitude = magnitude, unit = unit)
  
    __obj.asInstanceOf[Dimension]
  }
}

