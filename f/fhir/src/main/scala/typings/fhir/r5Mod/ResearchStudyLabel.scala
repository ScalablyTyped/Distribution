package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyLabel
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Kind of name.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The name.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ResearchStudyLabel {
  
  inline def apply(): ResearchStudyLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchStudyLabel]
  }
  
  extension [Self <: ResearchStudyLabel](x: Self) {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
