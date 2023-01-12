package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseAddItemDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudications results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseAddItemDetailAdjudication]] = js.undefined
  
  /**
    * The fee charged for the professional service or product..
    */
  var fee: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A code to indicate the Professional Service or Product supplied.
    */
  var service: Coding
}
object ClaimResponseAddItemDetail {
  
  inline def apply(service: Coding): ClaimResponseAddItemDetail = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseAddItemDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseAddItemDetail] (val x: Self) extends AnyVal {
    
    inline def setAdjudication(value: js.Array[ClaimResponseAddItemDetailAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseAddItemDetailAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setFee(value: Quantity): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setService(value: Coding): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
