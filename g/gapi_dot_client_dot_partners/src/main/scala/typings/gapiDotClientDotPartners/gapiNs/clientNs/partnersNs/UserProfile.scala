package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /** The user's mailing address, contains multiple fields. */
  var address: js.UndefOr[Location] = js.undefined
  /**
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and it is used when a personal account is needed. Can
    * be empty.
    */
  var adwordsManagerAccount: js.UndefOr[String] = js.undefined
  /** A list of ids representing which channels the user selected they were in. */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  /** The email address the user has selected on the Partners site as primary. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /** The list of opt-ins for the user, related to communication preferences. */
  var emailOptIns: js.UndefOr[OptIns] = js.undefined
  /** The user's family name. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The user's given name. */
  var givenName: js.UndefOr[String] = js.undefined
  /** A list of ids representing which industries the user selected. */
  var industries: js.UndefOr[js.Array[String]] = js.undefined
  /** A list of ids represnting which job categories the user selected. */
  var jobFunctions: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of languages this user understands. */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  /** A list of ids representing which markets the user was interested in. */
  var markets: js.UndefOr[js.Array[String]] = js.undefined
  /** The user's phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The user's primary country, an ISO 2-character code. */
  var primaryCountryCode: js.UndefOr[String] = js.undefined
  /** Whether the user's public profile is visible to anyone with the URL. */
  var profilePublic: js.UndefOr[Boolean] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    address: Location = null,
    adwordsManagerAccount: String = null,
    channels: js.Array[String] = null,
    emailAddress: String = null,
    emailOptIns: OptIns = null,
    familyName: String = null,
    givenName: String = null,
    industries: js.Array[String] = null,
    jobFunctions: js.Array[String] = null,
    languages: js.Array[String] = null,
    markets: js.Array[String] = null,
    phoneNumber: String = null,
    primaryCountryCode: String = null,
    profilePublic: js.UndefOr[Boolean] = js.undefined
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (adwordsManagerAccount != null) __obj.updateDynamic("adwordsManagerAccount")(adwordsManagerAccount)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (emailOptIns != null) __obj.updateDynamic("emailOptIns")(emailOptIns)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (industries != null) __obj.updateDynamic("industries")(industries)
    if (jobFunctions != null) __obj.updateDynamic("jobFunctions")(jobFunctions)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (markets != null) __obj.updateDynamic("markets")(markets)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (primaryCountryCode != null) __obj.updateDynamic("primaryCountryCode")(primaryCountryCode)
    if (!js.isUndefined(profilePublic)) __obj.updateDynamic("profilePublic")(profilePublic)
    __obj.asInstanceOf[UserProfile]
  }
}

