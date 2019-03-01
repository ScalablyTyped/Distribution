package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoricalOffer extends js.Object {
  /** Client's AdWords page URL. */
  var adwordsUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Email address for client. */
  var clientEmail: js.UndefOr[java.lang.String] = js.undefined
  /** ID of client. */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the client. */
  var clientName: js.UndefOr[java.lang.String] = js.undefined
  /** Time offer was first created. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** Time this offer expires. */
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  /** Time last action was taken. */
  var lastModifiedTime: js.UndefOr[java.lang.String] = js.undefined
  /** Offer code. */
  var offerCode: js.UndefOr[java.lang.String] = js.undefined
  /** Country Code for the offer country. */
  var offerCountryCode: js.UndefOr[java.lang.String] = js.undefined
  /** Type of offer. */
  var offerType: js.UndefOr[java.lang.String] = js.undefined
  /** Name (First + Last) of the partners user to whom the incentive is allocated. */
  var senderName: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the offer. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object HistoricalOffer {
  @scala.inline
  def apply(
    adwordsUrl: java.lang.String = null,
    clientEmail: java.lang.String = null,
    clientId: java.lang.String = null,
    clientName: java.lang.String = null,
    creationTime: java.lang.String = null,
    expirationTime: java.lang.String = null,
    lastModifiedTime: java.lang.String = null,
    offerCode: java.lang.String = null,
    offerCountryCode: java.lang.String = null,
    offerType: java.lang.String = null,
    senderName: java.lang.String = null,
    status: java.lang.String = null
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

