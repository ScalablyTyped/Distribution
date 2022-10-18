package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimMissingTeeth
  extends StObject
     with BackboneElement {
  
  var _extractionDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Some services and adjudications require this information.
    */
  var extractionDate: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the reason for the missing tooth.
    */
  var reason: js.UndefOr[Coding] = js.undefined
  
  /**
    * Provides the tooth number of the missing tooth.
    */
  var tooth: Coding
}
object ClaimMissingTeeth {
  
  inline def apply(tooth: Coding): ClaimMissingTeeth = {
    val __obj = js.Dynamic.literal(tooth = tooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimMissingTeeth]
  }
  
  extension [Self <: ClaimMissingTeeth](x: Self) {
    
    inline def setExtractionDate(value: String): Self = StObject.set(x, "extractionDate", value.asInstanceOf[js.Any])
    
    inline def setExtractionDateUndefined: Self = StObject.set(x, "extractionDate", js.undefined)
    
    inline def setReason(value: Coding): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTooth(value: Coding): Self = StObject.set(x, "tooth", value.asInstanceOf[js.Any])
    
    inline def set_extractionDate(value: Element): Self = StObject.set(x, "_extractionDate", value.asInstanceOf[js.Any])
    
    inline def set_extractionDateUndefined: Self = StObject.set(x, "_extractionDate", js.undefined)
  }
}
