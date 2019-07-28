package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableDataInsertAllRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableDataInsertAllResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableDataList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabledataCollection extends js.Object {
  // Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role.
  def insertAll(resource: TableDataInsertAllRequest, projectId: String, datasetId: String, tableId: String): TableDataInsertAllResponse = js.native
  // Retrieves table data from a specified set of rows. Requires the READER dataset role.
  def list(projectId: String, datasetId: String, tableId: String): TableDataList = js.native
  // Retrieves table data from a specified set of rows. Requires the READER dataset role.
  def list(projectId: String, datasetId: String, tableId: String, optionalArgs: js.Object): TableDataList = js.native
}

