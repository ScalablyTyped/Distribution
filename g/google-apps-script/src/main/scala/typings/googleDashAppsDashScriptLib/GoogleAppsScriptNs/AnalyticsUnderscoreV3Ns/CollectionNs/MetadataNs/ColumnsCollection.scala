package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCollection extends js.Object {
  // Lists all columns for a report type
  def list(reportType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Columns
}

object ColumnsCollection {
  @scala.inline
  def apply(
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Columns
  ): ColumnsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsCollection]
  }
}

