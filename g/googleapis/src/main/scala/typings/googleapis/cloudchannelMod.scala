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
import typings.googleapis.cloudchannelV1Mod.cloudchannelV1.Cloudchannel
import typings.googleapis.cloudchannelV1Mod.cloudchannelV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudchannelMod {
  
  @JSImport("googleapis/build/src/apis/cloudchannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/cloudchannel", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudchannel", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Cloudchannel {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudchannel", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Cloudchannel
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Cloudchannel
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudchannel", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudchannel", "auth.OAuth2")
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
  
  inline def cloudchannel(options: Options): Cloudchannel = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudchannel")(options.asInstanceOf[js.Any]).asInstanceOf[Cloudchannel]
  
  object cloudchannelV1 {
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Cloudchannel")
    @js.native
    open class Cloudchannel protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.Cloudchannel {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Channelpartnerlinks")
    @js.native
    open class ResourceAccountsChannelpartnerlinks protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsChannelpartnerlinks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Channelpartnerlinks$Channelpartnerrepricingconfigs")
    @js.native
    open class ResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigs protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsChannelpartnerlinksChannelpartnerrepricingconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Channelpartnerlinks$Customers")
    @js.native
    open class ResourceAccountsChannelpartnerlinksCustomers protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsChannelpartnerlinksCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Customers")
    @js.native
    open class ResourceAccountsCustomers protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Customers$Customerrepricingconfigs")
    @js.native
    open class ResourceAccountsCustomersCustomerrepricingconfigs protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsCustomersCustomerrepricingconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Customers$Entitlements")
    @js.native
    open class ResourceAccountsCustomersEntitlements protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsCustomersEntitlements {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Accounts$Offers")
    @js.native
    open class ResourceAccountsOffers protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceAccountsOffers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Products")
    @js.native
    open class ResourceProducts protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceProducts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudchannel", "cloudchannel_v1.Resource$Products$Skus")
    @js.native
    open class ResourceProductsSkus protected ()
      extends typings.googleapis.cloudchannelV1Mod.cloudchannelV1.ResourceProductsSkus {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def cloudchannel_v1(version: v1): Cloudchannel = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudchannel")(version.asInstanceOf[js.Any]).asInstanceOf[Cloudchannel]
}
