package typings.feathersjsAuthenticationOauth1

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.feathersjsAuthenticationOauth1.anon.AccessToken
import typings.feathersjsAuthenticationOauth1.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Paginated
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-oauth1", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) & Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-oauth1", "default.OAuth1Verifier")
    @js.native
    open class OAuth1VerifierCls protected () extends OAuth1Verifier {
      def this(app: Application[js.Object], options: Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) & Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) & Typeofself = ^
  }
  
  @JSImport("@feathersjs/authentication-oauth1", "OAuth1Verifier")
  @js.native
  open class OAuth1Verifier protected () extends StObject {
    def this(app: Application[js.Object], options: Any) = this()
    
    // updates an existing entity
    def _createEntity(data: AccessToken): js.Promise[Any] = js.native
    
    // creates an entity if they didn't exist already
    def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
    def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
    
    def _updateEntity(entity: Any, data: AccessToken): js.Promise[Any] = js.native
    
    // normalizes result from service to account for pagination
    def verify(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      accessToken: String,
      refreshToken: String,
      profile: Any,
      done: js.Function3[/* err */ js.Error | Null, /* user */ js.Object, /* info */ js.Object, Unit]
    ): Unit = js.native
  }
  
  trait FeathersAuthenticationOAuth1Options extends StObject {
    
    /**
      * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
      */
    var Verifier: OAuth1Verifier
    
    /**
      * The route to register the callback handler
      */
    var callbackPath: String
    
    /**
      * hostname[:port]/auth/<provider>/callback',
      */
    var callbackURL: String
    
    /**
      * the entity that you are looking up
      */
    var entity: String
    
    /**
      * The response formatter. Defaults the the built in feathers-rest formatter, which returns JSON. todo: needs a proper type
      */
    var formatter: Any
    
    /**
      * Express middleware for handling the oauth callback. Defaults to the built in middleware. todo: needs a proper type
      */
    var handler: Any
    
    /**
      * The field to look up the entity by when logging in with the provider. Defaults to '<provider>Id' (ie. 'twitterId').
      */
    var idField: String
    
    /**
      * whether the request object should be passed to `verify`
      */
    var passReqToCallback: Boolean
    
    /**
      * The route to register the middleware
      */
    var path: String
    
    /**
      * the service to look up the entity
      */
    var service: String
    
    /**
      * whether to use sessions,
      */
    var session: Boolean
  }
  object FeathersAuthenticationOAuth1Options {
    
    inline def apply(
      Verifier: OAuth1Verifier,
      callbackPath: String,
      callbackURL: String,
      entity: String,
      formatter: Any,
      handler: Any,
      idField: String,
      passReqToCallback: Boolean,
      path: String,
      service: String,
      session: Boolean
    ): FeathersAuthenticationOAuth1Options = {
      val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], callbackPath = callbackPath.asInstanceOf[js.Any], callbackURL = callbackURL.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], idField = idField.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersAuthenticationOAuth1Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeathersAuthenticationOAuth1Options] (val x: Self) extends AnyVal {
      
      inline def setCallbackPath(value: String): Self = StObject.set(x, "callbackPath", value.asInstanceOf[js.Any])
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setVerifier(value: OAuth1Verifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
    }
  }
}
