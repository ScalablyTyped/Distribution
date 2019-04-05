package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesCollection extends js.Object {
  // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
  def get(projectId: java.lang.String, datasetId: java.lang.String, tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table = js.native
  // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
  def get(
    projectId: java.lang.String,
    datasetId: java.lang.String,
    tableId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table = js.native
  // Creates a new, empty table in the dataset.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table,
    projectId: java.lang.String,
    datasetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table = js.native
  // Lists all tables in the specified dataset. Requires the READER dataset role.
  def list(projectId: java.lang.String, datasetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableList = js.native
  // Lists all tables in the specified dataset. Requires the READER dataset role.
  def list(projectId: java.lang.String, datasetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableList = js.native
  // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table,
    projectId: java.lang.String,
    datasetId: java.lang.String,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table = js.native
  // Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted.
  def remove(projectId: java.lang.String, datasetId: java.lang.String, tableId: java.lang.String): scala.Unit = js.native
  // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table,
    projectId: java.lang.String,
    datasetId: java.lang.String,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table = js.native
}

