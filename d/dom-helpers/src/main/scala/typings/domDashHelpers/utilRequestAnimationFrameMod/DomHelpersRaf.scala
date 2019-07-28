package typings.domDashHelpers.utilRequestAnimationFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomHelpersRaf extends js.Object {
  /**
    * Returns an ID for canceling
    */
  def apply(callback: js.Function0[Unit]): Double = js.native
  def cancel(id: Double): Unit = js.native
}

