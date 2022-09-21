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
import typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin
import typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigtableadminMod {
  
  @JSImport("googleapis/build/src/apis/bigtableadmin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/bigtableadmin", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/bigtableadmin", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Bigtableadmin
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Bigtableadmin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "VERSIONS.v2")
    @js.native
    open class v2 protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/bigtableadmin", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/bigtableadmin", "auth.OAuth2")
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
  
  inline def bigtableadmin(options: Options): Bigtableadmin = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtableadmin")(options.asInstanceOf[js.Any]).asInstanceOf[Bigtableadmin]
  inline def bigtableadmin(options: typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Options): typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtableadmin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin]
  
  object bigtableadminV1 {
    
    /**
      * Cloud Bigtable Admin API
      *
      * Administer your Cloud Bigtable tables and instances.
      *
      * @example
      * ```js
      * const {google} = require('googleapis');
      * const bigtableadmin = google.bigtableadmin('v1');
      * ```
      */
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v1.Bigtableadmin")
    @js.native
    open class Bigtableadmin protected ()
      extends typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object bigtableadminV2 {
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Bigtableadmin")
    @js.native
    open class Bigtableadmin protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Operations$Projects")
    @js.native
    open class ResourceOperationsProjects protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperationsProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Operations$Projects$Operations")
    @js.native
    open class ResourceOperationsProjectsOperations protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceOperationsProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances")
    @js.native
    open class ResourceProjectsInstances protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances$Appprofiles")
    @js.native
    open class ResourceProjectsInstancesAppprofiles protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesAppprofiles {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances$Clusters")
    @js.native
    open class ResourceProjectsInstancesClusters protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesClusters {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances$Clusters$Backups")
    @js.native
    open class ResourceProjectsInstancesClustersBackups protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesClustersBackups {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances$Clusters$Hottablets")
    @js.native
    open class ResourceProjectsInstancesClustersHottablets protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesClustersHottablets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Instances$Tables")
    @js.native
    open class ResourceProjectsInstancesTables protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsInstancesTables {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/bigtableadmin", "bigtableadmin_v2.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def bigtableadmin_v1(version: v1): Bigtableadmin = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtableadmin")(version.asInstanceOf[js.Any]).asInstanceOf[Bigtableadmin]
  
  inline def bigtableadmin_v2(version: v2): typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin = ^.asInstanceOf[js.Dynamic].applyDynamic("bigtableadmin")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin]
}
