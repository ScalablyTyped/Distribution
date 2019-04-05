package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusDataQualityIssue extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var displayedValue: js.UndefOr[java.lang.String] = js.undefined
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastChecked: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var numItems: js.UndefOr[scala.Double] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var submittedValue: js.UndefOr[java.lang.String] = js.undefined
}

object AccountStatusDataQualityIssue {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    destination: java.lang.String = null,
    detail: java.lang.String = null,
    displayedValue: java.lang.String = null,
    exampleItems: js.Array[AccountStatusExampleItem] = null,
    id: java.lang.String = null,
    lastChecked: java.lang.String = null,
    location: java.lang.String = null,
    numItems: scala.Int | scala.Double = null,
    severity: java.lang.String = null,
    submittedValue: java.lang.String = null
  ): AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (displayedValue != null) __obj.updateDynamic("displayedValue")(displayedValue)
    if (exampleItems != null) __obj.updateDynamic("exampleItems")(exampleItems)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastChecked != null) __obj.updateDynamic("lastChecked")(lastChecked)
    if (location != null) __obj.updateDynamic("location")(location)
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue)
    __obj.asInstanceOf[AccountStatusDataQualityIssue]
  }
}

