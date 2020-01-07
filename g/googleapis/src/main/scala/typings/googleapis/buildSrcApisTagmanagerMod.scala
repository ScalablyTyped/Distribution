package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1.Options
import typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1.Tagmanager
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager", JSImport.Namespace)
@js.native
object buildSrcApisTagmanagerMod extends js.Object {
  def tagmanager(options: Options): Tagmanager = js.native
  def tagmanager(options: typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2.Options): typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2.Tagmanager = js.native
  @JSName("tagmanager")
  def tagmanager_v1(version: v1): Tagmanager = js.native
  @JSName("tagmanager")
  def tagmanager_v2(version: v2): typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2.Tagmanager = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Tagmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2.Tagmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Tagmanager]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2.Tagmanager
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

