package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions {
  /**
    * The API endpoint of the service used to make requests.
    * Defaults to `www.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
}

object StorageOptions {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    autoRetry: js.UndefOr[scala.Boolean] = js.undefined,
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    projectId: java.lang.String = null,
    promise: stdLib.PromiseConstructor = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null
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

