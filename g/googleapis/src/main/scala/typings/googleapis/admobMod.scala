package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.admobV1Mod.admobV1.Admob
import typings.googleapis.admobV1Mod.admobV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admobMod {
  
  @JSImport("googleapis/build/src/apis/admob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/admob", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/admob", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Admob {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/admob", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admob] = js.native
    inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Admob]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.Admob {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/admob", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.admobV1betaMod.admobV1beta.Admob
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.admobV1betaMod.admobV1beta.Admob
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  inline def admob(options: Options): Admob = ^.asInstanceOf[js.Dynamic].applyDynamic("admob")(options.asInstanceOf[js.Any]).asInstanceOf[Admob]
  inline def admob(options: typings.googleapis.admobV1betaMod.admobV1beta.Options): typings.googleapis.admobV1betaMod.admobV1beta.Admob = ^.asInstanceOf[js.Dynamic].applyDynamic("admob")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.admobV1betaMod.admobV1beta.Admob]
  
  object admobV1 {
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Admob")
    @js.native
    open class Admob protected ()
      extends typings.googleapis.admobV1Mod.admobV1.Admob {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected ()
      extends typings.googleapis.admobV1Mod.admobV1.ResourceAccounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Resource$Accounts$Adunits")
    @js.native
    open class ResourceAccountsAdunits protected ()
      extends typings.googleapis.admobV1Mod.admobV1.ResourceAccountsAdunits {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Resource$Accounts$Apps")
    @js.native
    open class ResourceAccountsApps protected ()
      extends typings.googleapis.admobV1Mod.admobV1.ResourceAccountsApps {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Resource$Accounts$Mediationreport")
    @js.native
    open class ResourceAccountsMediationreport protected ()
      extends typings.googleapis.admobV1Mod.admobV1.ResourceAccountsMediationreport {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1.Resource$Accounts$Networkreport")
    @js.native
    open class ResourceAccountsNetworkreport protected ()
      extends typings.googleapis.admobV1Mod.admobV1.ResourceAccountsNetworkreport {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object admobV1beta {
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Admob")
    @js.native
    open class Admob protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.Admob {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts$Adsources")
    @js.native
    open class ResourceAccountsAdsources protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccountsAdsources {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts$Adunits")
    @js.native
    open class ResourceAccountsAdunits protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccountsAdunits {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts$Apps")
    @js.native
    open class ResourceAccountsApps protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccountsApps {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts$Mediationreport")
    @js.native
    open class ResourceAccountsMediationreport protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccountsMediationreport {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/admob", "admob_v1beta.Resource$Accounts$Networkreport")
    @js.native
    open class ResourceAccountsNetworkreport protected ()
      extends typings.googleapis.admobV1betaMod.admobV1beta.ResourceAccountsNetworkreport {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def admob_v1(version: v1): Admob = ^.asInstanceOf[js.Dynamic].applyDynamic("admob")(version.asInstanceOf[js.Any]).asInstanceOf[Admob]
  
  inline def admob_v1beta(version: v1beta): typings.googleapis.admobV1betaMod.admobV1beta.Admob = ^.asInstanceOf[js.Dynamic].applyDynamic("admob")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.admobV1betaMod.admobV1beta.Admob]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/admob", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.AwsClient")
    @js.native
    open class AwsClient protected ()
      extends typings.googleAuthLibrary.mod.AwsClient {
      /**
        * Instantiates an AwsClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid AWS credential.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: AwsClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    open class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/admob", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.IdentityPoolClient")
    @js.native
    open class IdentityPoolClient protected ()
      extends typings.googleAuthLibrary.mod.IdentityPoolClient {
      /**
        * Instantiate an IdentityPoolClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid file-sourced or
        * url-sourced credential or a workforce pool user project is provided
        * with a non workforce audience.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: IdentityPoolClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/admob", "auth.JWT")
    @js.native
    open class JWT protected ()
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
    @JSImport("googleapis/build/src/apis/admob", "auth.OAuth2")
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
    open class OAuth2 () extends OAuth2Client
    
    type _To = typings.googleapisCommon.mod.AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleapisCommon.mod.AuthPlus = ^
  }
}
