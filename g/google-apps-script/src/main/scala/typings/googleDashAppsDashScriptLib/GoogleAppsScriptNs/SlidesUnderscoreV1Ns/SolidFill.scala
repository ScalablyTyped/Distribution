package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SolidFill extends js.Object {
  // The fraction of this `color` that should be applied to the pixel.
  // That is, the final pixel color is defined by the equation:
  //
  //   pixel color = alpha * (color) + (1.0 - alpha) * (background color)
  //
  // This means that a value of 1.0 corresponds to a solid color, whereas
  // a value of 0.0 corresponds to a completely transparent color.
  var alpha: scala.Double
  // The color value of the solid fill.
  var color: OpaqueColor
}

