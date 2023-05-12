package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnitStructuralRepresentation
  extends StObject
     with BackboneElement {
  
  var _representation: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var attachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Todo.
    */
  var representation: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerRepeatRepeatUnitStructuralRepresentation {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnitStructuralRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerRepeatRepeatUnitStructuralRepresentation] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setRepresentation(value: String): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_representation(value: Element): Self = StObject.set(x, "_representation", value.asInstanceOf[js.Any])
    
    inline def set_representationUndefined: Self = StObject.set(x, "_representation", js.undefined)
  }
}
