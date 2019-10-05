package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermission extends js.Object {
  var accountAccess: js.UndefOr[AccountAccess] = js.undefined
  var accountId: js.UndefOr[String] = js.undefined
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
  var emailAddress: js.UndefOr[String] = js.undefined
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
    if (accountAccess != null) __obj.updateDynamic("accountAccess")(accountAccess)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerAccess != null) __obj.updateDynamic("containerAccess")(containerAccess)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[UserPermission]
  }
}

