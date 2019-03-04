package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Fabric util Interface
//////////////////////////////////////////////////////////////////////////////
trait IUtilAnimationOptions extends js.Object {
  /**
  	 * Value to modify the property by
  	 */
  var byValue: scala.Double
  /**
  	 * Duration of change (in ms)
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Easing function
  	 */
  var easing: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Ending value
  	 */
  var endValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Callback; invoked on every value change
  	 */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Callback; invoked when value change is completed
  	 */
  var onComplete: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Starting value
  	 */
  var startValue: js.UndefOr[scala.Double] = js.undefined
}

object IUtilAnimationOptions {
  @scala.inline
  def apply(
    byValue: scala.Double,
    duration: scala.Int | scala.Double = null,
    easing: js.Function = null,
    endValue: scala.Int | scala.Double = null,
    onChange: js.Function = null,
    onComplete: js.Function = null,
    startValue: scala.Int | scala.Double = null
  ): IUtilAnimationOptions = {
    val __obj = js.Dynamic.literal(byValue = byValue)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUtilAnimationOptions]
  }
}

