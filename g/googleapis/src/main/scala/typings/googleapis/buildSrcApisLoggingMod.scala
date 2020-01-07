package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2.Logging
import typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta1
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging", JSImport.Namespace)
@js.native
object buildSrcApisLoggingMod extends js.Object {
  def logging(options: Options): Logging = js.native
  def logging(options: typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1.Options): typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1.Logging = js.native
  @JSName("logging")
  def logging_v2(version: v2): Logging = js.native
  @JSName("logging")
  def logging_v2beta1(version: v2beta1): typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1.Logging = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta1 protected ()
      extends typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1.Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Logging]
            ]
    
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1.Logging
              ]
            ]
    
  }
  
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
  
}

