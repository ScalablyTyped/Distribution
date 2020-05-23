package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcStatus extends js.Object {
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.undefined
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.undefined
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.undefined
}

object ArcStatus {
  @scala.inline
  def apply(arcStatus: String = null, dealId: String = null, webPropertyId: js.UndefOr[Double] = js.undefined): ArcStatus = {
    val __obj = js.Dynamic.literal()
    if (arcStatus != null) __obj.updateDynamic("arcStatus")(arcStatus.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (!js.isUndefined(webPropertyId)) __obj.updateDynamic("webPropertyId")(webPropertyId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcStatus]
  }
}

