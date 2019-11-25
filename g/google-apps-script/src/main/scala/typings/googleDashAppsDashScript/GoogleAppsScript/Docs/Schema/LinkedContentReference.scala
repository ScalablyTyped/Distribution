package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedContentReference extends js.Object {
  var sheetsChartReference: js.UndefOr[SheetsChartReference] = js.undefined
}

object LinkedContentReference {
  @scala.inline
  def apply(sheetsChartReference: SheetsChartReference = null): LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReference != null) __obj.updateDynamic("sheetsChartReference")(sheetsChartReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedContentReference]
  }
}

