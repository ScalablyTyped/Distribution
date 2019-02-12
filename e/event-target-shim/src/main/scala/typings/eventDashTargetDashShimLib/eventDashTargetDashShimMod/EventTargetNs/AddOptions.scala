package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod.EventTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends RemoveOptions {
  /**
    * The flag to indicate that the listener will be removed on the first
    * event.
    */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The flag to indicate that the listener doesn't support
    * `event.preventDefault()` operation.
    */
  var passive: js.UndefOr[scala.Boolean] = js.undefined
}

