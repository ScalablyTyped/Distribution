package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeAuthenticatedRequestFactoryConfig
  extends googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions {
  /**
    * A pre-instantiated GoogleAuth client that should be used.
    * A new will be created if this is not set.
    */
  var authClient: js.UndefOr[googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth] = js.undefined
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, just return the provided request options. Default: false.
    */
  var customEndpoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Account email address, required for PEM/P12 usage.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var stream: js.UndefOr[Duplexify] = js.undefined
}

object MakeAuthenticatedRequestFactoryConfig {
  @scala.inline
  def apply(
    authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = null,
    autoRetry: js.UndefOr[scala.Boolean] = js.undefined,
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    customEndpoint: js.UndefOr[scala.Boolean] = js.undefined,
    email: java.lang.String = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    projectId: java.lang.String = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null,
    stream: Duplexify = null
  ): MakeAuthenticatedRequestFactoryConfig = {
    val __obj = js.Dynamic.literal()
    if (authClient != null) __obj.updateDynamic("authClient")(authClient)
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry)
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (!js.isUndefined(customEndpoint)) __obj.updateDynamic("customEndpoint")(customEndpoint)
    if (email != null) __obj.updateDynamic("email")(email)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[MakeAuthenticatedRequestFactoryConfig]
  }
}

