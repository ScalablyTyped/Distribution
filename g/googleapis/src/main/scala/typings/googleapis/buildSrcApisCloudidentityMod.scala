package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1.Cloudidentity
import typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudidentity", JSImport.Namespace)
@js.native
object buildSrcApisCloudidentityMod extends js.Object {
  def cloudidentity(options: Options): Cloudidentity = js.native
  def cloudidentity(options: typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1.Options): typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1.Cloudidentity = js.native
  @JSName("cloudidentity")
  def cloudidentity_v1(version: v1): Cloudidentity = js.native
  @JSName("cloudidentity")
  def cloudidentity_v1beta1(version: v1beta1): typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1.Cloudidentity = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1.Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Cloudidentity
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1.Cloudidentity
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

