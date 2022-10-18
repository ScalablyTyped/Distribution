package typings.feathersjsAuthenticationLocal

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsAuthenticationLocal.mod.LocalVerifier
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Hook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var passwordField: String
    
    var usernameField: String
  }
  object Name {
    
    inline def apply(name: String, passwordField: String, usernameField: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@feathersjs/authentication-local.@feathersjs/authentication-local.FeathersAuthenticationLocalOptions> */
  trait PartialFeathersAuthentica extends StObject {
    
    var Verifier: js.UndefOr[LocalVerifier] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var entityPasswordField: js.UndefOr[String] = js.undefined
    
    var entityUsernameField: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var passwordField: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var usernameField: js.UndefOr[String] = js.undefined
  }
  object PartialFeathersAuthentica {
    
    inline def apply(): PartialFeathersAuthentica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFeathersAuthentica]
    }
    
    extension [Self <: PartialFeathersAuthentica](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityPasswordField(value: String): Self = StObject.set(x, "entityPasswordField", value.asInstanceOf[js.Any])
      
      inline def setEntityPasswordFieldUndefined: Self = StObject.set(x, "entityPasswordField", js.undefined)
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setEntityUsernameField(value: String): Self = StObject.set(x, "entityUsernameField", value.asInstanceOf[js.Any])
      
      inline def setEntityUsernameFieldUndefined: Self = StObject.set(x, "entityUsernameField", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      inline def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      inline def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
      
      inline def setVerifier(value: LocalVerifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
      
      inline def setVerifierUndefined: Self = StObject.set(x, "Verifier", js.undefined)
    }
  }
  
  @js.native
  trait Typeofhooks extends StObject {
    
    def hashPassword(): Hook = js.native
    def hashPassword(options: Any): Hook = js.native
    
    // todo: properly type options
    def protect(fields: String*): Hook = js.native
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(options: PartialFeathersAuthentica): js.Function0[Unit] = js.native
    
    var LocalVerifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ Any, 
        typings.feathersjsAuthenticationLocal.mod.LocalVerifier
      ] = js.native
    
    val defaults: Name = js.native
    
    val hooks: Typeofhooks = js.native
  }
}
