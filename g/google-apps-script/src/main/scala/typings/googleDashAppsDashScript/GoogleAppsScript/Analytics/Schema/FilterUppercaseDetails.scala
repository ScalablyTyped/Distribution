package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterUppercaseDetails extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var fieldIndex: js.UndefOr[Double] = js.undefined
}

object FilterUppercaseDetails {
  @scala.inline
  def apply(field: String = null, fieldIndex: Int | Double = null): FilterUppercaseDetails = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterUppercaseDetails]
  }
}

