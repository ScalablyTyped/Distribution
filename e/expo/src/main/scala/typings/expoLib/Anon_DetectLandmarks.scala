package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectLandmarks extends js.Object {
  var detectLandmarks: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var runClassifications: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DetectLandmarks {
  @scala.inline
  def apply(
    detectLandmarks: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    runClassifications: scala.Int | scala.Double = null
  ): Anon_DetectLandmarks = {
    val __obj = js.Dynamic.literal()
    if (detectLandmarks != null) __obj.updateDynamic("detectLandmarks")(detectLandmarks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (runClassifications != null) __obj.updateDynamic("runClassifications")(runClassifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetectLandmarks]
  }
}

