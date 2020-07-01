package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyRequiresWriterPermission extends js.Object {
  /** Whether administrative privileges on this Team Drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the options to copy, print, or download files inside this Team Drive, should be disabled for readers and commenters. When this restriction is
    * set to true, it will override the similarly named field to true for any file inside this Team Drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether access to this Team Drive and items inside this Team Drive is restricted to users of the domain to which this Team Drive belongs. This
    * restriction may be overridden by other sharing policies controlled outside of this Team Drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  /** Whether access to items inside this Team Drive is restricted to members of this Team Drive. */
  var teamMembersOnly: js.UndefOr[Boolean] = js.undefined
}

object CopyRequiresWriterPermission {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[Boolean] = js.undefined,
    teamMembersOnly: js.UndefOr[Boolean] = js.undefined
  ): CopyRequiresWriterPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(teamMembersOnly)) __obj.updateDynamic("teamMembersOnly")(teamMembersOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyRequiresWriterPermission]
  }
}

