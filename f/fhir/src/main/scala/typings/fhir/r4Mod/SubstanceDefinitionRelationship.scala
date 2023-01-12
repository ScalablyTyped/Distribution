package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionRelationship
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
  var amountRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * For use when the numeric has an uncertain range.
    */
  var amountRatioHighLimit: js.UndefOr[Ratio] = js.undefined
  
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
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A pointer to another substance, as a resource or just a representational code.
    */
  var substanceDefinitionCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A pointer to another substance, as a resource or just a representational code.
    */
  var substanceDefinitionReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example "salt to parent", "active moiety", "starting material", "polymorph", "impurity of".
    */
  var `type`: CodeableConcept
}
object SubstanceDefinitionRelationship {
  
  inline def apply(`type`: CodeableConcept): SubstanceDefinitionRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceDefinitionRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionRelationship] (val x: Self) extends AnyVal {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountRatio(value: Ratio): Self = StObject.set(x, "amountRatio", value.asInstanceOf[js.Any])
    
    inline def setAmountRatioHighLimit(value: Ratio): Self = StObject.set(x, "amountRatioHighLimit", value.asInstanceOf[js.Any])
    
    inline def setAmountRatioHighLimitUndefined: Self = StObject.set(x, "amountRatioHighLimit", js.undefined)
    
    inline def setAmountRatioUndefined: Self = StObject.set(x, "amountRatio", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setAmountType(value: CodeableConcept): Self = StObject.set(x, "amountType", value.asInstanceOf[js.Any])
    
    inline def setAmountTypeUndefined: Self = StObject.set(x, "amountType", js.undefined)
    
    inline def setIsDefining(value: Boolean): Self = StObject.set(x, "isDefining", value.asInstanceOf[js.Any])
    
    inline def setIsDefiningUndefined: Self = StObject.set(x, "isDefining", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSubstanceDefinitionCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "substanceDefinitionCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubstanceDefinitionCodeableConceptUndefined: Self = StObject.set(x, "substanceDefinitionCodeableConcept", js.undefined)
    
    inline def setSubstanceDefinitionReference(value: Reference): Self = StObject.set(x, "substanceDefinitionReference", value.asInstanceOf[js.Any])
    
    inline def setSubstanceDefinitionReferenceUndefined: Self = StObject.set(x, "substanceDefinitionReference", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
    
    inline def set_isDefining(value: Element): Self = StObject.set(x, "_isDefining", value.asInstanceOf[js.Any])
    
    inline def set_isDefiningUndefined: Self = StObject.set(x, "_isDefining", js.undefined)
  }
}
