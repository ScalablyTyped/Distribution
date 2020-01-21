package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemasCollection extends js.Object {
  // Retrieve schema
  def get(customerId: String, schemaKey: String): Schema
  // Create schema.
  def insert(resource: Schema, customerId: String): Schema
  // Retrieve all schemas for a customer
  def list(customerId: String): Schemas
  // Update schema. This method supports patch semantics.
  def patch(resource: Schema, customerId: String, schemaKey: String): Schema
  // Delete schema
  def remove(customerId: String, schemaKey: String): Unit
  // Update schema
  def update(resource: Schema, customerId: String, schemaKey: String): Schema
}

object SchemasCollection {
  @scala.inline
  def apply(
    get: (String, String) => Schema,
    insert: (Schema, String) => Schema,
    list: String => Schemas,
    patch: (Schema, String, String) => Schema,
    remove: (String, String) => Unit,
    update: (Schema, String, String) => Schema
  ): SchemasCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[SchemasCollection]
  }
}

