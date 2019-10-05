package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueRange extends js.Object {
  var majorDimension: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object ValueRange {
  @scala.inline
  def apply(majorDimension: String = null, range: String = null, values: js.Array[js.Array[_]] = null): ValueRange = {
    val __obj = js.Dynamic.literal()
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (range != null) __obj.updateDynamic("range")(range)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ValueRange]
  }
}

