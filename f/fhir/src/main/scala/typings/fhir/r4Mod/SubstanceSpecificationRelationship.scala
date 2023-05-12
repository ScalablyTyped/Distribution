package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSpecificationRelationship
  extends StObject
     with BackboneElement {
  
  var _amountString: js.UndefOr[Element] = js.undefined
  
  var _isDefining: js.UndefOr[Element] = js.undefined
  
  /**
    * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
    */
  var amountQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
    */
  var amountRange: js.UndefOr[Range] = js.undefined
  
  /**
    * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
    */
  var amountRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * For use when the numeric.
    */
  var amountRatioLowLimit: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A numeric factor for the relationship, for instance to express that the salt of a substance has some percentage of the active substance in relation to some other.
    */
  var amountString: js.UndefOr[String] = js.undefined
  
  /**
    * An operator for the amount, for example "average", "approximately", "less than".
    */
  var amountType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example where an enzyme strongly bonds with a particular substance, this is a defining relationship for that enzyme, out of several possible substance relationships.
    */
  var isDefining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For example "salt to parent", "active moiety", "starting material".
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A pointer to another substance, as a resource or just a representational code.
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A pointer to another substance, as a resource or just a representational code.
    */
  var substanceReference: js.UndefOr[Reference] = js.undefined
}
object SubstanceSpecificationRelationship {
  
  inline def apply(): SubstanceSpecificationRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSpecificationRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSpecificationRelationship] (val x: Self) extends AnyVal {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountRange(value: Range): Self = StObject.set(x, "amountRange", value.asInstanceOf[js.Any])
    
    inline def setAmountRangeUndefined: Self = StObject.set(x, "amountRange", js.undefined)
    
    inline def setAmountRatio(value: Ratio): Self = StObject.set(x, "amountRatio", value.asInstanceOf[js.Any])
    
    inline def setAmountRatioLowLimit(value: Ratio): Self = StObject.set(x, "amountRatioLowLimit", value.asInstanceOf[js.Any])
    
    inline def setAmountRatioLowLimitUndefined: Self = StObject.set(x, "amountRatioLowLimit", js.undefined)
    
    inline def setAmountRatioUndefined: Self = StObject.set(x, "amountRatio", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setAmountType(value: CodeableConcept): Self = StObject.set(x, "amountType", value.asInstanceOf[js.Any])
    
    inline def setAmountTypeUndefined: Self = StObject.set(x, "amountType", js.undefined)
    
    inline def setIsDefining(value: Boolean): Self = StObject.set(x, "isDefining", value.asInstanceOf[js.Any])
    
    inline def setIsDefiningUndefined: Self = StObject.set(x, "isDefining", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSubstanceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "substanceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubstanceCodeableConceptUndefined: Self = StObject.set(x, "substanceCodeableConcept", js.undefined)
    
    inline def setSubstanceReference(value: Reference): Self = StObject.set(x, "substanceReference", value.asInstanceOf[js.Any])
    
    inline def setSubstanceReferenceUndefined: Self = StObject.set(x, "substanceReference", js.undefined)
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
    
    inline def set_isDefining(value: Element): Self = StObject.set(x, "_isDefining", value.asInstanceOf[js.Any])
    
    inline def set_isDefiningUndefined: Self = StObject.set(x, "_isDefining", js.undefined)
  }
}
