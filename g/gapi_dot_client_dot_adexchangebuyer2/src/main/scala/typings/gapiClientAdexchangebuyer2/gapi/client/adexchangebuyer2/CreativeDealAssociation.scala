package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeDealAssociation extends js.Object {
  /** The account the creative belongs to. */
  var accountId: js.UndefOr[String] = js.native
  /** The ID of the creative associated with the deal. */
  var creativeId: js.UndefOr[String] = js.native
  /** The externalDealId for the deal associated with the creative. */
  var dealsId: js.UndefOr[String] = js.native
}

object CreativeDealAssociation {
  @scala.inline
  def apply(): CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealAssociation]
  }
  @scala.inline
  implicit class CreativeDealAssociationOps[Self <: CreativeDealAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setDealsId(value: String): Self = this.set("dealsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealsId: Self = this.set("dealsId", js.undefined)
  }
  
}

