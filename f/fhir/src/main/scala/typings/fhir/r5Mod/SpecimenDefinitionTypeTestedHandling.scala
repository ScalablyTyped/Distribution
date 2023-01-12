package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinitionTypeTestedHandling
  extends StObject
     with BackboneElement {
  
  var _instruction: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional textual instructions for the preservation or transport of the specimen. For instance, 'Protect from light exposure'.
    */
  var instruction: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum time interval of preservation of the specimen with these conditions.
    */
  var maxDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * It qualifies the interval of temperature, which characterizes an occurrence of handling. Conditions that are not related to temperature may be handled in the instruction element.
    */
  var temperatureQualifier: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The temperature interval for this set of handling instructions.
    */
  var temperatureRange: js.UndefOr[Range] = js.undefined
}
object SpecimenDefinitionTypeTestedHandling {
  
  inline def apply(): SpecimenDefinitionTypeTestedHandling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenDefinitionTypeTestedHandling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinitionTypeTestedHandling] (val x: Self) extends AnyVal {
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setMaxDuration(value: Duration): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setTemperatureQualifier(value: CodeableConcept): Self = StObject.set(x, "temperatureQualifier", value.asInstanceOf[js.Any])
    
    inline def setTemperatureQualifierUndefined: Self = StObject.set(x, "temperatureQualifier", js.undefined)
    
    inline def setTemperatureRange(value: Range): Self = StObject.set(x, "temperatureRange", value.asInstanceOf[js.Any])
    
    inline def setTemperatureRangeUndefined: Self = StObject.set(x, "temperatureRange", js.undefined)
    
    inline def set_instruction(value: Element): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
    
    inline def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
  }
}
