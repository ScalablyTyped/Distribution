package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdpConfig extends js.Object {
  /** OAuth2 client ID. */
  var clientId: js.UndefOr[String] = js.undefined
  /** Whether this IDP is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Percent of users who will be prompted/redirected federated login for this IDP. */
  var experimentPercent: js.UndefOr[Double] = js.undefined
  /** OAuth2 provider. */
  var provider: js.UndefOr[String] = js.undefined
  /** OAuth2 client secret. */
  var secret: js.UndefOr[String] = js.undefined
  /** Whitelisted client IDs for audience check. */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.undefined
}

object IdpConfig {
  @scala.inline
  def apply(
    clientId: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    experimentPercent: Int | Double = null,
    provider: String = null,
    secret: String = null,
    whitelistedAudiences: js.Array[String] = null
  ): IdpConfig = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (experimentPercent != null) __obj.updateDynamic("experimentPercent")(experimentPercent.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (whitelistedAudiences != null) __obj.updateDynamic("whitelistedAudiences")(whitelistedAudiences.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdpConfig]
  }
}

