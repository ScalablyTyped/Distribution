package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationOptions extends js.Object {
  /**
    *  Value to modify the property by, default: end - start
    */
  var by: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 500 (ms). Can be used to change duration of an animation.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Easing function. Default: fabric.util.ease.easeInSine
    */
  var easing: js.UndefOr[js.Function] = js.undefined
  /**
    * Allows to specify starting value of animatable property (if we don't want current value to be used).
    */
  var from: js.UndefOr[String | Double] = js.undefined
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
    by: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: js.Function = null,
    from: String | Double = null,
    onChange: js.Function = null,
    onComplete: js.Function = null
  ): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(by)) __obj.updateDynamic("by")(by.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationOptions]
  }
}

