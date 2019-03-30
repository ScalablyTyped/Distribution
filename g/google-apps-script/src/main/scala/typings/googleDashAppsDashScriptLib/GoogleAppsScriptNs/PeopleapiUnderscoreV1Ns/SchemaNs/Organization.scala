package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var current: js.UndefOr[scala.Boolean] = js.undefined
  var department: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var endDate: js.UndefOr[Date] = js.undefined
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var jobDescription: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var phoneticName: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[Date] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
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

