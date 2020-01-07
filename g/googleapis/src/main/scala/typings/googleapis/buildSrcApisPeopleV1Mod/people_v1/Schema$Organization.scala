package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s past or current organization. Overlapping date ranges are
  * permitted.
  */
@js.native
trait Schema$Organization extends js.Object {
  /**
    * True if the organization is the person&#39;s current organization; false
    * if the organization is a past organization.
    */
  var current: js.UndefOr[Boolean] = js.native
  /**
    * The person&#39;s department at the organization.
    */
  var department: js.UndefOr[String] = js.native
  /**
    * The domain name associated with the organization; for example,
    * `google.com`.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The end date when the person left the organization.
    */
  var endDate: js.UndefOr[Schema$Date] = js.native
  /**
    * The read-only type of the organization translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * The person&#39;s job description at the organization.
    */
  var jobDescription: js.UndefOr[String] = js.native
  /**
    * The location of the organization office the person works at.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Metadata about the organization.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The name of the organization.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phonetic name of the organization.
    */
  var phoneticName: js.UndefOr[String] = js.native
  /**
    * The start date when the person joined the organization.
    */
  var startDate: js.UndefOr[Schema$Date] = js.native
  /**
    * The symbol associated with the organization; for example, a stock ticker
    * symbol, abbreviation, or acronym.
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * The person&#39;s job title at the organization.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of the organization. The type can be custom or  one of these
    * predefined values:  * `work` * `school`
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Organization {
  @scala.inline
  def apply(
    current: js.UndefOr[Boolean] = js.undefined,
    department: String = null,
    domain: String = null,
    endDate: Schema$Date = null,
    formattedType: String = null,
    jobDescription: String = null,
    location: String = null,
    metadata: Schema$FieldMetadata = null,
    name: String = null,
    phoneticName: String = null,
    startDate: Schema$Date = null,
    symbol: String = null,
    title: String = null,
    `type`: String = null
  ): Schema$Organization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Schema$Organization]
  }
}

