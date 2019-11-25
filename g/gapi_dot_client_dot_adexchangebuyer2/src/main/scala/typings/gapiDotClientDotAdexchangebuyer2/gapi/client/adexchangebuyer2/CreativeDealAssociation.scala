package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeDealAssociation extends js.Object {
  /** The account the creative belongs to. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The ID of the creative associated with the deal. */
  var creativeId: js.UndefOr[String] = js.undefined
  /** The externalDealId for the deal associated with the creative. */
  var dealsId: js.UndefOr[String] = js.undefined
}

object CreativeDealAssociation {
  @scala.inline
  def apply(accountId: String = null, creativeId: String = null, dealsId: String = null): CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (dealsId != null) __obj.updateDynamic("dealsId")(dealsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeDealAssociation]
  }
}

