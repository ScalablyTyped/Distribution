package typings.emberTestHelpers

import typings.emberApplication.resolverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Delay extends StObject {
    
    var delay: Double = js.native
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsValid extends StObject {
    
    var isValid: Boolean = js.native
    
    var message: String = js.native
  }
  object IsValid {
    
    @scala.inline
    def apply(isValid: Boolean, message: String): IsValid = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsValid]
    }
    
    @scala.inline
    implicit class IsValidMutableBuilder[Self <: IsValid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Resolver extends StObject {
    
    var resolver: js.UndefOr[default] = js.native
  }
  object Resolver {
    
    @scala.inline
    def apply(): Resolver = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolver]
    }
    
    @scala.inline
    implicit class ResolverMutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolver(value: default): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    }
  }
}
