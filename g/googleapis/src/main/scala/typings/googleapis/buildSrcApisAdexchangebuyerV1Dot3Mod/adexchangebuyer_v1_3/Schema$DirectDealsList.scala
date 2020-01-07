package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A direct deals feed lists Direct Deals the Ad Exchange buyer account has
  * access to. This includes direct deals set up for the buyer account as well
  * as its merged stream seats.
  */
@js.native
trait Schema$DirectDealsList extends js.Object {
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[Schema$DirectDeal]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DirectDealsList {
  @scala.inline
  def apply(directDeals: js.Array[Schema$DirectDeal] = null, kind: String = null): Schema$DirectDealsList = {
    val __obj = js.Dynamic.literal()
    if (directDeals != null) __obj.updateDynamic("directDeals")(directDeals.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectDealsList]
  }
}

