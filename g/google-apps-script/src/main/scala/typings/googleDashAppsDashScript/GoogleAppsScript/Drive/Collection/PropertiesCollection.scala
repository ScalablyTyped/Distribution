package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Property
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.PropertyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesCollection extends js.Object {
  // Gets a property by its key.
  def get(fileId: String, propertyKey: String): Property = js.native
  // Gets a property by its key.
  def get(fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
  // Adds a property to a file, or updates it if it already exists.
  def insert(resource: Property, fileId: String): Property = js.native
  // Lists a file's properties.
  def list(fileId: String): PropertyList = js.native
  // Updates a property.
  def patch(resource: Property, fileId: String, propertyKey: String): Property = js.native
  // Updates a property.
  def patch(resource: Property, fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
  // Deletes a property.
  def remove(fileId: String, propertyKey: String): Unit = js.native
  // Deletes a property.
  def remove(fileId: String, propertyKey: String, optionalArgs: js.Object): Unit = js.native
  // Updates a property.
  def update(resource: Property, fileId: String, propertyKey: String): Property = js.native
  // Updates a property.
  def update(resource: Property, fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
}

