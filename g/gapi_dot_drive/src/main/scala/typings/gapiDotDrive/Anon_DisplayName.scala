package typings.gapiDotDrive

import typings.gapiDotDrive.gapiDotDriveStrings.`drive#user`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: String
  var emailAddress: String
  var isAuthenticatedUser: Boolean
  var kind: `drive#user`
  var permissionId: String
  var picture: Anon_Url
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    displayName: String,
    emailAddress: String,
    isAuthenticatedUser: Boolean,
    kind: `drive#user`,
    permissionId: String,
    picture: Anon_Url
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress, isAuthenticatedUser = isAuthenticatedUser, kind = kind, permissionId = permissionId, picture = picture)
  
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

