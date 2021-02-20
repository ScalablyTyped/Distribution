package typings.feathersjsAuthenticationOauth1

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthenticationOauth1.anon.AccessToken
import typings.feathersjsAuthenticationOauth1.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Paginated
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-oauth1", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) with Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-oauth1", "default.OAuth1Verifier")
    @js.native
    class OAuth1VerifierCls protected () extends OAuth1Verifier {
      def this(app: Application[js.Object], options: js.Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) with Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[FeathersAuthenticationOAuth1Options], js.Function0[Unit]]) with Typeofself = ^
  }
  
  @JSImport("@feathersjs/authentication-oauth1", "OAuth1Verifier")
  @js.native
  class OAuth1Verifier protected () extends StObject {
    def this(app: Application[js.Object], options: js.Any) = this()
    
    // updates an existing entity
    def _createEntity(data: AccessToken): js.Promise[_] = js.native
    
    // creates an entity if they didn't exist already
    def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
    def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
    
    def _updateEntity(entity: js.Any, data: AccessToken): js.Promise[_] = js.native
    
    // normalizes result from service to account for pagination
    def verify(
      req: Request_[ParamsDictionary, _, _, Query],
      accessToken: String,
      refreshToken: String,
      profile: js.Any,
      done: js.Function3[/* err */ Error | Null, /* user */ js.Object, /* info */ js.Object, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait FeathersAuthenticationOAuth1Options extends StObject {
    
    /**
      * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
      */
    var Verifier: OAuth1Verifier = js.native
    
    /**
      * The route to register the callback handler
      */
    var callbackPath: String = js.native
    
    /**
      * hostname[:port]/auth/<provider>/callback',
      */
    var callbackURL: String = js.native
    
    /**
      * the entity that you are looking up
      */
    var entity: String = js.native
    
    /**
      * The response formatter. Defaults the the built in feathers-rest formatter, which returns JSON. todo: needs a proper type
      */
    var formatter: js.Any = js.native
    
    /**
      * Express middleware for handling the oauth callback. Defaults to the built in middleware. todo: needs a proper type
      */
    var handler: js.Any = js.native
    
    /**
      * The field to look up the entity by when logging in with the provider. Defaults to '<provider>Id' (ie. 'twitterId').
      */
    var idField: String = js.native
    
    /**
      * whether the request object should be passed to `verify`
      */
    var passReqToCallback: Boolean = js.native
    
    /**
      * The route to register the middleware
      */
    var path: String = js.native
    
    /**
      * the service to look up the entity
      */
    var service: String = js.native
    
    /**
      * whether to use sessions,
      */
    var session: Boolean = js.native
  }
  object FeathersAuthenticationOAuth1Options {
    
    @scala.inline
    def apply(
      Verifier: OAuth1Verifier,
      callbackPath: String,
      callbackURL: String,
      entity: String,
      formatter: js.Any,
      handler: js.Any,
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
    implicit class FeathersAuthenticationOAuth1OptionsMutableBuilder[Self <: FeathersAuthenticationOAuth1Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackPath(value: String): Self = StObject.set(x, "callbackPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifier(value: OAuth1Verifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
    }
  }
}
