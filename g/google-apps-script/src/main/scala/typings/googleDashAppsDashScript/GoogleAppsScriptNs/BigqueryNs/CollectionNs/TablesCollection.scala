package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Table
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.TableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesCollection extends js.Object {
  // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
  def get(projectId: String, datasetId: String, tableId: String): Table = js.native
  // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
  def get(projectId: String, datasetId: String, tableId: String, optionalArgs: js.Object): Table = js.native
  // Creates a new, empty table in the dataset.
  def insert(resource: Table, projectId: String, datasetId: String): Table = js.native
  // Lists all tables in the specified dataset. Requires the READER dataset role.
  def list(projectId: String, datasetId: String): TableList = js.native
  // Lists all tables in the specified dataset. Requires the READER dataset role.
  def list(projectId: String, datasetId: String, optionalArgs: js.Object): TableList = js.native
  // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource. This method supports patch semantics.
  def patch(resource: Table, projectId: String, datasetId: String, tableId: String): Table = js.native
  // Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted.
  def remove(projectId: String, datasetId: String, tableId: String): Unit = js.native
  // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource.
  def update(resource: Table, projectId: String, datasetId: String, tableId: String): Table = js.native
}

