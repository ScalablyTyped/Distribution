package typings.firebaseDashAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response interface for listing provider configs. This is only available
  * when listing all identity providers' configurations via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listProviderConfigs `listProviderConfigs()`}.
  */
trait ListProviderConfigResults extends js.Object {
  /**
    * The next page token, if available.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The list of providers for the specified type in the current page.
    */
  var providerConfigs: js.Array[AuthProviderConfig]
}

object ListProviderConfigResults {
  @scala.inline
  def apply(providerConfigs: js.Array[AuthProviderConfig], pageToken: String = null): ListProviderConfigResults = {
    val __obj = js.Dynamic.literal(providerConfigs = providerConfigs)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[ListProviderConfigResults]
  }
}

