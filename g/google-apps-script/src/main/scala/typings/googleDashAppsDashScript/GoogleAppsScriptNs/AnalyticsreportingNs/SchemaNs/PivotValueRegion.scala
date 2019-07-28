package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValueRegion extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object PivotValueRegion {
  @scala.inline
  def apply(values: js.Array[String] = null): PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PivotValueRegion]
  }
}

