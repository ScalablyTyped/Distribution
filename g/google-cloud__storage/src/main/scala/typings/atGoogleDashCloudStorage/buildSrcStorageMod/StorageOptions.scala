package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends GoogleAuthOptions {
  /**
    * The API endpoint of the service used to make requests.
    * Defaults to `www.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
}

object StorageOptions {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    keyFile: String = null,
    keyFilename: String = null,
    maxRetries: Int | Double = null,
    projectId: String = null,
    promise: PromiseConstructor = null,
    scopes: String | js.Array[String] = null
  ): StorageOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry)
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
}

