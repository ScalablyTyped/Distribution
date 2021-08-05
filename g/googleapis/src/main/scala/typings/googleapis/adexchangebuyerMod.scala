package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1Dot2
import typings.googleapis.googleapisStrings.v1Dot3
import typings.googleapis.googleapisStrings.v1Dot4
import typings.googleapis.v12Mod.adexchangebuyerV12.Adexchangebuyer
import typings.googleapis.v12Mod.adexchangebuyerV12.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexchangebuyerMod {
  
  @JSImport("googleapis/build/src/apis/adexchangebuyer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.2")
    @js.native
    class v12 protected () extends Adexchangebuyer {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.2")
    @js.native
    def v12: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Adexchangebuyer
      ] = js.native
    
    inline def v12_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Adexchangebuyer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.3")
    @js.native
    class v13 protected ()
      extends typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.3")
    @js.native
    def v13: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer
      ] = js.native
    
    inline def v13_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.3")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.4")
    @js.native
    class v14 protected ()
      extends typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "VERSIONS.v1.4")
    @js.native
    def v14: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer
      ] = js.native
    
    inline def v14_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.4")(x.asInstanceOf[js.Any])
  }
  
  inline def adexchangebuyer(options: Options): Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(options.asInstanceOf[js.Any]).asInstanceOf[Adexchangebuyer]
  inline def adexchangebuyer(options: typings.googleapis.v13Mod.adexchangebuyerV13.Options): typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer]
  inline def adexchangebuyer(options: typings.googleapis.v14Mod.adexchangebuyerV14.Options): typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer]
  
  inline def adexchangebuyer_v12(version: v1Dot2): Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(version.asInstanceOf[js.Any]).asInstanceOf[Adexchangebuyer]
  
  inline def adexchangebuyer_v13(version: v1Dot3): typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer]
  
  inline def adexchangebuyer_v14(version: v1Dot4): typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer = ^.asInstanceOf[js.Dynamic].applyDynamic("adexchangebuyer")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/adexchangebuyer", "auth.OAuth2")
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
