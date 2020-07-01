package typings.fabric.fabricImplMod

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
  var byValue: js.UndefOr[Double] = js.undefined
  /**
    * Duration of change (in ms)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Easing function
    */
  var easing: js.UndefOr[js.Function] = js.undefined
  /**
    * Ending value
    */
  var endValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback; invoked on every value change
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Callback; invoked when value change is completed
    */
  var onComplete: js.UndefOr[js.Function] = js.undefined
  /**
    * Starting value
    */
  var startValue: js.UndefOr[Double] = js.undefined
}

object IUtilAnimationOptions {
  @scala.inline
  def apply(
    byValue: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: js.Function = null,
    endValue: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    onComplete: js.Function = null,
    startValue: js.UndefOr[Double] = js.undefined
  ): IUtilAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byValue)) __obj.updateDynamic("byValue")(byValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUtilAnimationOptions]
  }
}

