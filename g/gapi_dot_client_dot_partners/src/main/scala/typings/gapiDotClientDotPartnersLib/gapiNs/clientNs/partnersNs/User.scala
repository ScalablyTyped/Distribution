package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

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
  var companyVerificationEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The list of exams the user ever taken. For each type of exam, only one
               * entry is listed.
               */
  var examStatus: js.UndefOr[js.Array[ExamStatus]] = js.undefined
  /** The ID of the user. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The internal user ID.
               * Only available for a whitelisted set of api clients.
               */
  var internalId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The most recent time the user interacted with the Partners site.
               * @OutputOnly
               */
  var lastAccessTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The list of emails the user has access to/can select as primary.
               * @OutputOnly
               */
  var primaryEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The profile information of a Partners user, contains all the directly
               * editable user information.
               */
  var profile: js.UndefOr[UserProfile] = js.undefined
  /** Information about a user's external public profile outside Google Partners. */
  var publicProfile: js.UndefOr[PublicProfile] = js.undefined
}

