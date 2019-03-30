package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueRange extends js.Object {
  var majorDimension: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[js.Array[js.Object]]] = js.undefined
}

object ValueRange {
  @scala.inline
  def apply(
    majorDimension: java.lang.String = null,
    range: java.lang.String = null,
    values: js.Array[js.Array[js.Object]] = null
  ): ValueRange = {
    val __obj = js.Dynamic.literal()
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (range != null) __obj.updateDynamic("range")(range)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ValueRange]
  }
}

