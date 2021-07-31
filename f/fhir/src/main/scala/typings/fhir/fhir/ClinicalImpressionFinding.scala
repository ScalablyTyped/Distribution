package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible or likely findings and diagnoses
  */
trait ClinicalImpressionFinding
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'basis'.
    */
  var _basis: js.UndefOr[Element] = js.undefined
  
  /**
    * Which investigations support finding
    */
  var basis: js.UndefOr[String] = js.undefined
  
  /**
    * What was found
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What was found
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object ClinicalImpressionFinding {
  
  @scala.inline
  def apply(): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
  
  @scala.inline
  implicit class ClinicalImpressionFindingMutableBuilder[Self <: ClinicalImpressionFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasis(value: String): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    @scala.inline
    def set_basis(value: Element): Self = StObject.set(x, "_basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_basisUndefined: Self = StObject.set(x, "_basis", js.undefined)
  }
}
