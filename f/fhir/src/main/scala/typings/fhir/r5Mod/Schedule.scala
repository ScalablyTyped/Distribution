package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may be used to mark that the resource was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The capacity to support multiple referenced resource types should be used in cases where the specific resources themselves cannot be scheduled without the other, and thus only make sense to the system exposing them as a group. Common examples of this are where the combination of a practitioner and a room (Location) are always required by a system.
    */
  var actor: js.Array[Reference]
  
  /**
    * Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * External Ids for this item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The period of time that the slots that reference this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates.
    */
  var planningHorizon: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Schedule: typings.fhir.fhirStrings.Schedule
  
  /**
    * A broad categorization of the service that is to be performed during this appointment.
    */
  var serviceCategory: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specific service that is to be performed during this appointment.
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Schedule {
  
  inline def apply(actor: js.Array[Reference]): Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], resourceType = "Schedule")
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActor(value: js.Array[Reference]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorVarargs(value: Reference*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPlanningHorizon(value: Period): Self = StObject.set(x, "planningHorizon", value.asInstanceOf[js.Any])
    
    inline def setPlanningHorizonUndefined: Self = StObject.set(x, "planningHorizon", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Schedule): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    inline def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    inline def setServiceCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceCategory", js.Array(value*))
    
    inline def setServiceType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}
