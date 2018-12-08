package typings
package googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/jwtclient", "JWT")
@js.native
class JWT protected ()
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client {
  /**
       * JWT service account credentials.
       *
       * Retrieve access token using gtoken.
       *
       * @param email service account email address.
       * @param keyFile path to private key file.
       * @param key value of key
       * @param scopes list of requested scopes or a single scope.
       * @param subject impersonated account's email address.
       * @param key_id the ID of the key
       */
  def this(options: JWTOptions) = this()
  def this(email: js.UndefOr[java.lang.String], keyFile: js.UndefOr[java.lang.String], key: js.UndefOr[java.lang.String], scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]], subject: js.UndefOr[java.lang.String], keyId: js.UndefOr[java.lang.String]) = this()
  var access: js.UndefOr[js.Any] = js.native
  var additionalClaims: js.UndefOr[js.Object] = js.native
  var authorizeAsync: js.Any = js.native
  /**
       * Create a gToken if it doesn't already exist.
       */
  var createGToken: js.Any = js.native
  var email: js.UndefOr[java.lang.String] = js.native
  var fromStreamAsync: js.Any = js.native
  var gtoken: js.UndefOr[gtokenLib.gtokenMod.GoogleToken] = js.native
  /**
       * Determine if there are currently scopes available.
       */
  var hasScopes: js.Any = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var keyFile: js.UndefOr[java.lang.String] = js.native
  var keyId: js.UndefOr[java.lang.String] = js.native
  var scope: js.UndefOr[java.lang.String] = js.native
  var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var subject: js.UndefOr[java.lang.String] = js.native
  /**
       * Get the initial access token using gToken.
       * @param callback Optional callback.
       * @returns Promise that resolves with credentials
       */
  def authorize(): stdLib.Promise[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials] = js.native
  def authorize(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* result */ js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.Credentials], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Creates a copy of the credential with the specified scopes.
       * @param scopes List of requested scopes or a single scope.
       * @return The cloned instance.
       */
  def createScoped(): JWT = js.native
  /**
       * Creates a copy of the credential with the specified scopes.
       * @param scopes List of requested scopes or a single scope.
       * @return The cloned instance.
       */
  def createScoped(scopes: java.lang.String): JWT = js.native
  /**
       * Creates a copy of the credential with the specified scopes.
       * @param scopes List of requested scopes or a single scope.
       * @return The cloned instance.
       */
  def createScoped(scopes: js.Array[java.lang.String]): JWT = js.native
  /**
       * Indicates whether the credential requires scopes to be created by calling
       * createScoped before use.
       * @deprecated
       * @return false if createScoped does not need to be called.
       */
  def createScopedRequired(): scala.Boolean = js.native
  /**
       * Creates a JWT credentials instance using an API Key for authentication.
       * @param apiKey The API Key in string form.
       */
  def fromAPIKey(apiKey: java.lang.String): scala.Unit = js.native
  /**
       * Create a JWT credentials instance using the given input options.
       * @param json The input object.
       */
  def fromJSON(json: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput): scala.Unit = js.native
  /**
       * Create a JWT credentials instance using the given input stream.
       * @param inputStream The input stream.
       * @param callback Optional callback.
       */
  def fromStream(inputStream: nodeLib.streamMod.Readable): stdLib.Promise[scala.Unit] = js.native
  def fromStream(
    inputStream: nodeLib.streamMod.Readable,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Using the key or keyFile on the JWT client, obtain an object that contains
       * the key and the client email.
       */
  def getCredentials(): stdLib.Promise[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody] = js.native
}

