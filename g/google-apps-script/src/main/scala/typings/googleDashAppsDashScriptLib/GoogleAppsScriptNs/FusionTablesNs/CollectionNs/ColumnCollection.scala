package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnCollection extends js.Object {
  // Retrieves a specific column by its ID.
  def get(tableId: java.lang.String, columnId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column = js.native
  // Adds a new column to the table.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column = js.native
  // Retrieves a list of columns.
  def list(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.ColumnList = js.native
  // Retrieves a list of columns.
  def list(tableId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.ColumnList = js.native
  // Updates the name or type of an existing column. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column,
    tableId: java.lang.String,
    columnId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column = js.native
  // Deletes the specified column.
  def remove(tableId: java.lang.String, columnId: java.lang.String): scala.Unit = js.native
  // Updates the name or type of an existing column.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column,
    tableId: java.lang.String,
    columnId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column = js.native
}

