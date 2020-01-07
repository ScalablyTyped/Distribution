package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message captures metadata about the serving status of a deal.
  */
@js.native
trait Schema$DealServingMetadata extends js.Object {
  /**
    * Tracks which parties (if any) have paused a deal. @OutputOnly
    */
  var dealPauseStatus: js.UndefOr[Schema$DealPauseStatus] = js.native
}

object Schema$DealServingMetadata {
  @scala.inline
  def apply(dealPauseStatus: Schema$DealPauseStatus = null): Schema$DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    if (dealPauseStatus != null) __obj.updateDynamic("dealPauseStatus")(dealPauseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealServingMetadata]
  }
}

