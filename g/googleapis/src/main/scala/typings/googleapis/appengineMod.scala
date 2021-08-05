package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.appengineV1Mod.appengineV1.Appengine
import typings.googleapis.appengineV1Mod.appengineV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appengineMod {
  
  @JSImport("googleapis/build/src/apis/appengine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Appengine] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Appengine]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1alpha")
    @js.native
    class v1alpha protected ()
      extends typings.googleapis.v1alphaMod.appengineV1alpha.Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1alphaMod.appengineV1alpha.Appengine
      ] = js.native
    inline def v1alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1alphaMod.appengineV1alpha.Appengine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1beta")
    @js.native
    class v1beta protected ()
      extends typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/appengine", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  inline def appengine(options: Options): Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(options.asInstanceOf[js.Any]).asInstanceOf[Appengine]
  inline def appengine(options: typings.googleapis.appengineV1betaMod.appengineV1beta.Options): typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine]
  inline def appengine(options: typings.googleapis.v1alphaMod.appengineV1alpha.Options): typings.googleapis.v1alphaMod.appengineV1alpha.Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1alphaMod.appengineV1alpha.Appengine]
  
  inline def appengine_v1(version: v1): Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(version.asInstanceOf[js.Any]).asInstanceOf[Appengine]
  
  inline def appengine_v1alpha(version: v1alpha): typings.googleapis.v1alphaMod.appengineV1alpha.Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1alphaMod.appengineV1alpha.Appengine]
  
  inline def appengine_v1beta(version: v1beta): typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine = ^.asInstanceOf[js.Dynamic].applyDynamic("appengine")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/appengine", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/appengine", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/appengine", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/appengine", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/appengine", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/appengine", "auth.OAuth2")
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
