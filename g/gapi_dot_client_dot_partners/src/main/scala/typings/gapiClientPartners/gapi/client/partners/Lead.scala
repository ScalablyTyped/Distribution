package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lead extends js.Object {
  /** The AdWords Customer ID of the lead. */
  var adwordsCustomerId: js.UndefOr[String] = js.undefined
  /** Comments lead source gave. */
  var comments: js.UndefOr[String] = js.undefined
  /** Timestamp of when this lead was created. */
  var createTime: js.UndefOr[String] = js.undefined
  /** Email address of lead source. */
  var email: js.UndefOr[String] = js.undefined
  /** Last name of lead source. */
  var familyName: js.UndefOr[String] = js.undefined
  /** First name of lead source. */
  var givenName: js.UndefOr[String] = js.undefined
  /** List of reasons for using Google Partner Search and creating a lead. */
  var gpsMotivations: js.UndefOr[js.Array[String]] = js.undefined
  /** ID of the lead. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Language code of the lead's language preference, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Whether or not the lead signed up for marketing emails */
  var marketingOptIn: js.UndefOr[Boolean] = js.undefined
  /** The minimum monthly budget lead source is willing to spend. */
  var minMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** Phone number of lead source. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The lead's state in relation to the company. */
  var state: js.UndefOr[String] = js.undefined
  /** Type of lead. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Website URL of lead source. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Lead {
  @scala.inline
  def apply(
    adwordsCustomerId: String = null,
    comments: String = null,
    createTime: String = null,
    email: String = null,
    familyName: String = null,
    givenName: String = null,
    gpsMotivations: js.Array[String] = null,
    id: String = null,
    languageCode: String = null,
    marketingOptIn: js.UndefOr[Boolean] = js.undefined,
    minMonthlyBudget: Money = null,
    phoneNumber: String = null,
    state: String = null,
    `type`: String = null,
    websiteUrl: String = null
  ): Lead = {
    val __obj = js.Dynamic.literal()
    if (adwordsCustomerId != null) __obj.updateDynamic("adwordsCustomerId")(adwordsCustomerId.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (gpsMotivations != null) __obj.updateDynamic("gpsMotivations")(gpsMotivations.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(marketingOptIn)) __obj.updateDynamic("marketingOptIn")(marketingOptIn.get.asInstanceOf[js.Any])
    if (minMonthlyBudget != null) __obj.updateDynamic("minMonthlyBudget")(minMonthlyBudget.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lead]
  }
}

