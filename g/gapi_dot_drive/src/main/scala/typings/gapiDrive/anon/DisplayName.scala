package typings.gapiDrive.anon

import typings.gapiDrive.gapiDriveStrings.driveNumbersignuser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var displayName: String
  var emailAddress: String
  var isAuthenticatedUser: Boolean
  var kind: driveNumbersignuser
  var permissionId: String
  var picture: Url
}

object DisplayName {
  @scala.inline
  def apply(
    displayName: String,
    emailAddress: String,
    isAuthenticatedUser: Boolean,
    kind: driveNumbersignuser,
    permissionId: String,
    picture: Url
  ): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], isAuthenticatedUser = isAuthenticatedUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], permissionId = permissionId.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

