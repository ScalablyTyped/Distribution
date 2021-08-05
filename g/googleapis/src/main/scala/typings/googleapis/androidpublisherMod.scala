package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.androidpublisherV1Mod.androidpublisherV1.Androidpublisher
import typings.googleapis.androidpublisherV1Mod.androidpublisherV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1Dot1
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidpublisherMod {
  
  @JSImport("googleapis/build/src/apis/androidpublisher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Androidpublisher {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Androidpublisher
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v1.1")
    @js.native
    class v11 protected ()
      extends typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v1.1")
    @js.native
    def v11: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher
      ] = js.native
    
    inline def v11_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.1")(x.asInstanceOf[js.Any])
    
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Androidpublisher
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v2")
    @js.native
    class v2 protected ()
      extends typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v3")
    @js.native
    class v3 protected ()
      extends typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/androidpublisher", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher
      ] = js.native
    inline def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  }
  
  inline def androidpublisher(options: Options): Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(options.asInstanceOf[js.Any]).asInstanceOf[Androidpublisher]
  inline def androidpublisher(options: typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Options): typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher]
  inline def androidpublisher(options: typings.googleapis.v11Mod.androidpublisherV11.Options): typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher]
  inline def androidpublisher(options: typings.googleapis.v2Mod.androidpublisherV2.Options): typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher]
  
  inline def androidpublisher_v1(version: v1): Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(version.asInstanceOf[js.Any]).asInstanceOf[Androidpublisher]
  
  inline def androidpublisher_v11(version: v1Dot1): typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v11Mod.androidpublisherV11.Androidpublisher]
  
  inline def androidpublisher_v2(version: v2): typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2Mod.androidpublisherV2.Androidpublisher]
  
  inline def androidpublisher_v3(version: v3): typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher = ^.asInstanceOf[js.Dynamic].applyDynamic("androidpublisher")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.androidpublisherV3Mod.androidpublisherV3.Androidpublisher]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/androidpublisher", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/androidpublisher", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/androidpublisher", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidpublisher", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/androidpublisher", "auth.OAuth2")
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
