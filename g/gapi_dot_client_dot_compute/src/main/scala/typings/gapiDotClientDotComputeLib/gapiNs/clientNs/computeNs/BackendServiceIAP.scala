package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServiceIAP extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var oauth2ClientId: js.UndefOr[java.lang.String] = js.undefined
  var oauth2ClientSecret: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] SHA256 hash value for the field oauth2_client_secret above. */
  var oauth2ClientSecretSha256: js.UndefOr[java.lang.String] = js.undefined
}

object BackendServiceIAP {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    oauth2ClientId: java.lang.String = null,
    oauth2ClientSecret: java.lang.String = null,
    oauth2ClientSecretSha256: java.lang.String = null
  ): BackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId)
    if (oauth2ClientSecret != null) __obj.updateDynamic("oauth2ClientSecret")(oauth2ClientSecret)
    if (oauth2ClientSecretSha256 != null) __obj.updateDynamic("oauth2ClientSecretSha256")(oauth2ClientSecretSha256)
    __obj.asInstanceOf[BackendServiceIAP]
  }
}

