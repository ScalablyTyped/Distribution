package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing connection draining configuration.
  */
@js.native
trait Schema$ConnectionDraining extends js.Object {
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.native
}

object Schema$ConnectionDraining {
  @scala.inline
  def apply(drainingTimeoutSec: Int | Double = null): Schema$ConnectionDraining = {
    val __obj = js.Dynamic.literal()
    if (drainingTimeoutSec != null) __obj.updateDynamic("drainingTimeoutSec")(drainingTimeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConnectionDraining]
  }
}

