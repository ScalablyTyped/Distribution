package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyRelation extends js.Object {
  /** The primary address for this company. */
  var address: js.UndefOr[String] = js.undefined
  /** Whether the company is a Partner. */
  var badgeTier: js.UndefOr[String] = js.undefined
  /** Indicates if the user is an admin for this company. */
  var companyAdmin: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the company. There may be no id if this is a
    * pending company.5
    */
  var companyId: js.UndefOr[String] = js.undefined
  /**
    * The timestamp of when affiliation was requested.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * The internal company ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalCompanyId: js.UndefOr[String] = js.undefined
  /** The flag that indicates if the company is pending verification. */
  var isPending: js.UndefOr[Boolean] = js.undefined
  /** A URL to a profile photo, e.g. a G+ profile photo. */
  var logoUrl: js.UndefOr[String] = js.undefined
  /** The AdWords manager account # associated this company. */
  var managerAccount: js.UndefOr[String] = js.undefined
  /** The name (in the company's primary language) for the company. */
  var name: js.UndefOr[String] = js.undefined
  /** The phone number for the company's primary address. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The primary location of the company. */
  var primaryAddress: js.UndefOr[Location] = js.undefined
  /** The primary country code of the company. */
  var primaryCountryCode: js.UndefOr[String] = js.undefined
  /** The primary language code of the company. */
  var primaryLanguageCode: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the user was approved.
    * @OutputOnly
    */
  var resolvedTimestamp: js.UndefOr[String] = js.undefined
  /** The segment the company is classified as. */
  var segment: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.undefined
  /** The state of relationship, in terms of approvals. */
  var state: js.UndefOr[String] = js.undefined
  /** The website URL for this company. */
  var website: js.UndefOr[String] = js.undefined
}

object CompanyRelation {
  @scala.inline
  def apply(
    address: String = null,
    badgeTier: String = null,
    companyAdmin: js.UndefOr[Boolean] = js.undefined,
    companyId: String = null,
    creationTime: String = null,
    internalCompanyId: String = null,
    isPending: js.UndefOr[Boolean] = js.undefined,
    logoUrl: String = null,
    managerAccount: String = null,
    name: String = null,
    phoneNumber: String = null,
    primaryAddress: Location = null,
    primaryCountryCode: String = null,
    primaryLanguageCode: String = null,
    resolvedTimestamp: String = null,
    segment: js.Array[String] = null,
    specializationStatus: js.Array[SpecializationStatus] = null,
    state: String = null,
    website: String = null
  ): CompanyRelation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (badgeTier != null) __obj.updateDynamic("badgeTier")(badgeTier.asInstanceOf[js.Any])
    if (!js.isUndefined(companyAdmin)) __obj.updateDynamic("companyAdmin")(companyAdmin.asInstanceOf[js.Any])
    if (companyId != null) __obj.updateDynamic("companyId")(companyId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (internalCompanyId != null) __obj.updateDynamic("internalCompanyId")(internalCompanyId.asInstanceOf[js.Any])
    if (!js.isUndefined(isPending)) __obj.updateDynamic("isPending")(isPending.asInstanceOf[js.Any])
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl.asInstanceOf[js.Any])
    if (managerAccount != null) __obj.updateDynamic("managerAccount")(managerAccount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (primaryAddress != null) __obj.updateDynamic("primaryAddress")(primaryAddress.asInstanceOf[js.Any])
    if (primaryCountryCode != null) __obj.updateDynamic("primaryCountryCode")(primaryCountryCode.asInstanceOf[js.Any])
    if (primaryLanguageCode != null) __obj.updateDynamic("primaryLanguageCode")(primaryLanguageCode.asInstanceOf[js.Any])
    if (resolvedTimestamp != null) __obj.updateDynamic("resolvedTimestamp")(resolvedTimestamp.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (specializationStatus != null) __obj.updateDynamic("specializationStatus")(specializationStatus.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanyRelation]
  }
}

