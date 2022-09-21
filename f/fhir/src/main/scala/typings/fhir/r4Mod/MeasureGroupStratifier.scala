package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroupStratifier
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates a meaning for the stratifier. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing stratifiers to be correlated across measures.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Stratifiers are defined either as a single criteria, or as a set of component criteria.
    */
  var component: js.UndefOr[js.Array[MeasureGroupStratifierComponent]] = js.undefined
  
  /**
    * An expression that specifies the criteria for the stratifier. This is typically the name of an expression defined within a referenced library, but it may also be a path to a stratifier element.
    */
  var criteria: js.UndefOr[Expression] = js.undefined
  
  /**
    * The human readable description of this stratifier criteria.
    */
  var description: js.UndefOr[String] = js.undefined
}
object MeasureGroupStratifier {
  
  inline def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  
  extension [Self <: MeasureGroupStratifier](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComponent(value: js.Array[MeasureGroupStratifierComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: MeasureGroupStratifierComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setCriteria(value: Expression): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
