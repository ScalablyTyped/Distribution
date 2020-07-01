package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing connection draining configuration.
  */
@js.native
trait SchemaConnectionDraining extends js.Object {
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaConnectionDraining {
  @scala.inline
  def apply(drainingTimeoutSec: js.UndefOr[Double] = js.undefined): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drainingTimeoutSec)) __obj.updateDynamic("drainingTimeoutSec")(drainingTimeoutSec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
}

