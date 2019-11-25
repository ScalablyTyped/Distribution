package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusDataQualityIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.undefined
  /** A more detailed description of the issue. */
  var detail: js.UndefOr[String] = js.undefined
  /** Actual value displayed on the landing page. */
  var displayedValue: js.UndefOr[String] = js.undefined
  /** Example items featuring the issue. */
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.undefined
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.undefined
  /** Last time the account was checked for this issue. */
  var lastChecked: js.UndefOr[String] = js.undefined
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[String] = js.undefined
  /** Number of items in the account found to have the said issue. */
  var numItems: js.UndefOr[Double] = js.undefined
  /** Severity of the problem. */
  var severity: js.UndefOr[String] = js.undefined
  /** Submitted value that causes the issue. */
  var submittedValue: js.UndefOr[String] = js.undefined
}

object AccountStatusDataQualityIssue {
  @scala.inline
  def apply(
    country: String = null,
    detail: String = null,
    displayedValue: String = null,
    exampleItems: js.Array[AccountStatusExampleItem] = null,
    id: String = null,
    lastChecked: String = null,
    location: String = null,
    numItems: Int | Double = null,
    severity: String = null,
    submittedValue: String = null
  ): AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (displayedValue != null) __obj.updateDynamic("displayedValue")(displayedValue.asInstanceOf[js.Any])
    if (exampleItems != null) __obj.updateDynamic("exampleItems")(exampleItems.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastChecked != null) __obj.updateDynamic("lastChecked")(lastChecked.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (submittedValue != null) __obj.updateDynamic("submittedValue")(submittedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusDataQualityIssue]
  }
}

