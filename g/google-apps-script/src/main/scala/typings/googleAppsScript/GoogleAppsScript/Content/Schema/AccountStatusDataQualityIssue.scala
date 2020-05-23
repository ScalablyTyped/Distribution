package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusDataQualityIssue extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var displayedValue: js.UndefOr[String] = js.undefined
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lastChecked: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var numItems: js.UndefOr[Double] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var submittedValue: js.UndefOr[String] = js.undefined
}

object AccountStatusDataQualityIssue {
  @scala.inline
  def apply(
    country: String = null,
    destination: String = null,
    detail: String = null,
    displayedValue: String = null,
    exampleItems: js.Array[AccountStatusExampleItem] = null,
    id: String = null,
    lastChecked: String = null,
    location: String = null,
    numItems: js.UndefOr[Double] = js.undefined,
    severity: String = null,
    submittedValue: String = null
  ): AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (displayedValue != null) __obj.updateDynamic("displayedValue")(displayedValue.asInstanceOf[js.Any])
    if (exampleItems != null) __obj.updateDynamic("exampleItems")(exampleItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastChecked != null) __obj.updateDynamic("lastChecked")(lastChecked.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(numItems)) __obj.updateDynamic("numItems")(numItems.get.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusDataQualityIssue]
  }
}

