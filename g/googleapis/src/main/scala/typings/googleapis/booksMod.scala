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
import typings.googleapis.booksV1Mod.booksV1.Books
import typings.googleapis.booksV1Mod.booksV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booksMod {
  
  @JSImport("googleapis/build/src/apis/books", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/books", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/books", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/books", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Books {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/books", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Books] = js.native
    inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Books]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/books", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/books", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/books", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/books", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/books", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/books", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/books", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/books", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/books", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/books", "auth.OAuth2")
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
  
  inline def books(options: Options): Books = ^.asInstanceOf[js.Dynamic].applyDynamic("books")(options.asInstanceOf[js.Any]).asInstanceOf[Books]
  
  object booksV1 {
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Books")
    @js.native
    open class Books protected ()
      extends typings.googleapis.booksV1Mod.booksV1.Books {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Bookshelves")
    @js.native
    open class ResourceBookshelves protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceBookshelves {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Bookshelves$Volumes")
    @js.native
    open class ResourceBookshelvesVolumes protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceBookshelvesVolumes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Cloudloading")
    @js.native
    open class ResourceCloudloading protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceCloudloading {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Dictionary")
    @js.native
    open class ResourceDictionary protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceDictionary {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Familysharing")
    @js.native
    open class ResourceFamilysharing protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceFamilysharing {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Layers")
    @js.native
    open class ResourceLayers protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceLayers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Layers$Annotationdata")
    @js.native
    open class ResourceLayersAnnotationdata protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceLayersAnnotationdata {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Layers$Volumeannotations")
    @js.native
    open class ResourceLayersVolumeannotations protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceLayersVolumeannotations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Myconfig")
    @js.native
    open class ResourceMyconfig protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMyconfig {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Mylibrary")
    @js.native
    open class ResourceMylibrary protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibrary {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Mylibrary$Annotations")
    @js.native
    open class ResourceMylibraryAnnotations protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryAnnotations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Mylibrary$Bookshelves")
    @js.native
    open class ResourceMylibraryBookshelves protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryBookshelves {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Mylibrary$Bookshelves$Volumes")
    @js.native
    open class ResourceMylibraryBookshelvesVolumes protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryBookshelvesVolumes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Mylibrary$Readingpositions")
    @js.native
    open class ResourceMylibraryReadingpositions protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceMylibraryReadingpositions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Notification")
    @js.native
    open class ResourceNotification protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceNotification {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Onboarding")
    @js.native
    open class ResourceOnboarding protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceOnboarding {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Personalizedstream")
    @js.native
    open class ResourcePersonalizedstream protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourcePersonalizedstream {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Promooffer")
    @js.native
    open class ResourcePromooffer protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourcePromooffer {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Series")
    @js.native
    open class ResourceSeries protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceSeries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Series$Membership")
    @js.native
    open class ResourceSeriesMembership protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceSeriesMembership {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Volumes")
    @js.native
    open class ResourceVolumes protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Volumes$Associated")
    @js.native
    open class ResourceVolumesAssociated protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesAssociated {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Volumes$Mybooks")
    @js.native
    open class ResourceVolumesMybooks protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesMybooks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Volumes$Recommended")
    @js.native
    open class ResourceVolumesRecommended protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesRecommended {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/books", "books_v1.Resource$Volumes$Useruploaded")
    @js.native
    open class ResourceVolumesUseruploaded protected ()
      extends typings.googleapis.booksV1Mod.booksV1.ResourceVolumesUseruploaded {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def books_v1(version: v1): Books = ^.asInstanceOf[js.Dynamic].applyDynamic("books")(version.asInstanceOf[js.Any]).asInstanceOf[Books]
}
