package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCollection extends js.Object {
  // Retrieves a specific template by its id
  def get(tableId: java.lang.String, templateId: scala.Double): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template = js.native
  // Creates a new template for the table.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template,
    tableId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template = js.native
  // Retrieves a list of templates.
  def list(tableId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TemplateList = js.native
  // Retrieves a list of templates.
  def list(tableId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.TemplateList = js.native
  // Updates an existing template. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template,
    tableId: java.lang.String,
    templateId: scala.Double
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template = js.native
  // Deletes a template
  def remove(tableId: java.lang.String, templateId: scala.Double): scala.Unit = js.native
  // Updates an existing template
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template,
    tableId: java.lang.String,
    templateId: scala.Double
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Template = js.native
}

