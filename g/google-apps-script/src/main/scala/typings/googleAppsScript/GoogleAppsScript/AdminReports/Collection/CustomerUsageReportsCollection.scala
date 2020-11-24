package typings.googleAppsScript.GoogleAppsScript.AdminReports.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema.UsageReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerUsageReportsCollection extends js.Object {
  
  // Retrieves a report which is a collection of properties / statistics for a specific customer.
  def get(date: String): UsageReports = js.native
  // Retrieves a report which is a collection of properties / statistics for a specific customer.
  def get(date: String, optionalArgs: js.Object): UsageReports = js.native
}
