package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermission extends js.Object {
  /** GTM Account access permissions. */
  var accountAccess: js.UndefOr[AccountAccess] = js.undefined
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[String] = js.undefined
  /** GTM Container access permissions. */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
  /** User's email address. */
  var emailAddress: js.UndefOr[String] = js.undefined
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[String] = js.undefined
}

object UserPermission {
  @scala.inline
  def apply(
    accountAccess: AccountAccess = null,
    accountId: String = null,
    containerAccess: js.Array[ContainerAccess] = null,
    emailAddress: String = null,
    path: String = null
  ): UserPermission = {
    val __obj = js.Dynamic.literal()
    if (accountAccess != null) __obj.updateDynamic("accountAccess")(accountAccess.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerAccess != null) __obj.updateDynamic("containerAccess")(containerAccess.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermission]
  }
}

