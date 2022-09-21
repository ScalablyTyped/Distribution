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
import typings.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity
import typings.googleapis.cloudidentityV1Mod.cloudidentityV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudidentityMod {
  
  @JSImport("googleapis/build/src/apis/cloudidentity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/cloudidentity", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudidentity", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Cloudidentity
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Cloudidentity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudidentity", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudidentity", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudidentity", "auth.OAuth2")
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
  
  inline def cloudidentity(options: Options): Cloudidentity = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudidentity")(options.asInstanceOf[js.Any]).asInstanceOf[Cloudidentity]
  inline def cloudidentity(options: typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Options): typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudidentity")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity]
  
  object cloudidentityV1 {
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Cloudidentity")
    @js.native
    open class Cloudidentity protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Customers")
    @js.native
    open class ResourceCustomers protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Customers$Userinvitations")
    @js.native
    open class ResourceCustomersUserinvitations protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceCustomersUserinvitations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Devices")
    @js.native
    open class ResourceDevices protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Devices$Deviceusers")
    @js.native
    open class ResourceDevicesDeviceusers protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceDevicesDeviceusers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Devices$Deviceusers$Clientstates")
    @js.native
    open class ResourceDevicesDeviceusersClientstates protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceDevicesDeviceusersClientstates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Groups")
    @js.native
    open class ResourceGroups protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceGroups {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1.Resource$Groups$Memberships")
    @js.native
    open class ResourceGroupsMemberships protected ()
      extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.ResourceGroupsMemberships {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object cloudidentityV1beta1 {
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Cloudidentity")
    @js.native
    open class Cloudidentity protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Customers")
    @js.native
    open class ResourceCustomers protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Customers$Userinvitations")
    @js.native
    open class ResourceCustomersUserinvitations protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceCustomersUserinvitations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Devices")
    @js.native
    open class ResourceDevices protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Devices$Deviceusers")
    @js.native
    open class ResourceDevicesDeviceusers protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceDevicesDeviceusers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Devices$Deviceusers$Clientstates")
    @js.native
    open class ResourceDevicesDeviceusersClientstates protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceDevicesDeviceusersClientstates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Groups")
    @js.native
    open class ResourceGroups protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceGroups {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Groups$Memberships")
    @js.native
    open class ResourceGroupsMemberships protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceGroupsMemberships {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Orgunits")
    @js.native
    open class ResourceOrgunits protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceOrgunits {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudidentity", "cloudidentity_v1beta1.Resource$Orgunits$Memberships")
    @js.native
    open class ResourceOrgunitsMemberships protected ()
      extends typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.ResourceOrgunitsMemberships {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def cloudidentity_v1(version: v1): Cloudidentity = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudidentity")(version.asInstanceOf[js.Any]).asInstanceOf[Cloudidentity]
  
  inline def cloudidentity_v1beta1(version: v1beta1): typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudidentity")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1.Cloudidentity]
}
