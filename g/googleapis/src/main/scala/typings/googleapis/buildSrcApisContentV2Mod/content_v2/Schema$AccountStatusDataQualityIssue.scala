package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountStatusDataQualityIssue extends js.Object {
  var country: js.UndefOr[String] = js.native
  var destination: js.UndefOr[String] = js.native
  var detail: js.UndefOr[String] = js.native
  var displayedValue: js.UndefOr[String] = js.native
  var exampleItems: js.UndefOr[js.Array[Schema$AccountStatusExampleItem]] = js.native
  var id: js.UndefOr[String] = js.native
  var lastChecked: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var numItems: js.UndefOr[Double] = js.native
  var severity: js.UndefOr[String] = js.native
  var submittedValue: js.UndefOr[String] = js.native
}

object Schema$AccountStatusDataQualityIssue {
  @scala.inline
  def apply(
    country: String = null,
    destination: String = null,
    detail: String = null,
    displayedValue: String = null,
    exampleItems: js.Array[Schema$AccountStatusExampleItem] = null,
    id: String = null,
    lastChecked: String = null,
    location: String = null,
    numItems: Int | Double = null,
    severity: String = null,
    submittedValue: String = null
  ): Schema$AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (displayedValue != null) __obj.updateDynamic("displayedValue")(displayedValue.asInstanceOf[js.Any])
    if (exampleItems != null) __obj.updateDynamic("exampleItems")(exampleItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastChecked != null) __obj.updateDynamic("lastChecked")(lastChecked.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountStatusDataQualityIssue]
  }
}

