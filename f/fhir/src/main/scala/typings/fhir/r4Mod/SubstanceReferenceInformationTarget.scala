package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceReferenceInformationTarget
  extends StObject
     with BackboneElement {
  
  var _amountString: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var amountQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Todo.
    */
  var amountRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Todo.
    */
  var amountString: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var amountType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var interaction: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var organism: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var organismType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Todo.
    */
  var target: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Todo.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceReferenceInformationTarget {
  
  inline def apply(): SubstanceReferenceInformationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceReferenceInformationTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceReferenceInformationTarget] (val x: Self) extends AnyVal {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountRange(value: Range): Self = StObject.set(x, "amountRange", value.asInstanceOf[js.Any])
    
    inline def setAmountRangeUndefined: Self = StObject.set(x, "amountRange", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setAmountType(value: CodeableConcept): Self = StObject.set(x, "amountType", value.asInstanceOf[js.Any])
    
    inline def setAmountTypeUndefined: Self = StObject.set(x, "amountType", js.undefined)
    
    inline def setInteraction(value: CodeableConcept): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setOrganism(value: CodeableConcept): Self = StObject.set(x, "organism", value.asInstanceOf[js.Any])
    
    inline def setOrganismType(value: CodeableConcept): Self = StObject.set(x, "organismType", value.asInstanceOf[js.Any])
    
    inline def setOrganismTypeUndefined: Self = StObject.set(x, "organismType", js.undefined)
    
    inline def setOrganismUndefined: Self = StObject.set(x, "organism", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTarget(value: Identifier): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
  }
}
