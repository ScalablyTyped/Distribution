package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationOptions extends js.Object {
  /**
  	 *  Value to modify the property by, default: end - start
  	 */
  var by: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Defaults to 500 (ms). Can be used to change duration of an animation.
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Easing function. Default: fabric.util.ease.easeInSine
  	 */
  var easing: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Allows to specify starting value of animatable property (if we don't want current value to be used).
  	 */
  var from: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Callback; invoked on every value change
  	 */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Callback; invoked when value change is completed
  	 */
  var onComplete: js.UndefOr[js.Function] = js.undefined
}

object IAnimationOptions {
  @scala.inline
  def apply(
    by: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: js.Function = null,
    from: java.lang.String | scala.Double = null,
    onChange: js.Function = null,
    onComplete: js.Function = null
  ): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    __obj.asInstanceOf[IAnimationOptions]
  }
}

