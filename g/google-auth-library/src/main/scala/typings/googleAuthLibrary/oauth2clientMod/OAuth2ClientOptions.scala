package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ClientOptions extends RefreshOptions {
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
}

object OAuth2ClientOptions {
  @scala.inline
  def apply(
    clientId: String = null,
    clientSecret: String = null,
    eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined,
    forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined,
    redirectUri: String = null
  ): OAuth2ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(eagerRefreshThresholdMillis)) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefreshOnFailure)) __obj.updateDynamic("forceRefreshOnFailure")(forceRefreshOnFailure.get.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ClientOptions]
  }
}

