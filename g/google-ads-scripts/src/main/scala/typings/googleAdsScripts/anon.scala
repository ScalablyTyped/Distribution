package typings.googleAdsScripts

import typings.googleAdsScripts.GoogleAdsScripts.AdsApp.AddressObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: js.UndefOr[AddressObject] = js.undefined
    
    var bidModifier: js.UndefOr[Double] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: AddressObject): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
      
      inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    }
  }
  
  trait BidModifier extends StObject {
    
    var bidModifier: js.UndefOr[Double] = js.undefined
    
    var id: Double
  }
  object BidModifier {
    
    inline def apply(id: Double): BidModifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidModifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BidModifier] (val x: Self) extends AnyVal {
      
      inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
      
      inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
