package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisVisionV1Mod.vision_v1.Options
import typings.googleapis.buildSrcApisVisionV1Mod.vision_v1.Vision
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1p1beta1
import typings.googleapis.googleapisStrings.v1p2beta1
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision", JSImport.Namespace)
@js.native
object buildSrcApisVisionMod extends js.Object {
  def vision(options: Options): Vision = js.native
  def vision(options: typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1.Options): typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1.Vision = js.native
  def vision(options: typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Options): typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Vision = js.native
  @JSName("vision")
  def vision_v1(version: v1): Vision = js.native
  @JSName("vision")
  def vision_v1p1beta1(version: v1p1beta1): typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1.Vision = js.native
  @JSName("vision")
  def vision_v1p2beta1(version: v1p2beta1): typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Vision = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p1beta1 protected ()
      extends typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1.Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p2beta1 protected ()
      extends typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Vision {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Vision]
            ]
    
    @js.native
    object v1p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1.Vision
              ]
            ]
    
    @js.native
    object v1p2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1.Vision
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

