package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionDraining extends js.Object {
  /** Time for which instance will be drained (not accept new connections, but still work to finish started). */
  var drainingTimeoutSec: js.UndefOr[Double] = js.undefined
}

object ConnectionDraining {
  @scala.inline
  def apply(drainingTimeoutSec: Int | Double = null): ConnectionDraining = {
    val __obj = js.Dynamic.literal()
    if (drainingTimeoutSec != null) __obj.updateDynamic("drainingTimeoutSec")(drainingTimeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDraining]
  }
}

