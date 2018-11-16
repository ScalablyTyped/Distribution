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

