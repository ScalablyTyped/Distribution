package typings.firebaseComponent

import typings.firebaseComponent.firebaseComponentBooleans.`false`
import typings.firebaseComponent.firebaseComponentBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Identifier extends StObject {
    
    var identifier: js.UndefOr[String] = js.native
    
    var optional: `true` = js.native
  }
  object Identifier {
    
    @scala.inline
    def apply(optional: `true`): Identifier = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifier]
    }
    
    @scala.inline
    implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Optional extends StObject {
    
    var identifier: js.UndefOr[String] = js.native
    
    var optional: js.UndefOr[`false`] = js.native
  }
  object Optional {
    
    @scala.inline
    def apply(): Optional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optional]
    }
    
    @scala.inline
    implicit class OptionalMutableBuilder[Self <: Optional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setOptional(value: `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
