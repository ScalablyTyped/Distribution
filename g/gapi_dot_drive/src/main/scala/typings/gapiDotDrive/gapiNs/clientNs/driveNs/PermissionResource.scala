package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotDrive.Anon_AdditionalRoles
import typings.gapiDotDrive.gapiDotDriveStrings.`drive#permission`
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
  var kind: `drive#permission`
  var name: String
  var photoLink: String
  var role: String
  var selfLink: String
  var teamDrivePermissionDetails: js.Array[Anon_AdditionalRoles]
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
    kind: `drive#permission`,
    name: String,
    photoLink: String,
    role: String,
    selfLink: String,
    teamDrivePermissionDetails: js.Array[Anon_AdditionalRoles],
    `type`: String,
    value: String,
    withLink: Boolean
  ): PermissionResource = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles, authKey = authKey, deleted = deleted, domain = domain, emailAddress = emailAddress, etag = etag, expirationDate = expirationDate, id = id, kind = kind, name = name, photoLink = photoLink, role = role, selfLink = selfLink, teamDrivePermissionDetails = teamDrivePermissionDetails, value = value, withLink = withLink)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PermissionResource]
  }
}

