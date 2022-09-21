package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionMoiety
  extends StObject
     with BackboneElement {
  
  var _amountString: js.UndefOr[Element] = js.undefined
  
  var _molecularFormula: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Quantitative value for this moiety.
    */
  var amountQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Quantitative value for this moiety.
    */
  var amountString: js.UndefOr[String] = js.undefined
  
  /**
    * The measurement type of the quantitative value.
    */
  var amountType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifier by which this moiety substance is known.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Molecular formula for this moiety of this substance, typically using the Hill system.
    */
  var molecularFormula: js.UndefOr[String] = js.undefined
  
  /**
    * Textual name for this moiety substance.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optical activity type.
    */
  var opticalActivity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Role that the moiety is playing.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Stereochemistry type.
    */
  var stereochemistry: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionMoiety {
  
  inline def apply(): SubstanceDefinitionMoiety = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionMoiety]
  }
  
  extension [Self <: SubstanceDefinitionMoiety](x: Self) {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setAmountType(value: CodeableConcept): Self = StObject.set(x, "amountType", value.asInstanceOf[js.Any])
    
    inline def setAmountTypeUndefined: Self = StObject.set(x, "amountType", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMolecularFormula(value: String): Self = StObject.set(x, "molecularFormula", value.asInstanceOf[js.Any])
    
    inline def setMolecularFormulaUndefined: Self = StObject.set(x, "molecularFormula", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpticalActivity(value: CodeableConcept): Self = StObject.set(x, "opticalActivity", value.asInstanceOf[js.Any])
    
    inline def setOpticalActivityUndefined: Self = StObject.set(x, "opticalActivity", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setStereochemistry(value: CodeableConcept): Self = StObject.set(x, "stereochemistry", value.asInstanceOf[js.Any])
    
    inline def setStereochemistryUndefined: Self = StObject.set(x, "stereochemistry", js.undefined)
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
    
    inline def set_molecularFormula(value: Element): Self = StObject.set(x, "_molecularFormula", value.asInstanceOf[js.Any])
    
    inline def set_molecularFormulaUndefined: Self = StObject.set(x, "_molecularFormula", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
