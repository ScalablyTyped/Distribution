package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSourceRange extends js.Object {
  var sources: js.UndefOr[js.Array[GridRange]] = js.undefined
}

object ChartSourceRange {
  @scala.inline
  def apply(sources: js.Array[GridRange] = null): ChartSourceRange = {
    val __obj = js.Dynamic.literal()
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[ChartSourceRange]
  }
}

