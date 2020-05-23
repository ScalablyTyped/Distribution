package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  /**
    * True if the organization is the person's current organization;
    * false if the organization is a past organization.
    */
  var current: js.UndefOr[Boolean] = js.undefined
  /** The person's department at the organization. */
  var department: js.UndefOr[String] = js.undefined
  /**
    * The domain name associated with the organization; for example,
    * `google.com`.
    */
  var domain: js.UndefOr[String] = js.undefined
  /** The end date when the person left the organization. */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * Output only. The type of the organization translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** The person's job description at the organization. */
  var jobDescription: js.UndefOr[String] = js.undefined
  /** The location of the organization office the person works at. */
  var location: js.UndefOr[String] = js.undefined
  /** Metadata about the organization. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.undefined
  /** The phonetic name of the organization. */
  var phoneticName: js.UndefOr[String] = js.undefined
  /** The start date when the person joined the organization. */
  var startDate: js.UndefOr[Date] = js.undefined
  /**
    * The symbol associated with the organization; for example, a stock ticker
    * symbol, abbreviation, or acronym.
    */
  var symbol: js.UndefOr[String] = js.undefined
  /** The person's job title at the organization. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of the organization. The type can be custom or  one of these
    * predefined values:
    *
    * &#42; `work`
    * &#42; `school`
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    current: js.UndefOr[Boolean] = js.undefined,
    department: String = null,
    domain: String = null,
    endDate: Date = null,
    formattedType: String = null,
    jobDescription: String = null,
    location: String = null,
    metadata: FieldMetadata = null,
    name: String = null,
    phoneticName: String = null,
    startDate: Date = null,
    symbol: String = null,
    title: String = null,
    `type`: String = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (jobDescription != null) __obj.updateDynamic("jobDescription")(jobDescription.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phoneticName != null) __obj.updateDynamic("phoneticName")(phoneticName.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

