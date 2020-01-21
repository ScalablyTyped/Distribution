package typings.googleAuthLibrary.iamMod

import typings.googleAuthLibrary.AnonXgoogiamauthorityselector
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/iam", "IAMAuth")
@js.native
class IAMAuth protected () extends js.Object {
  /**
    * IAM credentials.
    *
    * @param selector the iam authority selector
    * @param token the token
    * @constructor
    */
  def this(selector: String, token: String) = this()
  var selector: String = js.native
  var token: String = js.native
  /**
    * Indicates whether the credential requires scopes to be created by calling
    * createdScoped before use.
    * @deprecated
    * @return always false
    */
  def createScopedRequired(): Boolean = js.native
  /**
    * Acquire the HTTP headers required to make an authenticated request.
    */
  def getRequestHeaders(): AnonXgoogiamauthorityselector = js.native
  /**
    * Pass the selector and token to the metadataFn callback.
    * @deprecated
    * @param unused_uri is required of the credentials interface
    * @param metadataFn a callback invoked with object containing request
    * metadata.
    */
  def getRequestMetadata(
    unusedUri: String,
    metadataFn: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[RequestMetadata], Unit]
  ): Unit = js.native
  def getRequestMetadata(
    unusedUri: Null,
    metadataFn: js.Function2[/* err */ Error | Null, /* metadata */ js.UndefOr[RequestMetadata], Unit]
  ): Unit = js.native
}

