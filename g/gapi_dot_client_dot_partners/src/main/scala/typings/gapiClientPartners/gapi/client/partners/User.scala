package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * This is the list of AdWords Manager Accounts the user has edit access to.
    * If the user has edit access to multiple accounts, the user can choose the
    * preferred account and we use this when a personal account is needed. Can
    * be empty meaning the user has access to no accounts.
    * @OutputOnly
    */
  var availableAdwordsManagerAccounts: js.UndefOr[js.Array[AdWordsManagerAccountInfo]] = js.native
  /**
    * The list of achieved certifications. These are calculated based on exam
    * results and other requirements.
    * @OutputOnly
    */
  var certificationStatus: js.UndefOr[js.Array[Certification]] = js.native
  /**
    * The company that the user is associated with.
    * If not present, the user is not associated with any company.
    */
  var company: js.UndefOr[CompanyRelation] = js.native
  /**
    * The email address used by the user used for company verification.
    * @OutputOnly
    */
  var companyVerificationEmail: js.UndefOr[String] = js.native
  /**
    * The list of exams the user ever taken. For each type of exam, only one
    * entry is listed.
    */
  var examStatus: js.UndefOr[js.Array[ExamStatus]] = js.native
  /** The ID of the user. */
  var id: js.UndefOr[String] = js.native
  /**
    * The internal user ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalId: js.UndefOr[String] = js.native
  /**
    * The most recent time the user interacted with the Partners site.
    * @OutputOnly
    */
  var lastAccessTime: js.UndefOr[String] = js.native
  /**
    * The list of emails the user has access to/can select as primary.
    * @OutputOnly
    */
  var primaryEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * The profile information of a Partners user, contains all the directly
    * editable user information.
    */
  var profile: js.UndefOr[UserProfile] = js.native
  /** Information about a user's external public profile outside Google Partners. */
  var publicProfile: js.UndefOr[PublicProfile] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setAvailableAdwordsManagerAccountsVarargs(value: AdWordsManagerAccountInfo*): Self = this.set("availableAdwordsManagerAccounts", js.Array(value :_*))
    @scala.inline
    def setAvailableAdwordsManagerAccounts(value: js.Array[AdWordsManagerAccountInfo]): Self = this.set("availableAdwordsManagerAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableAdwordsManagerAccounts: Self = this.set("availableAdwordsManagerAccounts", js.undefined)
    @scala.inline
    def setCertificationStatusVarargs(value: Certification*): Self = this.set("certificationStatus", js.Array(value :_*))
    @scala.inline
    def setCertificationStatus(value: js.Array[Certification]): Self = this.set("certificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificationStatus: Self = this.set("certificationStatus", js.undefined)
    @scala.inline
    def setCompany(value: CompanyRelation): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCompanyVerificationEmail(value: String): Self = this.set("companyVerificationEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyVerificationEmail: Self = this.set("companyVerificationEmail", js.undefined)
    @scala.inline
    def setExamStatusVarargs(value: ExamStatus*): Self = this.set("examStatus", js.Array(value :_*))
    @scala.inline
    def setExamStatus(value: js.Array[ExamStatus]): Self = this.set("examStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamStatus: Self = this.set("examStatus", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalId(value: String): Self = this.set("internalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalId: Self = this.set("internalId", js.undefined)
    @scala.inline
    def setLastAccessTime(value: String): Self = this.set("lastAccessTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessTime: Self = this.set("lastAccessTime", js.undefined)
    @scala.inline
    def setPrimaryEmailsVarargs(value: String*): Self = this.set("primaryEmails", js.Array(value :_*))
    @scala.inline
    def setPrimaryEmails(value: js.Array[String]): Self = this.set("primaryEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEmails: Self = this.set("primaryEmails", js.undefined)
    @scala.inline
    def setProfile(value: UserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setPublicProfile(value: PublicProfile): Self = this.set("publicProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicProfile: Self = this.set("publicProfile", js.undefined)
  }
  
}

