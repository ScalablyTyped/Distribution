package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v2Dot4
import typings.googleapis.googleapisStrings.v3
import typings.googleapis.v24Mod.analyticsV24.Analytics
import typings.googleapis.v24Mod.analyticsV24.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @JSImport("googleapis/build/src/apis/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/analytics", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/analytics", "VERSIONS.v2.4")
    @js.native
    class v24 protected () extends Analytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/analytics", "VERSIONS.v2.4")
    @js.native
    def v24: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Analytics] = js.native
    
    inline def v24_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Analytics]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2.4")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/analytics", "VERSIONS.v3")
    @js.native
    class v3 protected ()
      extends typings.googleapis.v3Mod.analyticsV3.Analytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/analytics", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v3Mod.analyticsV3.Analytics
      ] = js.native
    inline def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v3Mod.analyticsV3.Analytics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  }
  
  inline def analytics(options: Options): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("analytics")(options.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  inline def analytics(options: typings.googleapis.v3Mod.analyticsV3.Options): typings.googleapis.v3Mod.analyticsV3.Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("analytics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v3Mod.analyticsV3.Analytics]
  
  inline def analytics_v24(version: v2Dot4): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("analytics")(version.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  
  inline def analytics_v3(version: v3): typings.googleapis.v3Mod.analyticsV3.Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("analytics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v3Mod.analyticsV3.Analytics]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/analytics", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/analytics", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/analytics", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/analytics", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/analytics", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/analytics", "auth.OAuth2")
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
