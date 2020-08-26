package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptIns extends js.Object {
  /**
    * An opt-in about receiving email from Partners marketing teams. Includes
    * member-only events and special promotional offers for Google products.
    */
  var marketComm: js.UndefOr[Boolean] = js.native
  /**
    * An opt-in about receiving email with customized AdWords campaign management
    * tips.
    */
  var performanceSuggestions: js.UndefOr[Boolean] = js.native
  /** An opt-in to allow recieivng phone calls about their Partners account. */
  var phoneContact: js.UndefOr[Boolean] = js.native
  /** An opt-in to receive special promotional gifts and material in the mail. */
  var physicalMail: js.UndefOr[Boolean] = js.native
  /** An opt-in about receiving email regarding new features and products. */
  var specialOffers: js.UndefOr[Boolean] = js.native
}

object OptIns {
  @scala.inline
  def apply(): OptIns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptIns]
  }
  @scala.inline
  implicit class OptInsOps[Self <: OptIns] (val x: Self) extends AnyVal {
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
    def setMarketComm(value: Boolean): Self = this.set("marketComm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketComm: Self = this.set("marketComm", js.undefined)
    @scala.inline
    def setPerformanceSuggestions(value: Boolean): Self = this.set("performanceSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceSuggestions: Self = this.set("performanceSuggestions", js.undefined)
    @scala.inline
    def setPhoneContact(value: Boolean): Self = this.set("phoneContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneContact: Self = this.set("phoneContact", js.undefined)
    @scala.inline
    def setPhysicalMail(value: Boolean): Self = this.set("physicalMail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalMail: Self = this.set("physicalMail", js.undefined)
    @scala.inline
    def setSpecialOffers(value: Boolean): Self = this.set("specialOffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialOffers: Self = this.set("specialOffers", js.undefined)
  }
  
}

