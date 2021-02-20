package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: AddressObject = js.native
    
    var bidModifier: Double = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: AddressObject, bidModifier: Double): typings.googleAdwordsScripts.anon.Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bidModifier = bidModifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googleAdwordsScripts.anon.Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: typings.googleAdwordsScripts.anon.Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: AddressObject): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: Double = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
