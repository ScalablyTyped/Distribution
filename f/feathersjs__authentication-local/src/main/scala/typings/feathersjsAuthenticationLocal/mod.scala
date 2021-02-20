package typings.feathersjsAuthenticationLocal

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthenticationLocal.anon.Message
import typings.feathersjsAuthenticationLocal.anon.PartialFeathersAuthentica
import typings.feathersjsAuthenticationLocal.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.Paginated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-local", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-local", "default.LocalVerifier")
    @js.native
    class LocalVerifierCls protected () extends LocalVerifier {
      def this(app: Application[js.Object], options: js.Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself = ^
  }
  
  @JSImport("@feathersjs/authentication-local", "LocalVerifier")
  @js.native
  class LocalVerifier protected () extends StObject {
    def this(app: Application[js.Object], options: js.Any) = this()
    
    def _comparePassword[T](entity: T, password: String): js.Promise[T] = js.native
    
    // compares password using bcrypt
    def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
    def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
    
    // normalizes result from service to account for pagination
    def verify(
      req: Request_[ParamsDictionary, _, _, Query],
      username: String,
      password: String,
      done: js.Function3[
          /* error */ js.Any, 
          /* user */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[Message], 
          Unit
        ]
    ): Unit = js.native
  }
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-local", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-local", "defaults.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-local", "defaults.passwordField")
    @js.native
    def passwordField: String = js.native
    @scala.inline
    def passwordField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-local", "defaults.usernameField")
    @js.native
    def usernameField: String = js.native
    @scala.inline
    def usernameField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(x.asInstanceOf[js.Any])
  }
  
  object hooks {
    
    @JSImport("@feathersjs/authentication-local", "hooks.hashPassword")
    @js.native
    def hashPassword(): Hook = js.native
    @JSImport("@feathersjs/authentication-local", "hooks.hashPassword")
    @js.native
    def hashPassword(options: js.Any): Hook = js.native
    
    // todo: properly type options
    @JSImport("@feathersjs/authentication-local", "hooks.protect")
    @js.native
    def protect(fields: String*): Hook = js.native
  }
  
  @js.native
  trait FeathersAuthenticationLocalOptions extends StObject {
    
    /**
      * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
      */
    var Verifier: LocalVerifier = js.native
    
    /**
      * the entity that you're comparing username/password against
      */
    var entity: String = js.native
    
    /**
      * key name of the password on the entity (defaults to `passwordField`)
      */
    var entityPasswordField: String = js.native
    
    /**
      * key name of the username field on the entity (defaults to `usernameField`)
      */
    var entityUsernameField: String = js.native
    
    /**
      * the name to use when invoking the authentication Strategy
      */
    var name: String = js.native
    
    /**
      * whether the request object should be passed to `verify`
      */
    var passReqToCallback: Boolean = js.native
    
    /**
      * key name of password field on the request
      */
    var passwordField: String = js.native
    
    /**
      * the service to look up the entity
      */
    var service: String = js.native
    
    /**
      * whether to use sessions,
      */
    var session: Boolean = js.native
    
    /**
      * key name of username field on the request
      */
    var usernameField: String = js.native
  }
  object FeathersAuthenticationLocalOptions {
    
    @scala.inline
    def apply(
      Verifier: LocalVerifier,
      entity: String,
      entityPasswordField: String,
      entityUsernameField: String,
      name: String,
      passReqToCallback: Boolean,
      passwordField: String,
      service: String,
      session: Boolean,
      usernameField: String
    ): FeathersAuthenticationLocalOptions = {
      val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityPasswordField = entityPasswordField.asInstanceOf[js.Any], entityUsernameField = entityUsernameField.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersAuthenticationLocalOptions]
    }
    
    @scala.inline
    implicit class FeathersAuthenticationLocalOptionsMutableBuilder[Self <: FeathersAuthenticationLocalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityPasswordField(value: String): Self = StObject.set(x, "entityPasswordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUsernameField(value: String): Self = StObject.set(x, "entityUsernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifier(value: LocalVerifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
    }
  }
}
