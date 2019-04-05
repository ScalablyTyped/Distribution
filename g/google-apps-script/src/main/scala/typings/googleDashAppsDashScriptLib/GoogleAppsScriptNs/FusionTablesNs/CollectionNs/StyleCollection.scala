package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleCollection extends js.Object {
  // Gets a specific style.
  def get(tableId: java.lang.String, styleId: scala.Double): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting = js.native
  // Adds a new style for the table.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting = js.native
  // Retrieves a list of styles.
  def list(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSettingList = js.native
  // Retrieves a list of styles.
  def list(tableId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSettingList = js.native
  // Updates an existing style. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting,
    tableId: java.lang.String,
    styleId: scala.Double
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting = js.native
  // Deletes a style.
  def remove(tableId: java.lang.String, styleId: scala.Double): scala.Unit = js.native
  // Updates an existing style.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting,
    tableId: java.lang.String,
    styleId: scala.Double
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting = js.native
}

