package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTierRate extends StObject {
  
  /**
    * Usage is priced at this rate only after this amount. Example: start_usage_amount of 10 indicates that the usage will be priced at the unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The price per unit of usage. Example: unit_price of amount $10 indicates that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaTierRate {
  
  inline def apply(): SchemaTierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTierRate]
  }
  
  extension [Self <: SchemaTierRate](x: Self) {
    
    inline def setStartUsageAmount(value: Double): Self = StObject.set(x, "startUsageAmount", value.asInstanceOf[js.Any])
    
    inline def setStartUsageAmountNull: Self = StObject.set(x, "startUsageAmount", null)
    
    inline def setStartUsageAmountUndefined: Self = StObject.set(x, "startUsageAmount", js.undefined)
    
    inline def setUnitPrice(value: SchemaMoney): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
