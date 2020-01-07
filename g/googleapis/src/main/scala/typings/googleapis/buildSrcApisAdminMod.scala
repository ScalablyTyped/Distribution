package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1.Admin
import typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1.Options
import typings.googleapis.googleapisStrings.datatransfer_v1
import typings.googleapis.googleapisStrings.directory_v1
import typings.googleapis.googleapisStrings.reports_v1
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin", JSImport.Namespace)
@js.native
object buildSrcApisAdminMod extends js.Object {
  def admin(options: Options): Admin = js.native
  def admin(options: typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1.Options): typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1.Admin = js.native
  def admin(options: typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Options): typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Admin = js.native
  @JSName("admin")
  def admin_datatransferv1(version: datatransfer_v1): Admin = js.native
  @JSName("admin")
  def admin_directoryv1(version: directory_v1): typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1.Admin = js.native
  @JSName("admin")
  def admin_reportsv1(version: reports_v1): typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Admin = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class datatransfer_v1 protected () extends Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class directory_v1 protected ()
      extends typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1.Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class reports_v1 protected ()
      extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object datatransfer_v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Admin]
            ]
    
    @js.native
    object directory_v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1.Admin
              ]
            ]
    
    @js.native
    object reports_v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Admin
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

