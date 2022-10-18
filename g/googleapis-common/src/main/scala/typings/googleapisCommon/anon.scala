package typings.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient
import typings.googleAuthLibrary.buildSrcAuthExternalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.mod.ExternalAccountClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: String
  }
  object Description {
    
    inline def apply(description: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fragment extends StObject {
    
    var fragment: String
  }
  object Fragment {
    
    inline def apply(fragment: String): Fragment = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    }
  }
  
  trait Oauth2 extends StObject {
    
    var oauth2: Scopes
  }
  object Oauth2 {
    
    inline def apply(oauth2: Scopes): Oauth2 = {
      val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauth2]
    }
    
    extension [Self <: Oauth2](x: Self) {
      
      inline def setOauth2(value: Scopes): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Protocols extends StObject {
    
    var protocols: Simple
  }
  object Protocols {
    
    inline def apply(protocols: Simple): Protocols = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocols]
    }
    
    extension [Self <: Protocols](x: Self) {
      
      inline def setProtocols(value: Simple): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    @JSName("$ref")
    var $ref: String
  }
  object Ref {
    
    inline def apply($ref: String): Ref = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scopes extends StObject {
    
    var scopes: StringDictionary[Description]
  }
  object Scopes {
    
    inline def apply(scopes: StringDictionary[Description]): Scopes = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scopes]
    }
    
    extension [Self <: Scopes](x: Self) {
      
      inline def setScopes(value: StringDictionary[Description]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Simple extends StObject {
    
    var simple: Path
  }
  object Simple {
    
    inline def apply(simple: Path): Simple = {
      val __obj = js.Dynamic.literal(simple = simple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simple]
    }
    
    extension [Self <: Simple](x: Self) {
      
      inline def setSimple(value: Path): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofExternalAccountClie
    extends StObject
       with Instantiable0[ExternalAccountClient] {
    
    /**
      * This static method will instantiate the
      * corresponding type of external account credential depending on the
      * underlying credential source.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @return A BaseExternalAccountClient instance or null if the options
      *   provided do not correspond to an external account credential.
      */
    def fromJSON(options: ExternalAccountClientOptions): BaseExternalAccountClient | Null = js.native
    def fromJSON(options: ExternalAccountClientOptions, additionalOptions: RefreshOptions): BaseExternalAccountClient | Null = js.native
  }
  
  @js.native
  trait TypeofGoogleAuth
    extends StObject
       with Instantiable0[GoogleAuth[AuthClient]] {
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    var DefaultTransporter: TypeofDefaultTransporter = js.native
  }
  
  @js.native
  trait TypeofOAuth2Client
    extends StObject
       with Instantiable0[OAuth2Client] {
    
    /**
      * Clock skew - five minutes in seconds
      */
    /* private */ val CLOCK_SKEW_SECS_ : Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    /* private */ val GOOGLE_OAUTH2_AUTH_BASE_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    /* private */ val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    /* private */ val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    /* private */ val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    /* private */ val GOOGLE_OAUTH2_REVOKE_URL_ : Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    /* private */ val GOOGLE_OAUTH2_TOKEN_URL_ : Any = js.native
    
    /* protected */ val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    /* private */ val ISSUERS_ : Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    /* private */ val MAX_TOKEN_LIFETIME_SECS_ : Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    def getRevokeTokenUrl(token: String): String = js.native
  }
  
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Url {
    
    inline def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait X16 extends StObject {
    
    var x16: String
    
    var x32: String
  }
  object X16 {
    
    inline def apply(x16: String, x32: String): X16 = {
      val __obj = js.Dynamic.literal(x16 = x16.asInstanceOf[js.Any], x32 = x32.asInstanceOf[js.Any])
      __obj.asInstanceOf[X16]
    }
    
    extension [Self <: X16](x: Self) {
      
      inline def setX16(value: String): Self = StObject.set(x, "x16", value.asInstanceOf[js.Any])
      
      inline def setX32(value: String): Self = StObject.set(x, "x32", value.asInstanceOf[js.Any])
    }
  }
}
