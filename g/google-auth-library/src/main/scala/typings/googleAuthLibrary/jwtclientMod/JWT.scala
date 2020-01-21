package typings.googleAuthLibrary.jwtclientMod

import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.credentialsMod.Credentials
import typings.googleAuthLibrary.credentialsMod.JWTInput
import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import typings.gtoken.mod.GoogleToken
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/jwtclient", "JWT")
@js.native
class JWT protected () extends OAuth2Client {
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
  def this(
    email: js.UndefOr[String],
    keyFile: js.UndefOr[String],
    key: js.UndefOr[String],
    scopes: js.UndefOr[js.Array[String] | String],
    subject: js.UndefOr[String],
    keyId: js.UndefOr[String]
  ) = this()
  var access: js.UndefOr[js.Any] = js.native
  var additionalClaims: js.UndefOr[js.Object] = js.native
  var authorizeAsync: js.Any = js.native
  /**
    * Create a gToken if it doesn't already exist.
    */
  var createGToken: js.Any = js.native
  var email: js.UndefOr[String] = js.native
  var fromStreamAsync: js.Any = js.native
  var gtoken: js.UndefOr[GoogleToken] = js.native
  /**
    * Determine if there are currently scopes available.
    */
  var hasScopes: js.Any = js.native
  var key: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var keyId: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
  var subject: js.UndefOr[String] = js.native
  /**
    * Get the initial access token using gToken.
    * @param callback Optional callback.
    * @returns Promise that resolves with credentials
    */
  def authorize(): js.Promise[Credentials] = js.native
  def authorize(callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Credentials], Unit]): Unit = js.native
  /**
    * Creates a copy of the credential with the specified scopes.
    * @param scopes List of requested scopes or a single scope.
    * @return The cloned instance.
    */
  def createScoped(): JWT = js.native
  def createScoped(scopes: String): JWT = js.native
  def createScoped(scopes: js.Array[String]): JWT = js.native
  /**
    * Indicates whether the credential requires scopes to be created by calling
    * createScoped before use.
    * @deprecated
    * @return false if createScoped does not need to be called.
    */
  def createScopedRequired(): Boolean = js.native
  /**
    * Creates a JWT credentials instance using an API Key for authentication.
    * @param apiKey The API Key in string form.
    */
  def fromAPIKey(apiKey: String): Unit = js.native
  /**
    * Create a JWT credentials instance using the given input options.
    * @param json The input object.
    */
  def fromJSON(json: JWTInput): Unit = js.native
  /**
    * Create a JWT credentials instance using the given input stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
  def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /**
    * Using the key or keyFile on the JWT client, obtain an object that contains
    * the key and the client email.
    */
  def getCredentials(): js.Promise[CredentialBody] = js.native
}

