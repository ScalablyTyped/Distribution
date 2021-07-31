package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who should participate in the action
  */
trait ActivityDefinitionParticipant
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * E.g. Nurse, Surgeon, Parent, etc
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * patient | practitioner | related-person
    */
  var `type`: code
}
object ActivityDefinitionParticipant {
  
  @scala.inline
  def apply(`type`: code): ActivityDefinitionParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDefinitionParticipant]
  }
  
  @scala.inline
  implicit class ActivityDefinitionParticipantMutableBuilder[Self <: ActivityDefinitionParticipant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
