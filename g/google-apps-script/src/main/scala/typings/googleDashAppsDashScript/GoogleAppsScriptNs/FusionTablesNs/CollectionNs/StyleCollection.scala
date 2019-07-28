package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSettingList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleCollection extends js.Object {
  // Gets a specific style.
  def get(tableId: String, styleId: Double): StyleSetting = js.native
  // Adds a new style for the table.
  def insert(resource: StyleSetting, tableId: String): StyleSetting = js.native
  // Retrieves a list of styles.
  def list(tableId: String): StyleSettingList = js.native
  // Retrieves a list of styles.
  def list(tableId: String, optionalArgs: js.Object): StyleSettingList = js.native
  // Updates an existing style. This method supports patch semantics.
  def patch(resource: StyleSetting, tableId: String, styleId: Double): StyleSetting = js.native
  // Deletes a style.
  def remove(tableId: String, styleId: Double): Unit = js.native
  // Updates an existing style.
  def update(resource: StyleSetting, tableId: String, styleId: Double): StyleSetting = js.native
}

