package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemDetailSubDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudications results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetailAdjudication]] = js.undefined
  
  /**
    * A service line number.
    */
  var sequenceLinkId: Double
}
object ClaimResponseItemDetailSubDetail {
  
  inline def apply(sequenceLinkId: Double): ClaimResponseItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetailSubDetail]
  }
  
  extension [Self <: ClaimResponseItemDetailSubDetail](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemDetailSubDetailAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemDetailSubDetailAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setSequenceLinkId(value: Double): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
  }
}
