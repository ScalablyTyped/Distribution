package typings.feathersjsAuthentication

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthentication.mod.AuthHooks.Hooks
import typings.feathersjsAuthentication.mod.FeathersAuthenticationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: String = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(accessToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Algorithm extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    /**
      * The resource server where the token is processed
      */
    var audience: js.UndefOr[String] = js.native
    
    var expiresIn: js.UndefOr[String] = js.native
    
    /**
      * By default is an access token
      */
    var header: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * The issuing server, application or resource
      */
    var issuer: js.UndefOr[String] = js.native
    
    /**
      * Typically the entity id associated with the JWT
      */
    var subject: js.UndefOr[String] = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(): Algorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setHeader(value: StringDictionary[js.Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait Typeofexpress extends StObject {
    
    def authenticate(strategy: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def authenticate(strategy: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def emitEvents(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def exposeCookies(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def exposeHeaders(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def failureRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def setCookie(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def setCookie(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def successRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(config: FeathersAuthenticationOptions): js.Function0[Unit] = js.native
    
    val AuthHooks: js.Any = js.native
    
    val express: Typeofexpress = js.native
    
    val hooks: Hooks = js.native
    
    val service: Typeofservice = js.native
  }
  
  @js.native
  trait Typeofservice extends StObject {
    
    def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application_], Unit] = js.native
    
    var Service: Instantiable1[
        /* app */ Application_, 
        typings.feathersjsAuthentication.mod.service.Service[js.Object]
      ] = js.native
  }
}
