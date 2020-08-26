package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfile extends js.Object {
  /** The user's mailing address, contains multiple fields. */
  var address: js.UndefOr[Location] = js.native
  /**
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and it is used when a personal account is needed. Can
    * be empty.
    */
  var adwordsManagerAccount: js.UndefOr[String] = js.native
  /** A list of ids representing which channels the user selected they were in. */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /** The email address the user has selected on the Partners site as primary. */
  var emailAddress: js.UndefOr[String] = js.native
  /** The list of opt-ins for the user, related to communication preferences. */
  var emailOptIns: js.UndefOr[OptIns] = js.native
  /** The user's family name. */
  var familyName: js.UndefOr[String] = js.native
  /** The user's given name. */
  var givenName: js.UndefOr[String] = js.native
  /** A list of ids representing which industries the user selected. */
  var industries: js.UndefOr[js.Array[String]] = js.native
  /** A list of ids represnting which job categories the user selected. */
  var jobFunctions: js.UndefOr[js.Array[String]] = js.native
  /** The list of languages this user understands. */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /** A list of ids representing which markets the user was interested in. */
  var markets: js.UndefOr[js.Array[String]] = js.native
  /** The user's phone number. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The user's primary country, an ISO 2-character code. */
  var primaryCountryCode: js.UndefOr[String] = js.native
  /** Whether the user's public profile is visible to anyone with the URL. */
  var profilePublic: js.UndefOr[Boolean] = js.native
}

object UserProfile {
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  @scala.inline
  implicit class UserProfileOps[Self <: UserProfile] (val x: Self) extends AnyVal {
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
    def setAddress(value: Location): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAdwordsManagerAccount(value: String): Self = this.set("adwordsManagerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsManagerAccount: Self = this.set("adwordsManagerAccount", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setEmailOptIns(value: OptIns): Self = this.set("emailOptIns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailOptIns: Self = this.set("emailOptIns", js.undefined)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setIndustriesVarargs(value: String*): Self = this.set("industries", js.Array(value :_*))
    @scala.inline
    def setIndustries(value: js.Array[String]): Self = this.set("industries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndustries: Self = this.set("industries", js.undefined)
    @scala.inline
    def setJobFunctionsVarargs(value: String*): Self = this.set("jobFunctions", js.Array(value :_*))
    @scala.inline
    def setJobFunctions(value: js.Array[String]): Self = this.set("jobFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobFunctions: Self = this.set("jobFunctions", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setMarketsVarargs(value: String*): Self = this.set("markets", js.Array(value :_*))
    @scala.inline
    def setMarkets(value: js.Array[String]): Self = this.set("markets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkets: Self = this.set("markets", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPrimaryCountryCode(value: String): Self = this.set("primaryCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryCountryCode: Self = this.set("primaryCountryCode", js.undefined)
    @scala.inline
    def setProfilePublic(value: Boolean): Self = this.set("profilePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfilePublic: Self = this.set("profilePublic", js.undefined)
  }
  
}

