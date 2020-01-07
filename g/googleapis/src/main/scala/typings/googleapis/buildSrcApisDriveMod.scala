package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Drive
import typings.googleapis.buildSrcApisDriveV2Mod.drive_v2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive", JSImport.Namespace)
@js.native
object buildSrcApisDriveMod extends js.Object {
  def drive(options: Options): Drive = js.native
  def drive(options: typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Options): typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Drive = js.native
  @JSName("drive")
  def drive_v2(version: v2): Drive = js.native
  @JSName("drive")
  def drive_v3(version: v3): typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Drive = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Drive {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v3 protected ()
      extends typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Drive {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Drive]
            ]
    
    @js.native
    object v3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisDriveV3Mod.drive_v3.Drive
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

