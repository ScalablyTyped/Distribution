package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionDraining extends js.Object {
  /** Time for which instance will be drained (not accept new connections, but still work to finish started). */
  var drainingTimeoutSec: js.UndefOr[scala.Double] = js.undefined
}

object ConnectionDraining {
  @scala.inline
  def apply(drainingTimeoutSec: scala.Int | scala.Double = null): ConnectionDraining = {
    val __obj = js.Dynamic.literal()
    if (drainingTimeoutSec != null) __obj.updateDynamic("drainingTimeoutSec")(drainingTimeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDraining]
  }
}

