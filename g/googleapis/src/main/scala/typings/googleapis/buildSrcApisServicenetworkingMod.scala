package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1.Options
import typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1.Servicenetworking
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicenetworking", JSImport.Namespace)
@js.native
object buildSrcApisServicenetworkingMod extends js.Object {
  def servicenetworking(options: Options): Servicenetworking = js.native
  def servicenetworking(
    options: typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta.Options
  ): typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta.Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1(version: v1): Servicenetworking = js.native
  @JSName("servicenetworking")
  def servicenetworking_v1beta(version: v1beta): typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta.Servicenetworking = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta protected ()
      extends typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Servicenetworking
              ]
            ]
    
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta.Servicenetworking
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

