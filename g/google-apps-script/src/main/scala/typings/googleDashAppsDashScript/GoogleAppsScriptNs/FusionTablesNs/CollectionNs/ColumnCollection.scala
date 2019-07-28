package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.ColumnList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnCollection extends js.Object {
  // Retrieves a specific column by its ID.
  def get(tableId: String, columnId: String): Column = js.native
  // Adds a new column to the table.
  def insert(resource: Column, tableId: String): Column = js.native
  // Retrieves a list of columns.
  def list(tableId: String): ColumnList = js.native
  // Retrieves a list of columns.
  def list(tableId: String, optionalArgs: js.Object): ColumnList = js.native
  // Updates the name or type of an existing column. This method supports patch semantics.
  def patch(resource: Column, tableId: String, columnId: String): Column = js.native
  // Deletes the specified column.
  def remove(tableId: String, columnId: String): Unit = js.native
  // Updates the name or type of an existing column.
  def update(resource: Column, tableId: String, columnId: String): Column = js.native
}

