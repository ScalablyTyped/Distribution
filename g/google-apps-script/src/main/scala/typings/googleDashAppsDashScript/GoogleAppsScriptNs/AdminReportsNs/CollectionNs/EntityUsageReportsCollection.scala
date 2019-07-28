package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.UsageReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityUsageReportsCollection extends js.Object {
  // Retrieves a report which is a collection of properties / statistics for a set of objects.
  def get(entityType: String, entityKey: String, date: String): UsageReports = js.native
  // Retrieves a report which is a collection of properties / statistics for a set of objects.
  def get(entityType: String, entityKey: String, date: String, optionalArgs: js.Object): UsageReports = js.native
}

