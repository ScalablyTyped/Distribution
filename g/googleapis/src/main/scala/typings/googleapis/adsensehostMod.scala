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
import typings.googleapis.googleapisStrings.v4Dot1
import typings.googleapis.v41Mod.adsensehostV41.Adsensehost
import typings.googleapis.v41Mod.adsensehostV41.Options
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adsensehostMod {
  
  @JSImport("googleapis/build/src/apis/adsensehost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/adsensehost", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/adsensehost", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adsensehost", "VERSIONS.v4.1")
    @js.native
    open class v41 protected () extends Adsensehost {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "VERSIONS.v4.1")
    @js.native
    def v41: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Adsensehost
      ] = js.native
    
    inline def v41_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Adsensehost
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4.1")(x.asInstanceOf[js.Any])
  }
  
  inline def adsensehost(options: Options): Adsensehost = ^.asInstanceOf[js.Dynamic].applyDynamic("adsensehost")(options.asInstanceOf[js.Any]).asInstanceOf[Adsensehost]
  
  object adsensehostV41 {
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Adsensehost")
    @js.native
    open class Adsensehost protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.Adsensehost {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAccounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Accounts$Adclients")
    @js.native
    open class ResourceAccountsAdclients protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAccountsAdclients {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Accounts$Adunits")
    @js.native
    open class ResourceAccountsAdunits protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAccountsAdunits {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Accounts$Reports")
    @js.native
    open class ResourceAccountsReports protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAccountsReports {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Adclients")
    @js.native
    open class ResourceAdclients protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAdclients {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Associationsessions")
    @js.native
    open class ResourceAssociationsessions protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceAssociationsessions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Customchannels")
    @js.native
    open class ResourceCustomchannels protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceCustomchannels {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Reports")
    @js.native
    open class ResourceReports protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceReports {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/adsensehost", "adsensehost_v4_1.Resource$Urlchannels")
    @js.native
    open class ResourceUrlchannels protected ()
      extends typings.googleapis.v41Mod.adsensehostV41.ResourceUrlchannels {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def adsensehost_v41(version: v4Dot1): Adsensehost = ^.asInstanceOf[js.Dynamic].applyDynamic("adsensehost")(version.asInstanceOf[js.Any]).asInstanceOf[Adsensehost]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/adsensehost", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/adsensehost", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/adsensehost", "auth.OAuth2")
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
