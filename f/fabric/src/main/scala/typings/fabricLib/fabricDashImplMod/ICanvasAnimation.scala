package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// animation mixin
// ----------------------------------------------------
@js.native
trait ICanvasAnimation[T] extends js.Object {
  var FX_DURATION: scala.Double = js.native
  /**
  	 * Centers object horizontally with animation.
  	 * @param object Object to center
  	 */
  def fxCenterObjectH(`object`: js.Object): T = js.native
  /**
  	 * Centers object horizontally with animation.
  	 * @param object Object to center
  	 */
  def fxCenterObjectH(`object`: js.Object, callbacks: Callbacks): T = js.native
  /**
  	 * Centers object vertically with animation.
  	 * @param object Object to center
  	 */
  def fxCenterObjectV(`object`: js.Object): T = js.native
  /**
  	 * Centers object vertically with animation.
  	 * @param object Object to center
  	 */
  def fxCenterObjectV(`object`: js.Object, callbacks: Callbacks): T = js.native
  /**
  	 * Same as `fabric.Canvas#remove` but animated
  	 * @param object Object to remove
  	 * @chainable
  	 */
  def fxRemove(`object`: js.Object): T = js.native
}

