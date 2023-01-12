package typings.feathersjsAuthentication

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.feathersjsAuthentication.anon.AccessToken
import typings.feathersjsAuthentication.anon.Algorithm
import typings.feathersjsAuthentication.anon.Enabled
import typings.feathersjsAuthentication.anon.Typeofself
import typings.feathersjsAuthentication.mod.AuthHooks.Hooks
import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.Params
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/authentication", JSImport.Default)
  @js.native
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) & Typeofself = js.native
  
  object express {
    
    @JSImport("@feathersjs/authentication", "express")
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticate(strategy: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(strategy.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    inline def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    inline def authenticate(strategy: js.Array[String]): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(strategy.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    inline def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def emitEvents(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("emitEvents")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def exposeCookies(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("exposeCookies")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def exposeHeaders(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("exposeHeaders")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def failureRedirect(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("failureRedirect")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    inline def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("failureRedirect")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def setCookie(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    inline def setCookie(options: FeathersAuthenticationOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
    
    inline def successRedirect(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("successRedirect")().asInstanceOf[RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]]
  }
  
  @JSImport("@feathersjs/authentication", "hooks")
  @js.native
  val hooks: Hooks = js.native
  
  object service {
    
    inline def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application_], Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* app */ js.UndefOr[Application_], Unit]]
    
    @JSImport("@feathersjs/authentication", "service")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication", "service.Service")
    @js.native
    open class Service[T] protected () extends StObject {
      def this(app: Application_) = this()
      
      def create(data: Partial[T], params: Params): js.Promise[AccessToken] = js.native
      
      def remove(id: String, params: Params): js.Promise[AccessToken] = js.native
      def remove(id: Null, params: Params): js.Promise[AccessToken] = js.native
    }
  }
  
  object AuthHooks {
    
    trait HashPassOptions extends StObject {
      
      var passwordField: String
    }
    object HashPassOptions {
      
      inline def apply(passwordField: String): HashPassOptions = {
        val __obj = js.Dynamic.literal(passwordField = passwordField.asInstanceOf[js.Any])
        __obj.asInstanceOf[HashPassOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HashPassOptions] (val x: Self) extends AnyVal {
        
        inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
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
      def populateUser(options: Any): Hook = js.native
      
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
      def verifyToken(options: Any): Hook = js.native
    }
    
    trait RestrictOptions extends StObject {
      
      var idField: String
      
      var ownerField: String
    }
    object RestrictOptions {
      
      inline def apply(idField: String, ownerField: String): RestrictOptions = {
        val __obj = js.Dynamic.literal(idField = idField.asInstanceOf[js.Any], ownerField = ownerField.asInstanceOf[js.Any])
        __obj.asInstanceOf[RestrictOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RestrictOptions] (val x: Self) extends AnyVal {
        
        inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
        
        inline def setOwnerField(value: String): Self = StObject.set(x, "ownerField", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait FeathersAuthenticationOptions extends StObject {
    
    var cookie: js.UndefOr[Enabled] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var jwt: js.UndefOr[Algorithm] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
  }
  object FeathersAuthenticationOptions {
    
    inline def apply(): FeathersAuthenticationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersAuthenticationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeathersAuthenticationOptions] (val x: Self) extends AnyVal {
      
      inline def setCookie(value: Enabled): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setJwt(value: Algorithm): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  type _To = (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) & Typeofself
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) & Typeofself = default
}
