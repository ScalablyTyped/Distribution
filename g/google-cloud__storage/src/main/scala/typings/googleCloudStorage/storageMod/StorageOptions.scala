package typings.googleCloudStorage.storageMod

import org.scalablytyped.runtime.Instantiable1
import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import typings.std.PromiseConstructor
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends GoogleAuthOptions {
  /**
    * The API endpoint of the service used to make requests.
    * Defaults to `storage.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ])
  ] = js.undefined
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
    maxRetries: js.UndefOr[Double] = js.undefined,
    projectId: String = null,
    promise: PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ]) = null,
    scopes: String | js.Array[String] = null
  ): StorageOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry.get.asInstanceOf[js.Any])
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOptions]
  }
}

