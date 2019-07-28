package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectLandmarks extends js.Object {
  var detectLandmarks: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var runClassifications: js.UndefOr[Double] = js.undefined
}

object Anon_DetectLandmarks {
  @scala.inline
  def apply(
    detectLandmarks: Int | Double = null,
    mode: Int | Double = null,
    runClassifications: Int | Double = null
  ): Anon_DetectLandmarks = {
    val __obj = js.Dynamic.literal()
    if (detectLandmarks != null) __obj.updateDynamic("detectLandmarks")(detectLandmarks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (runClassifications != null) __obj.updateDynamic("runClassifications")(runClassifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetectLandmarks]
  }
}

