package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about an accident
  */
trait ClaimAccident
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: typings.fhir.fhir.date
  
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimAccident {
  
  inline def apply(date: date): ClaimAccident = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimAccident]
  }
  
  extension [Self <: ClaimAccident](x: Self) {
    
    inline def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    inline def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    inline def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
