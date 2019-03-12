package typings
package googleDashAuthDashLibraryLib.buildSrcAuthJwtaccessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/jwtaccess", "JWTAccess")
@js.native
/**
  * JWTAccess service account credentials.
  *
  * Create a new access token by using the credential to create a new JWT token
  * that's recognized as the access token.
  *
  * @param email the service account email address.
  * @param key the private key that will be used to sign the token.
  * @param keyId the ID of the private key used to sign the token.
  */
class JWTAccess () extends js.Object {
  def this(email: java.lang.String) = this()
  def this(email: java.lang.String, key: java.lang.String) = this()
  def this(email: scala.Null, key: java.lang.String) = this()
  def this(email: java.lang.String, key: java.lang.String, keyId: java.lang.String) = this()
  def this(email: java.lang.String, key: scala.Null, keyId: java.lang.String) = this()
  def this(email: scala.Null, key: java.lang.String, keyId: java.lang.String) = this()
  def this(email: scala.Null, key: scala.Null, keyId: java.lang.String) = this()
  var cache: js.Any = js.native
  var email: js.UndefOr[java.lang.String | scala.Null] = js.native
  var fromStreamAsync: js.Any = js.native
  var key: js.UndefOr[java.lang.String | scala.Null] = js.native
  var keyId: js.UndefOr[java.lang.String | scala.Null] = js.native
  var projectId: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether the credential requires scopes to be created by calling
    * createdScoped before use.
    * @deprecated
    * @return always false
    */
  def createScopedRequired(): scala.Boolean = js.native
  /**
    * Create a JWTAccess credentials instance using the given input options.
    * @param json The input object.
    */
  def fromJSON(json: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.JWTInput): scala.Unit = js.native
  /**
    * Create a JWTAccess credentials instance using the given input stream.
    * @param inputStream The input stream.
    * @param callback Optional callback.
    */
  def fromStream(inputStream: nodeLib.streamMod.Readable): js.Promise[scala.Unit] = js.native
  def fromStream(
    inputStream: nodeLib.streamMod.Readable,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get a non-expired access token, after refreshing if necessary.
    *
    * @param url The URI being authorized.
    * @param additionalClaims An object with a set of additional claims to
    * include in the payload.
    * @returns An object that includes the authorization header.
    */
  def getRequestHeaders(url: java.lang.String): googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers = js.native
  def getRequestHeaders(url: java.lang.String, additionalClaims: Claims): googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.Headers = js.native
  /**
    * Get a non-expired access token, after refreshing if necessary.
    *
    * @param authURI The URI being authorized.
    * @param additionalClaims An object with a set of additional claims to
    * include in the payload.
    * @deprecated Please use `getRequestHeaders` instead.
    * @returns An object that includes the authorization header.
    */
  def getRequestMetadata(url: java.lang.String): googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RequestMetadataResponse = js.native
  def getRequestMetadata(url: java.lang.String, additionalClaims: Claims): googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RequestMetadataResponse = js.native
}

