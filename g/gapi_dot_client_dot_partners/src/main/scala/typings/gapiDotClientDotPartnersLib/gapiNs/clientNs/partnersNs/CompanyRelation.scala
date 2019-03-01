package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyRelation extends js.Object {
  /** The primary address for this company. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the company is a Partner. */
  var badgeTier: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates if the user is an admin for this company. */
  var companyAdmin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the company. There may be no id if this is a
    * pending company.5
    */
  var companyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timestamp of when affiliation was requested.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The internal company ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalCompanyId: js.UndefOr[java.lang.String] = js.undefined
  /** The flag that indicates if the company is pending verification. */
  var isPending: js.UndefOr[scala.Boolean] = js.undefined
  /** A URL to a profile photo, e.g. a G+ profile photo. */
  var logoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The AdWords manager account # associated this company. */
  var managerAccount: js.UndefOr[java.lang.String] = js.undefined
  /** The name (in the company's primary language) for the company. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The phone number for the company's primary address. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The primary location of the company. */
  var primaryAddress: js.UndefOr[Location] = js.undefined
  /** The primary country code of the company. */
  var primaryCountryCode: js.UndefOr[java.lang.String] = js.undefined
  /** The primary language code of the company. */
  var primaryLanguageCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timestamp when the user was approved.
    * @OutputOnly
    */
  var resolvedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The segment the company is classified as. */
  var segment: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.undefined
  /** The state of relationship, in terms of approvals. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** The website URL for this company. */
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object CompanyRelation {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    badgeTier: java.lang.String = null,
    companyAdmin: js.UndefOr[scala.Boolean] = js.undefined,
    companyId: java.lang.String = null,
    creationTime: java.lang.String = null,
    internalCompanyId: java.lang.String = null,
    isPending: js.UndefOr[scala.Boolean] = js.undefined,
    logoUrl: java.lang.String = null,
    managerAccount: java.lang.String = null,
    name: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    primaryAddress: Location = null,
    primaryCountryCode: java.lang.String = null,
    primaryLanguageCode: java.lang.String = null,
    resolvedTimestamp: java.lang.String = null,
    segment: js.Array[java.lang.String] = null,
    specializationStatus: js.Array[SpecializationStatus] = null,
    state: java.lang.String = null,
    website: java.lang.String = null
  ): CompanyRelation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (badgeTier != null) __obj.updateDynamic("badgeTier")(badgeTier)
    if (!js.isUndefined(companyAdmin)) __obj.updateDynamic("companyAdmin")(companyAdmin)
    if (companyId != null) __obj.updateDynamic("companyId")(companyId)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (internalCompanyId != null) __obj.updateDynamic("internalCompanyId")(internalCompanyId)
    if (!js.isUndefined(isPending)) __obj.updateDynamic("isPending")(isPending)
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl)
    if (managerAccount != null) __obj.updateDynamic("managerAccount")(managerAccount)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (primaryAddress != null) __obj.updateDynamic("primaryAddress")(primaryAddress)
    if (primaryCountryCode != null) __obj.updateDynamic("primaryCountryCode")(primaryCountryCode)
    if (primaryLanguageCode != null) __obj.updateDynamic("primaryLanguageCode")(primaryLanguageCode)
    if (resolvedTimestamp != null) __obj.updateDynamic("resolvedTimestamp")(resolvedTimestamp)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    if (specializationStatus != null) __obj.updateDynamic("specializationStatus")(specializationStatus)
    if (state != null) __obj.updateDynamic("state")(state)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[CompanyRelation]
  }
}

