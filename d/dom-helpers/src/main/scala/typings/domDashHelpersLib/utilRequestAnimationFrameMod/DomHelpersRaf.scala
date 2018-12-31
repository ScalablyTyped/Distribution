package typings
package domDashHelpersLib.utilRequestAnimationFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomHelpersRaf extends js.Object {
  /**
    * Returns an ID for canceling
    */
  def apply(callback: js.Function0[scala.Unit]): scala.Double = js.native
  def cancel(id: scala.Double): scala.Unit = js.native
}

