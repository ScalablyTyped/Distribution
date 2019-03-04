package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResource extends js.Object {
  var additionalRoles: js.Array[java.lang.String]
  var authKey: java.lang.String
  var deleted: scala.Boolean
  var domain: java.lang.String
  var emailAddress: java.lang.String
  var etag: java.lang.String
  var expirationDate: stdLib.Date
  var id: java.lang.String
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#permission`
  var name: java.lang.String
  var photoLink: java.lang.String
  var role: java.lang.String
  var selfLink: java.lang.String
  var teamDrivePermissionDetails: js.Array[gapiDotDriveLib.Anon_AdditionalRoles]
  var `type`: java.lang.String
  var value: java.lang.String
  var withLink: scala.Boolean
}

object PermissionResource {
  @scala.inline
  def apply(
    additionalRoles: js.Array[java.lang.String],
    authKey: java.lang.String,
    deleted: scala.Boolean,
    domain: java.lang.String,
    emailAddress: java.lang.String,
    etag: java.lang.String,
    expirationDate: stdLib.Date,
    id: java.lang.String,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#permission`,
    name: java.lang.String,
    photoLink: java.lang.String,
    role: java.lang.String,
    selfLink: java.lang.String,
    teamDrivePermissionDetails: js.Array[gapiDotDriveLib.Anon_AdditionalRoles],
    `type`: java.lang.String,
    value: java.lang.String,
    withLink: scala.Boolean
  ): PermissionResource = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles, authKey = authKey, deleted = deleted, domain = domain, emailAddress = emailAddress, etag = etag, expirationDate = expirationDate, id = id, kind = kind, name = name, photoLink = photoLink, role = role, selfLink = selfLink, teamDrivePermissionDetails = teamDrivePermissionDetails, value = value, withLink = withLink)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PermissionResource]
  }
}

