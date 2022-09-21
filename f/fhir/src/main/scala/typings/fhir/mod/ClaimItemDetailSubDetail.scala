package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimItemDetailSubDetail
  extends StObject
     with BackboneElement {
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var net: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var points: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A service line number.
    */
  var sequence: Double
  
  /**
    * The fee for an additional  service or product or charge.
    */
  var service: Coding
  
  /**
    * The type of product or service.
    */
  var `type`: Coding
  
  /**
    * The UDI code and issuer if applicable for the supplied product.
    */
  var udi: js.UndefOr[Coding] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var unitPrice: js.UndefOr[Quantity] = js.undefined
}
object ClaimItemDetailSubDetail {
  
  inline def apply(sequence: Double, service: Coding, `type`: Coding): ClaimItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItemDetailSubDetail]
  }
  
  extension [Self <: ClaimItemDetailSubDetail](x: Self) {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setNet(value: Quantity): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setService(value: Coding): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUdi(value: Coding): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUnitPrice(value: Quantity): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
