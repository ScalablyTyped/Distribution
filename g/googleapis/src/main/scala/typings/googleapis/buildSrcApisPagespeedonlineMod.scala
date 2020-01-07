package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisPagespeedonlineV1Mod.pagespeedonline_v1.Options
import typings.googleapis.buildSrcApisPagespeedonlineV1Mod.pagespeedonline_v1.Pagespeedonline
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v4
import typings.googleapis.googleapisStrings.v5
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pagespeedonline", JSImport.Namespace)
@js.native
object buildSrcApisPagespeedonlineMod extends js.Object {
  def pagespeedonline(options: Options): Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Options): typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Options): typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Options): typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v1(version: v1): Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v2(version: v2): typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v4(version: v4): typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v5(version: v5): typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Pagespeedonline = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v4 protected ()
      extends typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v5 protected ()
      extends typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Pagespeedonline
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Pagespeedonline
              ]
            ]
    
    @js.native
    object v4
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Pagespeedonline
              ]
            ]
    
    @js.native
    object v5
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5.Pagespeedonline
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

