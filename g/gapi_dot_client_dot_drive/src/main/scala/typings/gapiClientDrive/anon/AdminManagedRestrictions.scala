package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminManagedRestrictions extends js.Object {
  /** Whether administrative privileges on this shared drive are required to modify restrictions. */
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the options to copy, print, or download files inside this shared drive, should be disabled for readers and commenters. When this restriction is
    * set to true, it will override the similarly named field to true for any file inside this shared drive.
    */
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether access to this shared drive and items inside this shared drive is restricted to users of the domain to which this shared drive belongs. This
    * restriction may be overridden by other sharing policies controlled outside of this shared drive.
    */
  var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
  /** Whether access to items inside this shared drive is restricted to its members. */
  var driveMembersOnly: js.UndefOr[Boolean] = js.undefined
}

object AdminManagedRestrictions {
  @scala.inline
  def apply(
    adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    domainUsersOnly: js.UndefOr[Boolean] = js.undefined,
    driveMembersOnly: js.UndefOr[Boolean] = js.undefined
  ): AdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminManagedRestrictions)) __obj.updateDynamic("adminManagedRestrictions")(adminManagedRestrictions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainUsersOnly)) __obj.updateDynamic("domainUsersOnly")(domainUsersOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(driveMembersOnly)) __obj.updateDynamic("driveMembersOnly")(driveMembersOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminManagedRestrictions]
  }
}

