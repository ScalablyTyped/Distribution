package typings.googleapis.buildSrcApisAdsenseMod

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense", "auth")
@js.native
object auth extends TopLevel[AuthPlus] {
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  class Compute ()
    extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
  
  @js.native
  class JWT protected ()
    extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT {
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
  }
  
}

