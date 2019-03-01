package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lead extends js.Object {
  /** The AdWords Customer ID of the lead. */
  var adwordsCustomerId: js.UndefOr[java.lang.String] = js.undefined
  /** Comments lead source gave. */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp of when this lead was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Email address of lead source. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Last name of lead source. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** First name of lead source. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** List of reasons for using Google Partner Search and creating a lead. */
  var gpsMotivations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** ID of the lead. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Language code of the lead's language preference, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not the lead signed up for marketing emails */
  var marketingOptIn: js.UndefOr[scala.Boolean] = js.undefined
  /** The minimum monthly budget lead source is willing to spend. */
  var minMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** Phone number of lead source. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The lead's state in relation to the company. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Type of lead. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Website URL of lead source. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Lead {
  @scala.inline
  def apply(
    adwordsCustomerId: java.lang.String = null,
    comments: java.lang.String = null,
    createTime: java.lang.String = null,
    email: java.lang.String = null,
    familyName: java.lang.String = null,
    givenName: java.lang.String = null,
    gpsMotivations: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    languageCode: java.lang.String = null,
    marketingOptIn: js.UndefOr[scala.Boolean] = js.undefined,
    minMonthlyBudget: Money = null,
    phoneNumber: java.lang.String = null,
    state: java.lang.String = null,
    `type`: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): Lead = {
    val __obj = js.Dynamic.literal()
    if (adwordsCustomerId != null) __obj.updateDynamic("adwordsCustomerId")(adwordsCustomerId)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (email != null) __obj.updateDynamic("email")(email)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (gpsMotivations != null) __obj.updateDynamic("gpsMotivations")(gpsMotivations)
    if (id != null) __obj.updateDynamic("id")(id)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (!js.isUndefined(marketingOptIn)) __obj.updateDynamic("marketingOptIn")(marketingOptIn)
    if (minMonthlyBudget != null) __obj.updateDynamic("minMonthlyBudget")(minMonthlyBudget)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (state != null) __obj.updateDynamic("state")(state)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[Lead]
  }
}

