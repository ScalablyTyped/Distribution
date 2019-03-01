package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//// FILE: transform.proto ////
trait AffineTransform extends js.Object {
  // The X coordinate scaling element.
  var scale_x: scala.Double
  // The Y coordinate scaling element.
  var scale_y: scala.Double
  // The X coordinate shearing element.
  var shear_x: scala.Double
  // The Y coordinate shearing element.
  var shear_y: scala.Double
  // The X coordinate translation element.
  var translate_x: scala.Double
  // The Y coordinate translation element.
  var translate_y: scala.Double
  // The units for translate elements.
  var unit: Unit
}

object AffineTransform {
  @scala.inline
  def apply(
    scale_x: scala.Double,
    scale_y: scala.Double,
    shear_x: scala.Double,
    shear_y: scala.Double,
    translate_x: scala.Double,
    translate_y: scala.Double,
    unit: Unit
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale_x")(scale_x)
    __obj.updateDynamic("scale_y")(scale_y)
    __obj.updateDynamic("shear_x")(shear_x)
    __obj.updateDynamic("shear_y")(shear_y)
    __obj.updateDynamic("translate_x")(translate_x)
    __obj.updateDynamic("translate_y")(translate_y)
    __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[AffineTransform]
  }
}

