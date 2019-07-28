package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Template
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.TemplateList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCollection extends js.Object {
  // Retrieves a specific template by its id
  def get(tableId: String, templateId: Double): Template = js.native
  // Creates a new template for the table.
  def insert(resource: Template, tableId: String): Template = js.native
  // Retrieves a list of templates.
  def list(tableId: String): TemplateList = js.native
  // Retrieves a list of templates.
  def list(tableId: String, optionalArgs: js.Object): TemplateList = js.native
  // Updates an existing template. This method supports patch semantics.
  def patch(resource: Template, tableId: String, templateId: Double): Template = js.native
  // Deletes a template
  def remove(tableId: String, templateId: Double): Unit = js.native
  // Updates an existing template
  def update(resource: Template, tableId: String, templateId: Double): Template = js.native
}

