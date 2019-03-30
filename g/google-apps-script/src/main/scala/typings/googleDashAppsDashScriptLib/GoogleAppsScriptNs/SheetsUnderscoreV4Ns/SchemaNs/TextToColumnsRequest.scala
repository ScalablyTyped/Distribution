package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToColumnsRequest extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var delimiterType: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
}

object TextToColumnsRequest {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    delimiterType: java.lang.String = null,
    source: GridRange = null
  ): TextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (delimiterType != null) __obj.updateDynamic("delimiterType")(delimiterType)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[TextToColumnsRequest]
  }
}

