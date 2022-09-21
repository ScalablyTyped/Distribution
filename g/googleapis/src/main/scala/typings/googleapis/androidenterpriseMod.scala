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
import typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.Androidenterprise
import typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidenterpriseMod {
  
  @JSImport("googleapis/build/src/apis/androidenterprise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/androidenterprise", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidenterprise", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Androidenterprise {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/androidenterprise", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Androidenterprise
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Androidenterprise
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  inline def androidenterprise(options: Options): Androidenterprise = ^.asInstanceOf[js.Dynamic].applyDynamic("androidenterprise")(options.asInstanceOf[js.Any]).asInstanceOf[Androidenterprise]
  
  object androidenterpriseV1 {
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Androidenterprise")
    @js.native
    open class Androidenterprise protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.Androidenterprise {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Devices")
    @js.native
    open class ResourceDevices protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Enterprises")
    @js.native
    open class ResourceEnterprises protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceEnterprises {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Entitlements")
    @js.native
    open class ResourceEntitlements protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceEntitlements {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Grouplicenses")
    @js.native
    open class ResourceGrouplicenses protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceGrouplicenses {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Grouplicenseusers")
    @js.native
    open class ResourceGrouplicenseusers protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceGrouplicenseusers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Installs")
    @js.native
    open class ResourceInstalls protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceInstalls {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Managedconfigurationsfordevice")
    @js.native
    open class ResourceManagedconfigurationsfordevice protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceManagedconfigurationsfordevice {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Managedconfigurationsforuser")
    @js.native
    open class ResourceManagedconfigurationsforuser protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceManagedconfigurationsforuser {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Managedconfigurationssettings")
    @js.native
    open class ResourceManagedconfigurationssettings protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceManagedconfigurationssettings {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Permissions")
    @js.native
    open class ResourcePermissions protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourcePermissions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Products")
    @js.native
    open class ResourceProducts protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceProducts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Serviceaccountkeys")
    @js.native
    open class ResourceServiceaccountkeys protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceServiceaccountkeys {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Storelayoutclusters")
    @js.native
    open class ResourceStorelayoutclusters protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceStorelayoutclusters {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Storelayoutpages")
    @js.native
    open class ResourceStorelayoutpages protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceStorelayoutpages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "androidenterprise_v1.Resource$Webapps")
    @js.native
    open class ResourceWebapps protected ()
      extends typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1.ResourceWebapps {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def androidenterprise_v1(version: v1): Androidenterprise = ^.asInstanceOf[js.Dynamic].applyDynamic("androidenterprise")(version.asInstanceOf[js.Any]).asInstanceOf[Androidenterprise]
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/androidenterprise", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/androidenterprise", "auth.OAuth2")
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
