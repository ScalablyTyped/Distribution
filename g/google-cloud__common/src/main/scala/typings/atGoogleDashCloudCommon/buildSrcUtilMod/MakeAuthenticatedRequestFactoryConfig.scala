package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeAuthenticatedRequestFactoryConfig extends GoogleAuthOptions {
  /**
    * A pre-instantiated GoogleAuth client that should be used.
    * A new will be created if this is not set.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.undefined
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, just return the provided request options. Default: false.
    */
  var customEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Account email address, required for PEM/P12 usage.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  var stream: js.UndefOr[Duplexify] = js.undefined
}

object MakeAuthenticatedRequestFactoryConfig {
  @scala.inline
  def apply(
    authClient: GoogleAuth = null,
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    customEndpoint: js.UndefOr[Boolean] = js.undefined,
    email: String = null,
    keyFile: String = null,
    keyFilename: String = null,
    maxRetries: Int | Double = null,
    projectId: String = null,
    scopes: String | js.Array[String] = null,
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

