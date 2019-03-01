package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermission extends js.Object {
  /** GTM Account access permissions. */
  var accountAccess: js.UndefOr[AccountAccess] = js.undefined
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Container access permissions. */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
  /** User's email address. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object UserPermission {
  @scala.inline
  def apply(
    accountAccess: AccountAccess = null,
    accountId: java.lang.String = null,
    containerAccess: js.Array[ContainerAccess] = null,
    emailAddress: java.lang.String = null,
    path: java.lang.String = null
  ): UserPermission = {
    val __obj = js.Dynamic.literal()
    if (accountAccess != null) __obj.updateDynamic("accountAccess")(accountAccess)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerAccess != null) __obj.updateDynamic("containerAccess")(containerAccess)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[UserPermission]
  }
}

