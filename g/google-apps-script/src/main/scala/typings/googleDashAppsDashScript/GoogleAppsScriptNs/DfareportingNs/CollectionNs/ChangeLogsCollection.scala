package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ChangeLog
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ChangeLogsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeLogsCollection extends js.Object {
  // Gets one change log by ID.
  def get(profileId: String, id: String): ChangeLog = js.native
  // Retrieves a list of change logs. This method supports paging.
  def list(profileId: String): ChangeLogsListResponse = js.native
  // Retrieves a list of change logs. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): ChangeLogsListResponse = js.native
}

