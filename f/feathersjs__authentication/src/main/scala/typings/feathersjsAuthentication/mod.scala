package typings.feathersjsAuthentication

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthentication.anon.AccessToken
import typings.feathersjsAuthentication.anon.Algorithm
import typings.feathersjsAuthentication.anon.Enabled
import typings.feathersjsAuthentication.anon.Typeofself
import typings.feathersjsAuthentication.mod.AuthHooks.Hooks
import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.Params
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/authentication", JSImport.Default)
  @js.native
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) with Typeofself = js.native
  
  object express {
    
    @JSImport("@feathersjs/authentication", "express.authenticate")
    @js.native
    def authenticate(strategy: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSImport("@feathersjs/authentication", "express.authenticate")
    @js.native
    def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSImport("@feathersjs/authentication", "express.authenticate")
    @js.native
    def authenticate(strategy: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSImport("@feathersjs/authentication", "express.authenticate")
    @js.native
    def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.emitEvents")
    @js.native
    def emitEvents(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.exposeCookies")
    @js.native
    def exposeCookies(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.exposeHeaders")
    @js.native
    def exposeHeaders(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.failureRedirect")
    @js.native
    def failureRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSImport("@feathersjs/authentication", "express.failureRedirect")
    @js.native
    def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.setCookie")
    @js.native
    def setCookie(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSImport("@feathersjs/authentication", "express.setCookie")
    @js.native
    def setCookie(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    @JSImport("@feathersjs/authentication", "express.successRedirect")
    @js.native
    def successRedirect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  @JSImport("@feathersjs/authentication", "hooks")
  @js.native
  val hooks: Hooks = js.native
  
  object service {
    
    @JSImport("@feathersjs/authentication", "service")
    @js.native
    def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application_], Unit] = js.native
    
    @JSImport("@feathersjs/authentication", "service.Service")
    @js.native
    class Service[T] protected () extends StObject {
      def this(app: Application_) = this()
      
      def create(data: Partial[T], params: Params): js.Promise[AccessToken] = js.native
      
      def remove(id: String, params: Params): js.Promise[AccessToken] = js.native
      def remove(id: Null, params: Params): js.Promise[AccessToken] = js.native
    }
  }
  
  object AuthHooks {
    
    @js.native
    trait HashPassOptions extends StObject {
      
      var passwordField: String = js.native
    }
    object HashPassOptions {
      
      @scala.inline
      def apply(passwordField: String): HashPassOptions = {
        val __obj = js.Dynamic.literal(passwordField = passwordField.asInstanceOf[js.Any])
        __obj.asInstanceOf[HashPassOptions]
      }
      
      @scala.inline
      implicit class HashPassOptionsMutableBuilder[Self <: HashPassOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Hooks extends StObject {
      
      def authenticate(strategies: String): Hook = js.native
      def authenticate(strategies: js.Array[String]): Hook = js.native
      
      /**
        * The `hashPassword` hook will automatically hash the data coming in on the provided passwordField.
        * It is intended to be used as a before hook on the user service for the create, update, or patch methods.
        *
        */
      def hashPassword(): Hook = js.native
      def hashPassword(options: HashPassOptions): Hook = js.native
      
      /**
        * The populateUser hook is for populating a user based on an id.
        * It can be used on any service method as either a before or after hook.
        * It is called internally after a token is created.
        *
        */
      def populateUser(): Hook = js.native
      def populateUser(options: js.Any): Hook = js.native
      
      /**
        * The `restrictToAuthenticated` hook throws an error if there isn't a logged-in user by checking for the `hook.params.user` object.
        * It can be used on any service method and is intended to be used as a before hook.
        * It doesn't take any arguments.
        *
        */
      def restrictToAuthenticated(): Hook = js.native
      
      /**
        * `restrictToOwner` is meant to be used as a before hook.
        * It only allows the user to retrieve resources that are owned by them.
        * It will return a *Forbidden* error without the proper permissions.
        * It can be used on `get`, `create`, `update`, `patch` or `remove` methods.
        *
        */
      def restrictToOwner(): Hook = js.native
      def restrictToOwner(options: RestrictOptions): Hook = js.native
      
      /**
        * The `verifyToken` hook will attempt to verify a token.
        * If the token is missing or is invalid it returns an error.
        * If the token is valid it adds the decrypted payload to hook.params.payload which contains the user id.
        * It is intended to be used as a before hook on any of the service methods.
        *
        */
      def verifyToken(): Hook = js.native
      def verifyToken(options: js.Any): Hook = js.native
    }
    
    @js.native
    trait RestrictOptions extends StObject {
      
      var idField: String = js.native
      
      var ownerField: String = js.native
    }
    object RestrictOptions {
      
      @scala.inline
      def apply(idField: String, ownerField: String): RestrictOptions = {
        val __obj = js.Dynamic.literal(idField = idField.asInstanceOf[js.Any], ownerField = ownerField.asInstanceOf[js.Any])
        __obj.asInstanceOf[RestrictOptions]
      }
      
      @scala.inline
      implicit class RestrictOptionsMutableBuilder[Self <: RestrictOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerField(value: String): Self = StObject.set(x, "ownerField", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait FeathersAuthenticationOptions extends StObject {
    
    var cookie: js.UndefOr[Enabled] = js.native
    
    var entity: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var jwt: js.UndefOr[Algorithm] = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
  }
  object FeathersAuthenticationOptions {
    
    @scala.inline
    def apply(): FeathersAuthenticationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersAuthenticationOptions]
    }
    
    @scala.inline
    implicit class FeathersAuthenticationOptionsMutableBuilder[Self <: FeathersAuthenticationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: Enabled): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setJwt(value: Algorithm): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type _To = (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) with Typeofself
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) with Typeofself = default
}
