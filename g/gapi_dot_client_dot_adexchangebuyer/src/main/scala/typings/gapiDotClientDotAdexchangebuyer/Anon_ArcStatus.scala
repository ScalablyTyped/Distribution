package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcStatus extends js.Object {
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.undefined
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.undefined
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.undefined
}

object Anon_ArcStatus {
  @scala.inline
  def apply(arcStatus: String = null, dealId: String = null, webPropertyId: Int | Double = null): Anon_ArcStatus = {
    val __obj = js.Dynamic.literal()
    if (arcStatus != null) __obj.updateDynamic("arcStatus")(arcStatus)
    if (dealId != null) __obj.updateDynamic("dealId")(dealId)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArcStatus]
  }
}

