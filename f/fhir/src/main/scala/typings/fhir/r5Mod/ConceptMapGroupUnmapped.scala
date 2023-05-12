package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`not-related-to`
import typings.fhir.fhirStrings.`other-map`
import typings.fhir.fhirStrings.`related-to`
import typings.fhir.fhirStrings.`source-is-broader-than-target`
import typings.fhir.fhirStrings.`source-is-narrower-than-target`
import typings.fhir.fhirStrings.`use-source-code`
import typings.fhir.fhirStrings.equivalent
import typings.fhir.fhirStrings.fixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroupUnmapped
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _otherMap: js.UndefOr[Element] = js.undefined
  
  var _relationship: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * The fixed code to use when the mode = 'fixed'  - all unmapped codes are mapped to a single fixed code.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The display is ignored when processing the map.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Defines which action to take if there is no match for the source concept in the target system designated for the group. One of 3 actions are possible: use the unmapped source code (this is useful when doing a mapping between versions, and only a few codes have changed), use a fixed code (a default code), or alternatively, a reference to a different concept map can be provided (by canonical URL).
    */
  var mode: `use-source-code` | fixed | `other-map`
  
  /**
    * The canonical reference to an additional ConceptMap resource instance to use for mapping if this ConceptMap resource contains no matching mapping for the source concept.
    */
  var otherMap: js.UndefOr[String] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may indicate that there is no mapping.
    */
  var relationship: js.UndefOr[
    `related-to` | equivalent | `source-is-narrower-than-target` | `source-is-broader-than-target` | `not-related-to`
  ] = js.undefined
  
  /**
    * The set of fixed codes to use when the mode = 'fixed'  - all unmapped codes are mapped to each of the fixed codes.
    */
  var valueSet: js.UndefOr[String] = js.undefined
}
object ConceptMapGroupUnmapped {
  
  inline def apply(mode: `use-source-code` | fixed | `other-map`): ConceptMapGroupUnmapped = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupUnmapped]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapGroupUnmapped] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setMode(value: `use-source-code` | fixed | `other-map`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOtherMap(value: String): Self = StObject.set(x, "otherMap", value.asInstanceOf[js.Any])
    
    inline def setOtherMapUndefined: Self = StObject.set(x, "otherMap", js.undefined)
    
    inline def setRelationship(
      value: `related-to` | equivalent | `source-is-narrower-than-target` | `source-is-broader-than-target` | `not-related-to`
    ): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_otherMap(value: Element): Self = StObject.set(x, "_otherMap", value.asInstanceOf[js.Any])
    
    inline def set_otherMapUndefined: Self = StObject.set(x, "_otherMap", js.undefined)
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}
