package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotosCollection extends js.Object {
  // Retrieve photo of a user
  def get(userKey: String): UserPhoto
  // Add a photo for the user. This method supports patch semantics.
  def patch(resource: UserPhoto, userKey: String): UserPhoto
  // Remove photos for the user
  def remove(userKey: String): Unit
  // Add a photo for the user
  def update(resource: UserPhoto, userKey: String): UserPhoto
}

object PhotosCollection {
  @scala.inline
  def apply(
    get: String => UserPhoto,
    patch: (UserPhoto, String) => UserPhoto,
    remove: String => Unit,
    update: (UserPhoto, String) => UserPhoto
  ): PhotosCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PhotosCollection]
  }
}

