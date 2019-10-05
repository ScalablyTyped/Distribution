package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoricalOffer extends js.Object {
  /** Client's AdWords page URL. */
  var adwordsUrl: js.UndefOr[String] = js.undefined
  /** Email address for client. */
  var clientEmail: js.UndefOr[String] = js.undefined
  /** ID of client. */
  var clientId: js.UndefOr[String] = js.undefined
  /** Name of the client. */
  var clientName: js.UndefOr[String] = js.undefined
  /** Time offer was first created. */
  var creationTime: js.UndefOr[String] = js.undefined
  /** Time this offer expires. */
  var expirationTime: js.UndefOr[String] = js.undefined
  /** Time last action was taken. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  /** Offer code. */
  var offerCode: js.UndefOr[String] = js.undefined
  /** Country Code for the offer country. */
  var offerCountryCode: js.UndefOr[String] = js.undefined
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.undefined
  /** Name (First + Last) of the partners user to whom the incentive is allocated. */
  var senderName: js.UndefOr[String] = js.undefined
  /** Status of the offer. */
  var status: js.UndefOr[String] = js.undefined
}

object HistoricalOffer {
  @scala.inline
  def apply(
    adwordsUrl: String = null,
    clientEmail: String = null,
    clientId: String = null,
    clientName: String = null,
    creationTime: String = null,
    expirationTime: String = null,
    lastModifiedTime: String = null,
    offerCode: String = null,
    offerCountryCode: String = null,
    offerType: String = null,
    senderName: String = null,
    status: String = null
  ): HistoricalOffer = {
    val __obj = js.Dynamic.literal()
    if (adwordsUrl != null) __obj.updateDynamic("adwordsUrl")(adwordsUrl)
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    if (offerCode != null) __obj.updateDynamic("offerCode")(offerCode)
    if (offerCountryCode != null) __obj.updateDynamic("offerCountryCode")(offerCountryCode)
    if (offerType != null) __obj.updateDynamic("offerType")(offerType)
    if (senderName != null) __obj.updateDynamic("senderName")(senderName)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[HistoricalOffer]
  }
}

