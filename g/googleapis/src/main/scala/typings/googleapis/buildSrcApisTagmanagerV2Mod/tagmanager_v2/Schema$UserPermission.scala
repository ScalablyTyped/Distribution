package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a user&#39;s permissions to an account and its container.
  */
@js.native
trait Schema$UserPermission extends js.Object {
  /**
    * GTM Account access permissions.
    */
  var accountAccess: js.UndefOr[Schema$AccountAccess] = js.native
  /**
    * The Account ID uniquely identifies the GTM Account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container access permissions.
    */
  var containerAccess: js.UndefOr[js.Array[Schema$ContainerAccess]] = js.native
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * GTM UserPermission&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$UserPermission {
  @scala.inline
  def apply(
    accountAccess: Schema$AccountAccess = null,
    accountId: String = null,
    containerAccess: js.Array[Schema$ContainerAccess] = null,
    emailAddress: String = null,
    path: String = null
  ): Schema$UserPermission = {
    val __obj = js.Dynamic.literal()
    if (accountAccess != null) __obj.updateDynamic("accountAccess")(accountAccess.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerAccess != null) __obj.updateDynamic("containerAccess")(containerAccess.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserPermission]
  }
}

