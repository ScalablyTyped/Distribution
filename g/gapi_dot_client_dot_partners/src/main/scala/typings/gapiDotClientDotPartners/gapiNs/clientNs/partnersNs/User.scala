package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * This is the list of AdWords Manager Accounts the user has edit access to.
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and we use this when a personal account is needed. Can
    * be empty meaning the user has access to no accounts.
    * @OutputOnly
    */
  var availableAdwordsManagerAccounts: js.UndefOr[js.Array[AdWordsManagerAccountInfo]] = js.undefined
  /**
    * The list of achieved certifications. These are calculated based on exam
    * results and other requirements.
    * @OutputOnly
    */
  var certificationStatus: js.UndefOr[js.Array[Certification]] = js.undefined
  /**
    * The company that the user is associated with.
    * If not present, the user is not associated with any company.
    */
  var company: js.UndefOr[CompanyRelation] = js.undefined
  /**
    * The email address used by the user used for company verification.
    * @OutputOnly
    */
  var companyVerificationEmail: js.UndefOr[String] = js.undefined
  /**
    * The list of exams the user ever taken. For each type of exam, only one
    * entry is listed.
    */
  var examStatus: js.UndefOr[js.Array[ExamStatus]] = js.undefined
  /** The ID of the user. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The internal user ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalId: js.UndefOr[String] = js.undefined
  /**
    * The most recent time the user interacted with the Partners site.
    * @OutputOnly
    */
  var lastAccessTime: js.UndefOr[String] = js.undefined
  /**
    * The list of emails the user has access to/can select as primary.
    * @OutputOnly
    */
  var primaryEmails: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The profile information of a Partners user, contains all the directly
    * editable user information.
    */
  var profile: js.UndefOr[UserProfile] = js.undefined
  /** Information about a user's external public profile outside Google Partners. */
  var publicProfile: js.UndefOr[PublicProfile] = js.undefined
}

object User {
  @scala.inline
  def apply(
    availableAdwordsManagerAccounts: js.Array[AdWordsManagerAccountInfo] = null,
    certificationStatus: js.Array[Certification] = null,
    company: CompanyRelation = null,
    companyVerificationEmail: String = null,
    examStatus: js.Array[ExamStatus] = null,
    id: String = null,
    internalId: String = null,
    lastAccessTime: String = null,
    primaryEmails: js.Array[String] = null,
    profile: UserProfile = null,
    publicProfile: PublicProfile = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (availableAdwordsManagerAccounts != null) __obj.updateDynamic("availableAdwordsManagerAccounts")(availableAdwordsManagerAccounts)
    if (certificationStatus != null) __obj.updateDynamic("certificationStatus")(certificationStatus)
    if (company != null) __obj.updateDynamic("company")(company)
    if (companyVerificationEmail != null) __obj.updateDynamic("companyVerificationEmail")(companyVerificationEmail)
    if (examStatus != null) __obj.updateDynamic("examStatus")(examStatus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalId != null) __obj.updateDynamic("internalId")(internalId)
    if (lastAccessTime != null) __obj.updateDynamic("lastAccessTime")(lastAccessTime)
    if (primaryEmails != null) __obj.updateDynamic("primaryEmails")(primaryEmails)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (publicProfile != null) __obj.updateDynamic("publicProfile")(publicProfile)
    __obj.asInstanceOf[User]
  }
}

