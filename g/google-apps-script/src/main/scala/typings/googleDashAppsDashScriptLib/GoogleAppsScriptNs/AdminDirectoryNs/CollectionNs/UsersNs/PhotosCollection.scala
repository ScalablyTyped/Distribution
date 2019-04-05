package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosCollection extends js.Object {
  // Retrieve photo of a user
  def get(userKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto
  // Add a photo for the user. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto,
    userKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto
  // Remove photos for the user
  def remove(userKey: java.lang.String): scala.Unit
  // Add a photo for the user
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto,
    userKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto
}

object PhotosCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto,
    remove: java.lang.String => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto
  ): PhotosCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PhotosCollection]
  }
}

