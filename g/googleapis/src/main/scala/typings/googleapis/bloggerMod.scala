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
import typings.googleapis.bloggerV2Mod.bloggerV2.Blogger
import typings.googleapis.bloggerV2Mod.bloggerV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloggerMod {
  
  @JSImport("googleapis/build/src/apis/blogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/blogger", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/blogger", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "VERSIONS.v2")
    @js.native
    open class v2 protected () extends Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/blogger", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Blogger] = js.native
    inline def v2_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Blogger]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "VERSIONS.v3")
    @js.native
    open class v3 protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/blogger", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.bloggerV3Mod.bloggerV3.Blogger
      ] = js.native
    inline def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.bloggerV3Mod.bloggerV3.Blogger
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/blogger", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/blogger", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/blogger", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/blogger", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/blogger", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/blogger", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/blogger", "auth.OAuth2")
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
  
  inline def blogger(options: Options): Blogger = ^.asInstanceOf[js.Dynamic].applyDynamic("blogger")(options.asInstanceOf[js.Any]).asInstanceOf[Blogger]
  inline def blogger(options: typings.googleapis.bloggerV3Mod.bloggerV3.Options): typings.googleapis.bloggerV3Mod.bloggerV3.Blogger = ^.asInstanceOf[js.Dynamic].applyDynamic("blogger")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.bloggerV3Mod.bloggerV3.Blogger]
  
  object bloggerV2 {
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Blogger")
    @js.native
    open class Blogger protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Resource$Blogs")
    @js.native
    open class ResourceBlogs protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceBlogs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Resource$Comments")
    @js.native
    open class ResourceComments protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceComments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Resource$Pages")
    @js.native
    open class ResourcePages protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Resource$Posts")
    @js.native
    open class ResourcePosts protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourcePosts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v2.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.bloggerV2Mod.bloggerV2.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object bloggerV3 {
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Blogger")
    @js.native
    open class Blogger protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.Blogger {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Blogs")
    @js.native
    open class ResourceBlogs protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceBlogs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Bloguserinfos")
    @js.native
    open class ResourceBloguserinfos protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceBloguserinfos {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Comments")
    @js.native
    open class ResourceComments protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceComments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Pages")
    @js.native
    open class ResourcePages protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Pageviews")
    @js.native
    open class ResourcePageviews protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePageviews {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Posts")
    @js.native
    open class ResourcePosts protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePosts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Postuserinfos")
    @js.native
    open class ResourcePostuserinfos protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourcePostuserinfos {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/blogger", "blogger_v3.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.bloggerV3Mod.bloggerV3.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def blogger_v2(version: v2): Blogger = ^.asInstanceOf[js.Dynamic].applyDynamic("blogger")(version.asInstanceOf[js.Any]).asInstanceOf[Blogger]
  
  inline def blogger_v3(version: v3): typings.googleapis.bloggerV3Mod.bloggerV3.Blogger = ^.asInstanceOf[js.Dynamic].applyDynamic("blogger")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.bloggerV3Mod.bloggerV3.Blogger]
}
