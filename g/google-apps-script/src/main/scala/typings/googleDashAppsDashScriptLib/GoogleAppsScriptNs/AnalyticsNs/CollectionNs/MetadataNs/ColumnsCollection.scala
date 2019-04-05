package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCollection extends js.Object {
  // Lists all columns for a report type
  def list(reportType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Columns
}

object ColumnsCollection {
  @scala.inline
  def apply(
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Columns
  ): ColumnsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsCollection]
  }
}

