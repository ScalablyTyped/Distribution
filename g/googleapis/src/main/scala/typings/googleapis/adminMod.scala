package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.datatransferV1Mod.adminDatatransferV1.Admin
import typings.googleapis.datatransferV1Mod.adminDatatransferV1.Options
import typings.googleapis.googleapisStrings.datatransfer_v1
import typings.googleapis.googleapisStrings.directory_v1
import typings.googleapis.googleapisStrings.reports_v1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.datatransfer_v1")
    @js.native
    class datatransferV1 protected () extends Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.datatransfer_v1")
    @js.native
    def datatransferV1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admin] = js.native
    
    @scala.inline
    def datatransferV1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datatransfer_v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.directory_v1")
    @js.native
    class directoryV1 protected ()
      extends typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.directory_v1")
    @js.native
    def directoryV1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin
      ] = js.native
    
    @scala.inline
    def directoryV1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory_v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.reports_v1")
    @js.native
    class reportsV1 protected ()
      extends typings.googleapis.reportsV1Mod.adminReportsV1.Admin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admin", "VERSIONS.reports_v1")
    @js.native
    def reportsV1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.reportsV1Mod.adminReportsV1.Admin
      ] = js.native
    
    @scala.inline
    def reportsV1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.reportsV1Mod.adminReportsV1.Admin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reports_v1")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin(options: Options): Admin = js.native
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin(options: typings.googleapis.directoryV1Mod.adminDirectoryV1.Options): typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin = js.native
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin(options: typings.googleapis.reportsV1Mod.adminReportsV1.Options): typings.googleapis.reportsV1Mod.adminReportsV1.Admin = js.native
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin_datatransferv1(version: datatransfer_v1): Admin = js.native
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin_directoryv1(version: directory_v1): typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin = js.native
  @JSImport("googleapis/build/src/apis/admin", "admin")
  @js.native
  def admin_reportsv1(version: reports_v1): typings.googleapis.reportsV1Mod.adminReportsV1.Admin = js.native
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/admin", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/admin", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "auth.JWT")
    @js.native
    class JWT protected ()
      extends typings.googleAuthLibrary.mod.JWT {
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admin", "auth.OAuth2")
    @js.native
    /**
      * Handles OAuth2 flow for Google APIs.
      *
      * @param clientId The authentication client ID.
      * @param clientSecret The authentication client secret.
      * @param redirectUri The URI to redirect to after completing the auth
      * request.
      * @param opts optional options for overriding the given parameters.
      * @constructor
      */
    class OAuth2 () extends OAuth2Client
    
    type _To = AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: AuthPlus = ^
  }
}
