package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductSpecialDesignation
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Date when the designation was granted.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the designation, or procedure number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Condition for which the medicinal use applies.
    */
  var indicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Condition for which the medicinal use applies.
    */
  var indicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The intended use of the product, e.g. prevention, treatment.
    */
  var intendedUse: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Animal species for which this applies.
    */
  var species: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example granted, pending, expired or withdrawn.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of special designation, e.g. orphan drug, minor use.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductSpecialDesignation {
  
  inline def apply(): MedicinalProductSpecialDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicinalProductSpecialDesignation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductSpecialDesignation] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "indicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setIndicationCodeableConceptUndefined: Self = StObject.set(x, "indicationCodeableConcept", js.undefined)
    
    inline def setIndicationReference(value: Reference): Self = StObject.set(x, "indicationReference", value.asInstanceOf[js.Any])
    
    inline def setIndicationReferenceUndefined: Self = StObject.set(x, "indicationReference", js.undefined)
    
    inline def setIntendedUse(value: CodeableConcept): Self = StObject.set(x, "intendedUse", value.asInstanceOf[js.Any])
    
    inline def setIntendedUseUndefined: Self = StObject.set(x, "intendedUse", js.undefined)
    
    inline def setSpecies(value: CodeableConcept): Self = StObject.set(x, "species", value.asInstanceOf[js.Any])
    
    inline def setSpeciesUndefined: Self = StObject.set(x, "species", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
