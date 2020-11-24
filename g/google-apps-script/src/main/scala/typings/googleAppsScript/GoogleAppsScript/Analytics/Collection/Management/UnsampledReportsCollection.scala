package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReport
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.UnsampledReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsampledReportsCollection extends js.Object {
  
  // Returns a single unsampled report.
  def get(accountId: String, webPropertyId: String, profileId: String, unsampledReportId: String): UnsampledReport = js.native
  
  // Create a new unsampled report.
  def insert(resource: UnsampledReport, accountId: String, webPropertyId: String, profileId: String): UnsampledReport = js.native
  
  // Lists unsampled reports to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String): UnsampledReports = js.native
  // Lists unsampled reports to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): UnsampledReports = js.native
  
  // Deletes an unsampled report.
  def remove(accountId: String, webPropertyId: String, profileId: String, unsampledReportId: String): Unit = js.native
}
