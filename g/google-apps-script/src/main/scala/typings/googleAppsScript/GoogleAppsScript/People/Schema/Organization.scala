package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var current: js.UndefOr[Boolean] = js.undefined
  var department: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[Date] = js.undefined
  var formattedType: js.UndefOr[String] = js.undefined
  var jobDescription: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phoneticName: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[Date] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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
    __obj.asInstanceOf[Organization]
  }
}

