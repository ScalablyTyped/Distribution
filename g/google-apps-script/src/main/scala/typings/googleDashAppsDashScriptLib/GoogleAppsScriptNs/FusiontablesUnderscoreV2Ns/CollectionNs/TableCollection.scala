package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCollection extends js.Object {
  // Copies a table.
  def copy(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Copies a table.
  def copy(tableId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Retrieves a specific table by its ID.
  def get(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Imports more rows into a table.
  def importRows(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Import = js.native
  // Imports more rows into a table.
  def importRows(tableId: java.lang.String, mediaData: js.Any): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Import = js.native
  // Imports more rows into a table.
  def importRows(tableId: java.lang.String, mediaData: js.Any, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Import = js.native
  // Imports a new table.
  def importTable(name: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Imports a new table.
  def importTable(name: java.lang.String, mediaData: js.Any): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Imports a new table.
  def importTable(name: java.lang.String, mediaData: js.Any, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Creates a new table.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Retrieves a list of tables a user owns.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TableList = js.native
  // Retrieves a list of tables a user owns.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TableList = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table,
    tableId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Replaces rows of the table with the rows of the spreadsheet that is first imported from. Current rows remain visible until all replacement rows are ready.
  def refetchSheet(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Task = js.native
  // Deletes a table.
  def remove(tableId: java.lang.String): scala.Unit = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Task = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: java.lang.String, mediaData: js.Any): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Task = js.native
  // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
  def replaceRows(tableId: java.lang.String, mediaData: js.Any, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Task = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
  // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table,
    tableId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Table = js.native
}

