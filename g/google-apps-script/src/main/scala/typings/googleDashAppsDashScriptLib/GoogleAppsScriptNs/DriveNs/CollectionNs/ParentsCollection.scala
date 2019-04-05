package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentsCollection extends js.Object {
  // Gets a specific parent reference.
  def get(fileId: java.lang.String, parentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference = js.native
  // Adds a parent folder for a file.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference = js.native
  // Adds a parent folder for a file.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference,
    fileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference = js.native
  // Lists a file's parents.
  def list(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentList = js.native
  // Removes a parent from a file.
  def remove(fileId: java.lang.String, parentId: java.lang.String): scala.Unit = js.native
}

