package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureTerm
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  /**
    * A codeable representation of the defined term.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Provides a definition for the term as used within the measure.
    */
  var definition: js.UndefOr[String] = js.undefined
}
object MeasureTerm {
  
  inline def apply(): MeasureTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureTerm] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
  }
}
