package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The association between a creative and a deal.
  */
@js.native
trait Schema$CreativeDealAssociation extends js.Object {
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ID of the creative associated with the deal.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The externalDealId for the deal associated with the creative.
    */
  var dealsId: js.UndefOr[String] = js.native
}

object Schema$CreativeDealAssociation {
  @scala.inline
  def apply(accountId: String = null, creativeId: String = null, dealsId: String = null): Schema$CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (dealsId != null) __obj.updateDynamic("dealsId")(dealsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeDealAssociation]
  }
}

