package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`all-of`
import typings.fhir.fhirStrings.`any-of`
import typings.fhir.fhirStrings.`at-least`
import typings.fhir.fhirStrings.`at-most`
import typings.fhir.fhirStrings.`net-effect`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristicCombination
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to specify if two or more characteristics are combined with OR or AND.
    */
  var code: `all-of` | `any-of` | `at-least` | `at-most` | `net-effect`
  
  /**
    * Provides the value of "n" when "at-least" or "at-most" codes are used.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object EvidenceVariableCharacteristicCombination {
  
  inline def apply(code: `all-of` | `any-of` | `at-least` | `at-most` | `net-effect`): EvidenceVariableCharacteristicCombination = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceVariableCharacteristicCombination]
  }
  
  extension [Self <: EvidenceVariableCharacteristicCombination](x: Self) {
    
    inline def setCode(value: `all-of` | `any-of` | `at-least` | `at-most` | `net-effect`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
