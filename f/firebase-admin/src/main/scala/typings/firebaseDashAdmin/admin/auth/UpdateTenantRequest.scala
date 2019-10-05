package typings.firebaseDashAdmin.admin.auth

import typings.firebaseDashAdmin.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to update on the provided tenant.
  */
trait UpdateTenantRequest extends js.Object {
  /**
    * The tenant display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The email sign in configuration.
    */
  var emailSignInConfig: js.UndefOr[Anon_Enabled] = js.undefined
}

object UpdateTenantRequest {
  @scala.inline
  def apply(displayName: String = null, emailSignInConfig: Anon_Enabled = null): UpdateTenantRequest = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailSignInConfig != null) __obj.updateDynamic("emailSignInConfig")(emailSignInConfig)
    __obj.asInstanceOf[UpdateTenantRequest]
  }
}

