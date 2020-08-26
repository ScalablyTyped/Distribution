package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalOffer extends js.Object {
  /** Client's AdWords page URL. */
  var adwordsUrl: js.UndefOr[String] = js.native
  /** Email address for client. */
  var clientEmail: js.UndefOr[String] = js.native
  /** ID of client. */
  var clientId: js.UndefOr[String] = js.native
  /** Name of the client. */
  var clientName: js.UndefOr[String] = js.native
  /** Time offer was first created. */
  var creationTime: js.UndefOr[String] = js.native
  /** Time this offer expires. */
  var expirationTime: js.UndefOr[String] = js.native
  /** Time last action was taken. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** Offer code. */
  var offerCode: js.UndefOr[String] = js.native
  /** Country Code for the offer country. */
  var offerCountryCode: js.UndefOr[String] = js.native
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.native
  /** Name (First + Last) of the partners user to whom the incentive is allocated. */
  var senderName: js.UndefOr[String] = js.native
  /** Status of the offer. */
  var status: js.UndefOr[String] = js.native
}

object HistoricalOffer {
  @scala.inline
  def apply(): HistoricalOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalOffer]
  }
  @scala.inline
  implicit class HistoricalOfferOps[Self <: HistoricalOffer] (val x: Self) extends AnyVal {
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
    def setAdwordsUrl(value: String): Self = this.set("adwordsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsUrl: Self = this.set("adwordsUrl", js.undefined)
    @scala.inline
    def setClientEmail(value: String): Self = this.set("clientEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientEmail: Self = this.set("clientEmail", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setOfferCode(value: String): Self = this.set("offerCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferCode: Self = this.set("offerCode", js.undefined)
    @scala.inline
    def setOfferCountryCode(value: String): Self = this.set("offerCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferCountryCode: Self = this.set("offerCountryCode", js.undefined)
    @scala.inline
    def setOfferType(value: String): Self = this.set("offerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferType: Self = this.set("offerType", js.undefined)
    @scala.inline
    def setSenderName(value: String): Self = this.set("senderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderName: Self = this.set("senderName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

