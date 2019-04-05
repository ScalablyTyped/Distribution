package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemasCollection extends js.Object {
  // Retrieve schema
  def get(customerId: java.lang.String, schemaKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema
  // Create schema.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema
  // Retrieve all schemas for a customer
  def list(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schemas
  // Update schema. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    customerId: java.lang.String,
    schemaKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema
  // Delete schema
  def remove(customerId: java.lang.String, schemaKey: java.lang.String): scala.Unit
  // Update schema
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    customerId: java.lang.String,
    schemaKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema
}

object SchemasCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    insert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schemas,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema,
    remove: (java.lang.String, java.lang.String) => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Schema
  ): SchemasCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[SchemasCollection]
  }
}

