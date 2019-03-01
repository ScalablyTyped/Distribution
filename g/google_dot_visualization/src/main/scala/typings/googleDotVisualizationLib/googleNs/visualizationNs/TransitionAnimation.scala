package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionAnimation extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
   // linear, in, out, inAndOut
  var startup: js.UndefOr[scala.Boolean] = js.undefined
}

object TransitionAnimation {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    startup: js.UndefOr[scala.Boolean] = js.undefined
  ): TransitionAnimation = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(startup)) __obj.updateDynamic("startup")(startup)
    __obj.asInstanceOf[TransitionAnimation]
  }
}

