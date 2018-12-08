package typings
package googleDashAuthDashLibraryLib.buildSrcAuthIamMod

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
  def this(selector: java.lang.String, token: java.lang.String) = this()
  var selector: java.lang.String = js.native
  var token: java.lang.String = js.native
  /**
       * Indicates whether the credential requires scopes to be created by calling
       * createdScoped before use.
       * @deprecated
       * @return always false
       */
  def createScopedRequired(): scala.Boolean = js.native
  /**
       * Acquire the HTTP headers required to make an authenticated request.
       */
  def getRequestHeaders(): googleDashAuthDashLibraryLib.Anon_Xgoogiamauthorityselector = js.native
  /**
       * Pass the selector and token to the metadataFn callback.
       * @deprecated
       * @param unused_uri is required of the credentials interface
       * @param metadataFn a callback invoked with object containing request
       * metadata.
       */
  def getRequestMetadata(
    unusedUri: java.lang.String,
    metadataFn: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[RequestMetadata], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Pass the selector and token to the metadataFn callback.
       * @deprecated
       * @param unused_uri is required of the credentials interface
       * @param metadataFn a callback invoked with object containing request
       * metadata.
       */
  def getRequestMetadata(
    unusedUri: scala.Null,
    metadataFn: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[RequestMetadata], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

