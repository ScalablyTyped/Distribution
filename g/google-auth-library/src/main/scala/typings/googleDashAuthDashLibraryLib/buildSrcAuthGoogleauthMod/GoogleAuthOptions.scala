package typings
package googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleAuthOptions extends js.Object {
  /**
       * Object containing client_email and private_key properties
       */
  var credentials: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody] = js.undefined
  /**
       * Path to a .json, .pem, or .p12 key file
       */
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Path to a .json, .pem, or .p12 key file
       */
  var keyFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Your project ID.
       */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Required scopes for the desired API request
       */
  var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

