package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Company extends js.Object {
  /**
               * URL of the company's additional websites used to verify the dynamic badges.
               * These are stored as full URLs as entered by the user, but only the TLD will
               * be used for the actual verification.
               */
  var additionalWebsites: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Email domains that allow users with a matching email address to get
               * auto-approved for associating with this company.
               */
  var autoApprovalEmailDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Partner badge tier */
  var badgeTier: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Google Partners certification statuses for the company. */
  var certificationStatuses: js.UndefOr[js.Array[CertificationStatus]] = js.undefined
  /** Company type labels listed on the company's profile. */
  var companyTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The minimum monthly budget that the company accepts for partner business,
               * converted to the requested currency code.
               */
  var convertedMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The ID of the company. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Industries the company can help with. */
  var industries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The unconverted minimum monthly budget that the company accepts for partner
               * business.
               */
  var originalMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The Primary AdWords Manager Account id. */
  var primaryAdwordsManagerAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The primary language code of the company, as defined by
               * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
               * (IETF BCP 47, "Tags for Identifying Languages").
               */
  var primaryLanguageCode: js.UndefOr[java.lang.String] = js.undefined
  /** The primary location of the company. */
  var primaryLocation: js.UndefOr[Location] = js.undefined
  /** The public viewability status of the company's profile. */
  var profileStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Basic information from the company's public profile. */
  var publicProfile: js.UndefOr[PublicProfile] = js.undefined
  /**
               * Information related to the ranking of the company within the list of
               * companies.
               */
  var ranks: js.UndefOr[js.Array[Rank]] = js.undefined
  /** Services the company can help with. */
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.undefined
  /** URL of the company's website. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

