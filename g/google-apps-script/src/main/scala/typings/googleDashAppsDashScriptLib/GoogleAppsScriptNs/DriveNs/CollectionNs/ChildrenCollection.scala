package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenCollection extends js.Object {
  // Gets a specific child reference.
  def get(folderId: java.lang.String, childId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference = js.native
  // Inserts a file into a folder.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference,
    folderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference = js.native
  // Inserts a file into a folder.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference,
    folderId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference = js.native
  // Lists a folder's children.
  def list(folderId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildList = js.native
  // Lists a folder's children.
  def list(folderId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildList = js.native
  // Removes a child from a folder.
  def remove(folderId: java.lang.String, childId: java.lang.String): scala.Unit = js.native
}

