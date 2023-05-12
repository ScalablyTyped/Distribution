package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`all-of`
import typings.fhir.fhirStrings.`any-of`
import typings.fhir.fhirStrings.`at-least`
import typings.fhir.fhirStrings.`at-most`
import typings.fhir.fhirStrings.`net-effect`
import typings.fhir.fhirStrings.dataset
import typings.fhir.fhirStrings.statistical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristicDefinitionByCombination
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * A defining factor of the characteristic.
    */
  var characteristic: js.Array[EvidenceVariableCharacteristic]
  
  /**
    * Used to specify if two or more characteristics are combined with OR or AND.
    */
  var code: `all-of` | `any-of` | `at-least` | `at-most` | statistical | `net-effect` | dataset
  
  /**
    * Provides the value of "n" when "at-least" or "at-most" codes are used.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object EvidenceVariableCharacteristicDefinitionByCombination {
  
  inline def apply(
    characteristic: js.Array[EvidenceVariableCharacteristic],
    code: `all-of` | `any-of` | `at-least` | `at-most` | statistical | `net-effect` | dataset
  ): EvidenceVariableCharacteristicDefinitionByCombination = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceVariableCharacteristicDefinitionByCombination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableCharacteristicDefinitionByCombination] (val x: Self) extends AnyVal {
    
    inline def setCharacteristic(value: js.Array[EvidenceVariableCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicVarargs(value: EvidenceVariableCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setCode(value: `all-of` | `any-of` | `at-least` | `at-most` | statistical | `net-effect` | dataset): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
