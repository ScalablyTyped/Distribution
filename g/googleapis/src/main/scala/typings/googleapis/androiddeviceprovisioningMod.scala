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
import typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.Androiddeviceprovisioning
import typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androiddeviceprovisioningMod {
  
  @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Androiddeviceprovisioning {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Androiddeviceprovisioning
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Androiddeviceprovisioning
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  inline def androiddeviceprovisioning(options: Options): Androiddeviceprovisioning = ^.asInstanceOf[js.Dynamic].applyDynamic("androiddeviceprovisioning")(options.asInstanceOf[js.Any]).asInstanceOf[Androiddeviceprovisioning]
  
  object androiddeviceprovisioningV1 {
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Androiddeviceprovisioning")
    @js.native
    open class Androiddeviceprovisioning protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.Androiddeviceprovisioning {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Customers")
    @js.native
    open class ResourceCustomers protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Customers$Configurations")
    @js.native
    open class ResourceCustomersConfigurations protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersConfigurations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Customers$Devices")
    @js.native
    open class ResourceCustomersDevices protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Customers$Dpcs")
    @js.native
    open class ResourceCustomersDpcs protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceCustomersDpcs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Partners")
    @js.native
    open class ResourcePartners protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartners {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Partners$Customers")
    @js.native
    open class ResourcePartnersCustomers protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Partners$Devices")
    @js.native
    open class ResourcePartnersDevices protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Partners$Vendors")
    @js.native
    open class ResourcePartnersVendors protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersVendors {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "androiddeviceprovisioning_v1.Resource$Partners$Vendors$Customers")
    @js.native
    open class ResourcePartnersVendorsCustomers protected ()
      extends typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1.ResourcePartnersVendorsCustomers {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def androiddeviceprovisioning_v1(version: v1): Androiddeviceprovisioning = ^.asInstanceOf[js.Dynamic].applyDynamic("androiddeviceprovisioning")(version.asInstanceOf[js.Any]).asInstanceOf[Androiddeviceprovisioning]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/androiddeviceprovisioning", "auth.OAuth2")
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
