package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanyRelation extends js.Object {
  /** The primary address for this company. */
  var address: js.UndefOr[String] = js.native
  /** Whether the company is a Partner. */
  var badgeTier: js.UndefOr[String] = js.native
  /** Indicates if the user is an admin for this company. */
  var companyAdmin: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the company. There may be no id if this is a
    * pending company.5
    */
  var companyId: js.UndefOr[String] = js.native
  /**
    * The timestamp of when affiliation was requested.
    * @OutputOnly
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The internal company ID.
    * Only available for a whitelisted set of api clients.
    */
  var internalCompanyId: js.UndefOr[String] = js.native
  /** The flag that indicates if the company is pending verification. */
  var isPending: js.UndefOr[Boolean] = js.native
  /** A URL to a profile photo, e.g. a G+ profile photo. */
  var logoUrl: js.UndefOr[String] = js.native
  /** The AdWords manager account # associated this company. */
  var managerAccount: js.UndefOr[String] = js.native
  /** The name (in the company's primary language) for the company. */
  var name: js.UndefOr[String] = js.native
  /** The phone number for the company's primary address. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The primary location of the company. */
  var primaryAddress: js.UndefOr[Location] = js.native
  /** The primary country code of the company. */
  var primaryCountryCode: js.UndefOr[String] = js.native
  /** The primary language code of the company. */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /**
    * The timestamp when the user was approved.
    * @OutputOnly
    */
  var resolvedTimestamp: js.UndefOr[String] = js.native
  /** The segment the company is classified as. */
  var segment: js.UndefOr[js.Array[String]] = js.native
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.native
  /** The state of relationship, in terms of approvals. */
  var state: js.UndefOr[String] = js.native
  /** The website URL for this company. */
  var website: js.UndefOr[String] = js.native
}

object CompanyRelation {
  @scala.inline
  def apply(): CompanyRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyRelation]
  }
  @scala.inline
  implicit class CompanyRelationOps[Self <: CompanyRelation] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBadgeTier(value: String): Self = this.set("badgeTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeTier: Self = this.set("badgeTier", js.undefined)
    @scala.inline
    def setCompanyAdmin(value: Boolean): Self = this.set("companyAdmin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyAdmin: Self = this.set("companyAdmin", js.undefined)
    @scala.inline
    def setCompanyId(value: String): Self = this.set("companyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyId: Self = this.set("companyId", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setInternalCompanyId(value: String): Self = this.set("internalCompanyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalCompanyId: Self = this.set("internalCompanyId", js.undefined)
    @scala.inline
    def setIsPending(value: Boolean): Self = this.set("isPending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPending: Self = this.set("isPending", js.undefined)
    @scala.inline
    def setLogoUrl(value: String): Self = this.set("logoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoUrl: Self = this.set("logoUrl", js.undefined)
    @scala.inline
    def setManagerAccount(value: String): Self = this.set("managerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagerAccount: Self = this.set("managerAccount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPrimaryAddress(value: Location): Self = this.set("primaryAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryAddress: Self = this.set("primaryAddress", js.undefined)
    @scala.inline
    def setPrimaryCountryCode(value: String): Self = this.set("primaryCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryCountryCode: Self = this.set("primaryCountryCode", js.undefined)
    @scala.inline
    def setPrimaryLanguageCode(value: String): Self = this.set("primaryLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLanguageCode: Self = this.set("primaryLanguageCode", js.undefined)
    @scala.inline
    def setResolvedTimestamp(value: String): Self = this.set("resolvedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedTimestamp: Self = this.set("resolvedTimestamp", js.undefined)
    @scala.inline
    def setSegmentVarargs(value: String*): Self = this.set("segment", js.Array(value :_*))
    @scala.inline
    def setSegment(value: js.Array[String]): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setSpecializationStatusVarargs(value: SpecializationStatus*): Self = this.set("specializationStatus", js.Array(value :_*))
    @scala.inline
    def setSpecializationStatus(value: js.Array[SpecializationStatus]): Self = this.set("specializationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecializationStatus: Self = this.set("specializationStatus", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

