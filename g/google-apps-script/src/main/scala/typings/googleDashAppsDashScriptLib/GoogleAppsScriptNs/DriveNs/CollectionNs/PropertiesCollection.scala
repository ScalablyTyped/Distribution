package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesCollection extends js.Object {
  // Gets a property by its key.
  def get(fileId: java.lang.String, propertyKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Gets a property by its key.
  def get(fileId: java.lang.String, propertyKey: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Adds a property to a file, or updates it if it already exists.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Lists a file's properties.
  def list(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.PropertyList = js.native
  // Updates a property.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property,
    fileId: java.lang.String,
    propertyKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Updates a property.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property,
    fileId: java.lang.String,
    propertyKey: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Deletes a property.
  def remove(fileId: java.lang.String, propertyKey: java.lang.String): scala.Unit = js.native
  // Deletes a property.
  def remove(fileId: java.lang.String, propertyKey: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Updates a property.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property,
    fileId: java.lang.String,
    propertyKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
  // Updates a property.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property,
    fileId: java.lang.String,
    propertyKey: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Property = js.native
}

