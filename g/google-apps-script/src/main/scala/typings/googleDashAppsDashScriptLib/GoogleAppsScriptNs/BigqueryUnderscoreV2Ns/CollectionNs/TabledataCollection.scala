package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabledataCollection extends js.Object {
  // Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role.
  def insertAll(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.TableDataInsertAllRequest,
    projectId: java.lang.String,
    datasetId: java.lang.String,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.TableDataInsertAllResponse = js.native
  // Retrieves table data from a specified set of rows. Requires the READER dataset role.
  def list(projectId: java.lang.String, datasetId: java.lang.String, tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.TableDataList = js.native
  // Retrieves table data from a specified set of rows. Requires the READER dataset role.
  def list(
    projectId: java.lang.String,
    datasetId: java.lang.String,
    tableId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.TableDataList = js.native
}

