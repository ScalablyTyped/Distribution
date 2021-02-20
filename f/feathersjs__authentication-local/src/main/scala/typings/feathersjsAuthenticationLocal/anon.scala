package typings.feathersjsAuthenticationLocal

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsAuthenticationLocal.mod.LocalVerifier
import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Hook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var passwordField: String = js.native
    
    var usernameField: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, passwordField: String, usernameField: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@feathersjs/authentication-local.@feathersjs/authentication-local.FeathersAuthenticationLocalOptions> */
  @js.native
  trait PartialFeathersAuthentica extends StObject {
    
    var Verifier: js.UndefOr[LocalVerifier] = js.native
    
    var entity: js.UndefOr[String] = js.native
    
    var entityPasswordField: js.UndefOr[String] = js.native
    
    var entityUsernameField: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object PartialFeathersAuthentica {
    
    @scala.inline
    def apply(): PartialFeathersAuthentica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFeathersAuthentica]
    }
    
    @scala.inline
    implicit class PartialFeathersAuthenticaMutableBuilder[Self <: PartialFeathersAuthentica] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityPasswordField(value: String): Self = StObject.set(x, "entityPasswordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityPasswordFieldUndefined: Self = StObject.set(x, "entityPasswordField", js.undefined)
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setEntityUsernameField(value: String): Self = StObject.set(x, "entityUsernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUsernameFieldUndefined: Self = StObject.set(x, "entityUsernameField", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
      
      @scala.inline
      def setVerifier(value: LocalVerifier): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifierUndefined: Self = StObject.set(x, "Verifier", js.undefined)
    }
  }
  
  @js.native
  trait Typeofhooks extends StObject {
    
    def hashPassword(): Hook = js.native
    def hashPassword(options: js.Any): Hook = js.native
    
    // todo: properly type options
    def protect(fields: String*): Hook = js.native
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(options: PartialFeathersAuthentica): js.Function0[Unit] = js.native
    
    var LocalVerifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ js.Any, 
        typings.feathersjsAuthenticationLocal.mod.LocalVerifier
      ] = js.native
    
    val defaults: Name = js.native
    
    val hooks: Typeofhooks = js.native
  }
}
