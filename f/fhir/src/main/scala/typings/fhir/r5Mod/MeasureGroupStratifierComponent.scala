package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroupStratifierComponent
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates a meaning for the stratifier component. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing stratifiers to be correlated across measures.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An expression that specifies the criteria for this component of the stratifier. This is typically the name of an expression defined within a referenced library, but it may also be a path to a stratifier element.
    */
  var criteria: js.UndefOr[Expression] = js.undefined
  
  /**
    * The human readable description of this stratifier criteria component.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this approach can only be used for measures where the basis is of the same type as the populations (e.g. a Patient-based measure, rather than an Encounter-based measure). In addition, the referenced Group SHALL be a definitional (as opposed to an actual) group.
    */
  var groupDefinition: js.UndefOr[Reference] = js.undefined
  
  /**
    * This ''can'' be a meaningful identifier (e.g. a LOINC code) but is not intended to have any meaning.  GUIDs or sequential numbers are appropriate here.
    * LinkIds can have whitespaces and slashes by design. Tooling should not rely on linkIds being valid XHTML element IDs, and should not directly embed them as such
    */
  var linkId: js.UndefOr[String] = js.undefined
}
object MeasureGroupStratifierComponent {
  
  inline def apply(): MeasureGroupStratifierComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifierComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureGroupStratifierComponent] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCriteria(value: Expression): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroupDefinition(value: Reference): Self = StObject.set(x, "groupDefinition", value.asInstanceOf[js.Any])
    
    inline def setGroupDefinitionUndefined: Self = StObject.set(x, "groupDefinition", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
  }
}
