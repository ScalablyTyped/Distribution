package typings.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.mod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: String
  }
  object Description {
    
    @scala.inline
    def apply(description: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fragment extends StObject {
    
    var fragment: String
  }
  object Fragment {
    
    @scala.inline
    def apply(fragment: String): Fragment = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    }
  }
  
  trait Oauth2 extends StObject {
    
    var oauth2: Scopes
  }
  object Oauth2 {
    
    @scala.inline
    def apply(oauth2: Scopes): Oauth2 = {
      val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauth2]
    }
    
    @scala.inline
    implicit class Oauth2MutableBuilder[Self <: Oauth2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOauth2(value: Scopes): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Protocols extends StObject {
    
    var protocols: Simple
  }
  object Protocols {
    
    @scala.inline
    def apply(protocols: Simple): Protocols = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocols]
    }
    
    @scala.inline
    implicit class ProtocolsMutableBuilder[Self <: Protocols] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocols(value: Simple): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    @JSName("$ref")
    var $ref: String
  }
  object Ref {
    
    @scala.inline
    def apply($ref: String): Ref = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scopes extends StObject {
    
    var scopes: StringDictionary[Description]
  }
  object Scopes {
    
    @scala.inline
    def apply(scopes: StringDictionary[Description]): Scopes = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scopes]
    }
    
    @scala.inline
    implicit class ScopesMutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScopes(value: StringDictionary[Description]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Simple extends StObject {
    
    var simple: Path
  }
  object Simple {
    
    @scala.inline
    def apply(simple: Path): Simple = {
      val __obj = js.Dynamic.literal(simple = simple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simple]
    }
    
    @scala.inline
    implicit class SimpleMutableBuilder[Self <: Simple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSimple(value: Path): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofOAuth2Client
    extends StObject
       with Instantiable0[OAuth2Client] {
    
    /**
      * Clock skew - five minutes in seconds
      */
    val CLOCK_SKEW_SECS_ : js.Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : js.Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
    
    val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    val ISSUERS_ : js.Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    def getRevokeTokenUrl(token: String): String = js.native
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait X16 extends StObject {
    
    var x16: String
    
    var x32: String
  }
  object X16 {
    
    @scala.inline
    def apply(x16: String, x32: String): X16 = {
      val __obj = js.Dynamic.literal(x16 = x16.asInstanceOf[js.Any], x32 = x32.asInstanceOf[js.Any])
      __obj.asInstanceOf[X16]
    }
    
    @scala.inline
    implicit class X16MutableBuilder[Self <: X16] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX16(value: String): Self = StObject.set(x, "x16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX32(value: String): Self = StObject.set(x, "x32", value.asInstanceOf[js.Any])
    }
  }
}
