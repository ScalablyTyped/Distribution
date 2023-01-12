package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceStatisticModelCharacteristic
  extends StObject
     with BackboneElement {
  
  /**
    * An attribute of the statistic used as a model characteristic.
    */
  var attributeEstimate: js.UndefOr[js.Array[EvidenceStatisticAttributeEstimate]] = js.undefined
  
  /**
    * Description of a component of the method to generate the statistic.
    */
  var code: CodeableConcept
  
  /**
    * Further specification of the quantified value of the component of the method to generate the statistic.
    */
  var value: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A variable adjusted for in the adjusted analysis.
    */
  var variable: js.UndefOr[js.Array[EvidenceStatisticModelCharacteristicVariable]] = js.undefined
}
object EvidenceStatisticModelCharacteristic {
  
  inline def apply(code: CodeableConcept): EvidenceStatisticModelCharacteristic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceStatisticModelCharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceStatisticModelCharacteristic] (val x: Self) extends AnyVal {
    
    inline def setAttributeEstimate(value: js.Array[EvidenceStatisticAttributeEstimate]): Self = StObject.set(x, "attributeEstimate", value.asInstanceOf[js.Any])
    
    inline def setAttributeEstimateUndefined: Self = StObject.set(x, "attributeEstimate", js.undefined)
    
    inline def setAttributeEstimateVarargs(value: EvidenceStatisticAttributeEstimate*): Self = StObject.set(x, "attributeEstimate", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Quantity): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariable(value: js.Array[EvidenceStatisticModelCharacteristicVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: EvidenceStatisticModelCharacteristicVariable*): Self = StObject.set(x, "variable", js.Array(value*))
  }
}
