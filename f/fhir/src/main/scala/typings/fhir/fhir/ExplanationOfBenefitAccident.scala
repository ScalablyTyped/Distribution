package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of an accident
  */
trait ExplanationOfBenefitAccident
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * When the accident occurred
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.undefined
  
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
object ExplanationOfBenefitAccident {
  
  @scala.inline
  def apply(): ExplanationOfBenefitAccident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitAccident]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitAccidentMutableBuilder[Self <: ExplanationOfBenefitAccident] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    @scala.inline
    def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
