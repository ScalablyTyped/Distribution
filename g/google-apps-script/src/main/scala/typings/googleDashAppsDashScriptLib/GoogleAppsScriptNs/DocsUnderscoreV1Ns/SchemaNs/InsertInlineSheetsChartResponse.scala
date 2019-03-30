package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertInlineSheetsChartResponse extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object InsertInlineSheetsChartResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): InsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[InsertInlineSheetsChartResponse]
  }
}

