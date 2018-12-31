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

