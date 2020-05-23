package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilAnimation extends js.Object {
  /**
    * Changes value from one to another within certain period of time, invoking callbacks as value is being changed.
    * @param [options] Animation options
    */
  def animate(): Unit = js.native
  def animate(options: IUtilAnimationOptions): Unit = js.native
  /**
    * requestAnimationFrame polyfill based on http://paulirish.com/2011/requestanimationframe-for-smart-animating/
    * In order to get a precise start time, `requestAnimFrame` should be called as an entry into the method
    * @param callback Callback to invoke
    */
  def requestAnimFrame(callback: js.Function): Unit = js.native
}

