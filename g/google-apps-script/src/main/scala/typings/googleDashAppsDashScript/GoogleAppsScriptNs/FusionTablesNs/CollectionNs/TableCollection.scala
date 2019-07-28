package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Import
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Table
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.TableList
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCollection extends js.Object {
  // Copies a table.
  def copy(tableId: String): Table = js.native
  // Copies a table.
  def copy(tableId: String, optionalArgs: js.Object): Table = js.native
  // Retrieves a specific table by its ID.
  def get(tableId: String): Table = js.native
  // Imports more rows into a table.
  def importRows(tableId: String): Import = js.native
  // Imports more rows into a table.
  def importRows(tableId: String, mediaData: js.Any): Import = js.native
  // Imports more rows into a table.
  def importRows(tableId: String, mediaData: js.Any, optionalArgs: js.Object): Import = js.native
  // Imports a new table.
  def importTable(name: String): Table = js.native
  // Imports a new table.
  def importTable(name: String, mediaData: js.Any): Table = js.native
  // Imports a new table.
  def importTable(name: String, mediaData: js.Any, optionalArgs: js.Object): Table = js.native
  // Creates a new table.
  def insert(resource: Table): Table = js.native
  // Retrieves a list of tables a user owns.
  def list(): TableList = js.native
  // Retrieves a list of tables a user owns.
  def list(optionalArgs: js.Object): TableList = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
  def patch(resource: Table, tableId: String): Table = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
  def patch(resource: Table, tableId: String, optionalArgs: js.Object): Table = js.native
  // Replaces rows of the table with the rows of the spreadsheet that is first imported from. Current rows remain visible until all replacement rows are ready.
  def refetchSheet(tableId: String): Task = js.native
  // Deletes a table.
  def remove(tableId: String): Unit = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: String): Task = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: String, mediaData: js.Any): Task = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: String, mediaData: js.Any, optionalArgs: js.Object): Task = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
  def update(resource: Table, tableId: String): Table = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
  def update(resource: Table, tableId: String, optionalArgs: js.Object): Table = js.native
}

