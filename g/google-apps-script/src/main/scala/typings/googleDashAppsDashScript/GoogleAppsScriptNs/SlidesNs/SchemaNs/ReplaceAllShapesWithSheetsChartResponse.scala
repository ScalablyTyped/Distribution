package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithSheetsChartResponse extends js.Object {
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}

object ReplaceAllShapesWithSheetsChartResponse {
  @scala.inline
  def apply(occurrencesChanged: Int | Double = null): ReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
  }
}

