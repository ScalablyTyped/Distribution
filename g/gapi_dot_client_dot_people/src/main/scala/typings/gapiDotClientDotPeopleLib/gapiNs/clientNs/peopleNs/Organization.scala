package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  /**
    * True if the organization is the person's current organization;
    * false if the organization is a past organization.
    */
  var current: js.UndefOr[scala.Boolean] = js.undefined
  /** The person's department at the organization. */
  var department: js.UndefOr[java.lang.String] = js.undefined
  /** The domain name associated with the organization; for example, `google.com`. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** The end date when the person left the organization. */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * The read-only type of the organization translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /** The person's job description at the organization. */
  var jobDescription: js.UndefOr[java.lang.String] = js.undefined
  /** The location of the organization office the person works at. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the organization. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The phonetic name of the organization. */
  var phoneticName: js.UndefOr[java.lang.String] = js.undefined
  /** The start date when the person joined the organization. */
  var startDate: js.UndefOr[Date] = js.undefined
  /**
    * The symbol associated with the organization; for example, a stock ticker
    * symbol, abbreviation, or acronym.
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /** The person's job title at the organization. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the organization. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `work`
    * &#42; `school`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    current: js.UndefOr[scala.Boolean] = js.undefined,
    department: java.lang.String = null,
    domain: java.lang.String = null,
    endDate: Date = null,
    formattedType: java.lang.String = null,
    jobDescription: java.lang.String = null,
    location: java.lang.String = null,
    metadata: FieldMetadata = null,
    name: java.lang.String = null,
    phoneticName: java.lang.String = null,
    startDate: Date = null,
    symbol: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (department != null) __obj.updateDynamic("department")(department)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (jobDescription != null) __obj.updateDynamic("jobDescription")(jobDescription)
    if (location != null) __obj.updateDynamic("location")(location)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phoneticName != null) __obj.updateDynamic("phoneticName")(phoneticName)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Organization]
  }
}

