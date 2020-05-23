package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.anon.AdditionalRoles
import typings.gapiDrive.gapiDriveStrings.driveNumbersignpermission
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResource extends js.Object {
  var additionalRoles: js.Array[String]
  var authKey: String
  var deleted: Boolean
  var domain: String
  var emailAddress: String
  var etag: String
  var expirationDate: Date
  var id: String
  var kind: driveNumbersignpermission
  var name: String
  var photoLink: String
  var role: String
  var selfLink: String
  var teamDrivePermissionDetails: js.Array[AdditionalRoles]
  var `type`: String
  var value: String
  var withLink: Boolean
}

object PermissionResource {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    authKey: String,
    deleted: Boolean,
    domain: String,
    emailAddress: String,
    etag: String,
    expirationDate: Date,
    id: String,
    kind: driveNumbersignpermission,
    name: String,
    photoLink: String,
    role: String,
    selfLink: String,
    teamDrivePermissionDetails: js.Array[AdditionalRoles],
    `type`: String,
    value: String,
    withLink: Boolean
  ): PermissionResource = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], authKey = authKey.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photoLink = photoLink.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], teamDrivePermissionDetails = teamDrivePermissionDetails.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], withLink = withLink.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResource]
  }
}

