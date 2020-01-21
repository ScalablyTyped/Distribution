package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  /**
    * URL of the company's additional websites used to verify the dynamic badges.
    * These are stored as full URLs as entered by the user, but only the TLD will
    * be used for the actual verification.
    */
  var additionalWebsites: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Email domains that allow users with a matching email address to get
    * auto-approved for associating with this company.
    */
  var autoApprovalEmailDomains: js.UndefOr[js.Array[String]] = js.undefined
  /** Partner badge tier */
  var badgeTier: js.UndefOr[String] = js.undefined
  /** The list of Google Partners certification statuses for the company. */
  var certificationStatuses: js.UndefOr[js.Array[CertificationStatus]] = js.undefined
  /** Company type labels listed on the company's profile. */
  var companyTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The minimum monthly budget that the company accepts for partner business,
    * converted to the requested currency code.
    */
  var convertedMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The ID of the company. */
  var id: js.UndefOr[String] = js.undefined
  /** Industries the company can help with. */
  var industries: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of localized info for the company. */
  var localizedInfos: js.UndefOr[js.Array[LocalizedCompanyInfo]] = js.undefined
  /**
    * The list of all company locations.
    * If set, must include the
    * primary_location
    * in the list.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /** The name of the company. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The unconverted minimum monthly budget that the company accepts for partner
    * business.
    */
  var originalMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The Primary AdWords Manager Account id. */
  var primaryAdwordsManagerAccountId: js.UndefOr[String] = js.undefined
  /**
    * The primary language code of the company, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var primaryLanguageCode: js.UndefOr[String] = js.undefined
  /** The primary location of the company. */
  var primaryLocation: js.UndefOr[Location] = js.undefined
  /** The public viewability status of the company's profile. */
  var profileStatus: js.UndefOr[String] = js.undefined
  /** Basic information from the company's public profile. */
  var publicProfile: js.UndefOr[PublicProfile] = js.undefined
  /**
    * Information related to the ranking of the company within the list of
    * companies.
    */
  var ranks: js.UndefOr[js.Array[Rank]] = js.undefined
  /** Services the company can help with. */
  var services: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.undefined
  /** URL of the company's website. */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object Company {
  @scala.inline
  def apply(
    additionalWebsites: js.Array[String] = null,
    autoApprovalEmailDomains: js.Array[String] = null,
    badgeTier: String = null,
    certificationStatuses: js.Array[CertificationStatus] = null,
    companyTypes: js.Array[String] = null,
    convertedMinMonthlyBudget: Money = null,
    id: String = null,
    industries: js.Array[String] = null,
    localizedInfos: js.Array[LocalizedCompanyInfo] = null,
    locations: js.Array[Location] = null,
    name: String = null,
    originalMinMonthlyBudget: Money = null,
    primaryAdwordsManagerAccountId: String = null,
    primaryLanguageCode: String = null,
    primaryLocation: Location = null,
    profileStatus: String = null,
    publicProfile: PublicProfile = null,
    ranks: js.Array[Rank] = null,
    services: js.Array[String] = null,
    specializationStatus: js.Array[SpecializationStatus] = null,
    websiteUrl: String = null
  ): Company = {
    val __obj = js.Dynamic.literal()
    if (additionalWebsites != null) __obj.updateDynamic("additionalWebsites")(additionalWebsites.asInstanceOf[js.Any])
    if (autoApprovalEmailDomains != null) __obj.updateDynamic("autoApprovalEmailDomains")(autoApprovalEmailDomains.asInstanceOf[js.Any])
    if (badgeTier != null) __obj.updateDynamic("badgeTier")(badgeTier.asInstanceOf[js.Any])
    if (certificationStatuses != null) __obj.updateDynamic("certificationStatuses")(certificationStatuses.asInstanceOf[js.Any])
    if (companyTypes != null) __obj.updateDynamic("companyTypes")(companyTypes.asInstanceOf[js.Any])
    if (convertedMinMonthlyBudget != null) __obj.updateDynamic("convertedMinMonthlyBudget")(convertedMinMonthlyBudget.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (industries != null) __obj.updateDynamic("industries")(industries.asInstanceOf[js.Any])
    if (localizedInfos != null) __obj.updateDynamic("localizedInfos")(localizedInfos.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalMinMonthlyBudget != null) __obj.updateDynamic("originalMinMonthlyBudget")(originalMinMonthlyBudget.asInstanceOf[js.Any])
    if (primaryAdwordsManagerAccountId != null) __obj.updateDynamic("primaryAdwordsManagerAccountId")(primaryAdwordsManagerAccountId.asInstanceOf[js.Any])
    if (primaryLanguageCode != null) __obj.updateDynamic("primaryLanguageCode")(primaryLanguageCode.asInstanceOf[js.Any])
    if (primaryLocation != null) __obj.updateDynamic("primaryLocation")(primaryLocation.asInstanceOf[js.Any])
    if (profileStatus != null) __obj.updateDynamic("profileStatus")(profileStatus.asInstanceOf[js.Any])
    if (publicProfile != null) __obj.updateDynamic("publicProfile")(publicProfile.asInstanceOf[js.Any])
    if (ranks != null) __obj.updateDynamic("ranks")(ranks.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (specializationStatus != null) __obj.updateDynamic("specializationStatus")(specializationStatus.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
}

