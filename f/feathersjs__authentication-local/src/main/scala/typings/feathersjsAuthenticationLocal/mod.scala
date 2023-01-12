package typings.feathersjsAuthenticationLocal

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.feathersjsAuthenticationLocal.anon.Message
import typings.feathersjsAuthenticationLocal.anon.PartialFeathersAuthentica
import typings.feathersjsAuthenticationLocal.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.Paginated
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-local", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-local", "default.LocalVerifier")
    @js.native
    open class LocalVerifierCls protected () extends LocalVerifier {
      def this(app: Application[js.Object], options: Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself = ^
  }
  
  @JSImport("@feathersjs/authentication-local", "LocalVerifier")
  @js.native
  open class LocalVerifier protected () extends StObject {
    def this(app: Application[js.Object], options: Any) = this()
    
    def _comparePassword[T](entity: T, password: String): js.Promise[T] = js.native
    
    // compares password using bcrypt
    def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
    def _normalizeResult[T](results: Paginated[T]): js.Promise[T] = js.native
    
    // normalizes result from service to account for pagination
    def verify(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      username: String,
      password: String,
      done: js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* options */ js.UndefOr[Message], Unit]
    ): Unit = js.native
  }
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-local", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-local", "defaults.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-local", "defaults.passwordField")
    @js.native
    def passwordField: String = js.native
    inline def passwordField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passwordField")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-local", "defaults.usernameField")
    @js.native
    def usernameField: String = js.native
    inline def usernameField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(x.asInstanceOf[js.Any])
  }
  
  object hooks {
    
    @JSImport("@feathersjs/authentication-local", "hooks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hashPassword(): Hook = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPassword")().asInstanceOf[Hook]
    inline def hashPassword(options: Any): Hook = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPassword")(options.asInstanceOf[js.Any]).asInstanceOf[Hook]
    
    // todo: properly type options
    inline def protect(fields: String*): Hook = ^.asInstanceOf[js.Dynamic].applyDynamic("protect")(fields.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Hook]
  }
  
  trait FeathersAuthenticationLocalOptions extends StObject {
    
    /**
      * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
      */
    var Verifier: LocalVerifier
    
    /**
      * the entity that you're comparing username/password against
      */
    var entity: String
    
    /**
      * key name of the password on the entity (defaults to `passwordField`)
      */
    var entityPasswordField: String
    
    /**
      * key name of the username field on the entity (defaults to `usernameField`)
      */
    var entityUsernameField: String
    
    /**
      * the name to use when invoking the authentication Strategy
      */
    var name: String
    
    /**
      * whether the request object should be passed to `verify`
      */
    var passReqToCallback: Boolean
    
    /**
      * key name of password field on the request
      */
    var passwordField: String
    
    /**
      * the service to look up the entity
      */
    var service: String
    
    /**
      * whether to use sessions,
      */
    var session: Boolean
    
    /**
      * key name of username field on the request
      */
    var usernameField: String
  }
  object FeathersAuthenticationLocalOptions {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: FeathersAuthenticationLocalOptions] (val x: Self) extends AnyVal {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityPasswordField(value: String): Self = StObject.set(x, "entityPasswordField", value.asInstanceOf[js.Any])
      
      inline def setEntityUsernameField(value: String): Self = StObject.set(x, "entityUsernameField", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      inline def setVerifier(value: LocalVerifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
    }
  }
}
