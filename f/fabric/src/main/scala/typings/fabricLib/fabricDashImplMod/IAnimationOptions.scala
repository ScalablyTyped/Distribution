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

