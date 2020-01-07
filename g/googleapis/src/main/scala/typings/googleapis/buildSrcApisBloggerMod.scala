package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2.Blogger
import typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger", JSImport.Namespace)
@js.native
object buildSrcApisBloggerMod extends js.Object {
  def blogger(options: Options): Blogger = js.native
  def blogger(options: typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Options): typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Blogger = js.native
  @JSName("blogger")
  def blogger_v2(version: v2): Blogger = js.native
  @JSName("blogger")
  def blogger_v3(version: v3): typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Blogger = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3 protected ()
      extends typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Blogger]
            ]
    
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3.Blogger
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

