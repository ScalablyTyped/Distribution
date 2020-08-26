package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  /**
    * URL of the company's additional websites used to verify the dynamic badges.
    * These are stored as full URLs as entered by the user, but only the TLD will
    * be used for the actual verification.
    */
  var additionalWebsites: js.UndefOr[js.Array[String]] = js.native
  /**
    * Email domains that allow users with a matching email address to get
    * auto-approved for associating with this company.
    */
  var autoApprovalEmailDomains: js.UndefOr[js.Array[String]] = js.native
  /** Partner badge tier */
  var badgeTier: js.UndefOr[String] = js.native
  /** The list of Google Partners certification statuses for the company. */
  var certificationStatuses: js.UndefOr[js.Array[CertificationStatus]] = js.native
  /** Company type labels listed on the company's profile. */
  var companyTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The minimum monthly budget that the company accepts for partner business,
    * converted to the requested currency code.
    */
  var convertedMinMonthlyBudget: js.UndefOr[Money] = js.native
  /** The ID of the company. */
  var id: js.UndefOr[String] = js.native
  /** Industries the company can help with. */
  var industries: js.UndefOr[js.Array[String]] = js.native
  /** The list of localized info for the company. */
  var localizedInfos: js.UndefOr[js.Array[LocalizedCompanyInfo]] = js.native
  /**
    * The list of all company locations.
    * If set, must include the
    * primary_location
    * in the list.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  /** The name of the company. */
  var name: js.UndefOr[String] = js.native
  /**
    * The unconverted minimum monthly budget that the company accepts for partner
    * business.
    */
  var originalMinMonthlyBudget: js.UndefOr[Money] = js.native
  /** The Primary AdWords Manager Account id. */
  var primaryAdwordsManagerAccountId: js.UndefOr[String] = js.native
  /**
    * The primary language code of the company, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /** The primary location of the company. */
  var primaryLocation: js.UndefOr[Location] = js.native
  /** The public viewability status of the company's profile. */
  var profileStatus: js.UndefOr[String] = js.native
  /** Basic information from the company's public profile. */
  var publicProfile: js.UndefOr[PublicProfile] = js.native
  /**
    * Information related to the ranking of the company within the list of
    * companies.
    */
  var ranks: js.UndefOr[js.Array[Rank]] = js.native
  /** Services the company can help with. */
  var services: js.UndefOr[js.Array[String]] = js.native
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.native
  /** URL of the company's website. */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Company {
  @scala.inline
  def apply(): Company = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
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
    def setAdditionalWebsitesVarargs(value: String*): Self = this.set("additionalWebsites", js.Array(value :_*))
    @scala.inline
    def setAdditionalWebsites(value: js.Array[String]): Self = this.set("additionalWebsites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalWebsites: Self = this.set("additionalWebsites", js.undefined)
    @scala.inline
    def setAutoApprovalEmailDomainsVarargs(value: String*): Self = this.set("autoApprovalEmailDomains", js.Array(value :_*))
    @scala.inline
    def setAutoApprovalEmailDomains(value: js.Array[String]): Self = this.set("autoApprovalEmailDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApprovalEmailDomains: Self = this.set("autoApprovalEmailDomains", js.undefined)
    @scala.inline
    def setBadgeTier(value: String): Self = this.set("badgeTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeTier: Self = this.set("badgeTier", js.undefined)
    @scala.inline
    def setCertificationStatusesVarargs(value: CertificationStatus*): Self = this.set("certificationStatuses", js.Array(value :_*))
    @scala.inline
    def setCertificationStatuses(value: js.Array[CertificationStatus]): Self = this.set("certificationStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificationStatuses: Self = this.set("certificationStatuses", js.undefined)
    @scala.inline
    def setCompanyTypesVarargs(value: String*): Self = this.set("companyTypes", js.Array(value :_*))
    @scala.inline
    def setCompanyTypes(value: js.Array[String]): Self = this.set("companyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyTypes: Self = this.set("companyTypes", js.undefined)
    @scala.inline
    def setConvertedMinMonthlyBudget(value: Money): Self = this.set("convertedMinMonthlyBudget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertedMinMonthlyBudget: Self = this.set("convertedMinMonthlyBudget", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndustriesVarargs(value: String*): Self = this.set("industries", js.Array(value :_*))
    @scala.inline
    def setIndustries(value: js.Array[String]): Self = this.set("industries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndustries: Self = this.set("industries", js.undefined)
    @scala.inline
    def setLocalizedInfosVarargs(value: LocalizedCompanyInfo*): Self = this.set("localizedInfos", js.Array(value :_*))
    @scala.inline
    def setLocalizedInfos(value: js.Array[LocalizedCompanyInfo]): Self = this.set("localizedInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedInfos: Self = this.set("localizedInfos", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalMinMonthlyBudget(value: Money): Self = this.set("originalMinMonthlyBudget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalMinMonthlyBudget: Self = this.set("originalMinMonthlyBudget", js.undefined)
    @scala.inline
    def setPrimaryAdwordsManagerAccountId(value: String): Self = this.set("primaryAdwordsManagerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryAdwordsManagerAccountId: Self = this.set("primaryAdwordsManagerAccountId", js.undefined)
    @scala.inline
    def setPrimaryLanguageCode(value: String): Self = this.set("primaryLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLanguageCode: Self = this.set("primaryLanguageCode", js.undefined)
    @scala.inline
    def setPrimaryLocation(value: Location): Self = this.set("primaryLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLocation: Self = this.set("primaryLocation", js.undefined)
    @scala.inline
    def setProfileStatus(value: String): Self = this.set("profileStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileStatus: Self = this.set("profileStatus", js.undefined)
    @scala.inline
    def setPublicProfile(value: PublicProfile): Self = this.set("publicProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicProfile: Self = this.set("publicProfile", js.undefined)
    @scala.inline
    def setRanksVarargs(value: Rank*): Self = this.set("ranks", js.Array(value :_*))
    @scala.inline
    def setRanks(value: js.Array[Rank]): Self = this.set("ranks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanks: Self = this.set("ranks", js.undefined)
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setSpecializationStatusVarargs(value: SpecializationStatus*): Self = this.set("specializationStatus", js.Array(value :_*))
    @scala.inline
    def setSpecializationStatus(value: js.Array[SpecializationStatus]): Self = this.set("specializationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecializationStatus: Self = this.set("specializationStatus", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

