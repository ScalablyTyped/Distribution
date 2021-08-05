package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container for slots of time that may be available for booking appointments
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Schedule
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this schedule is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson
    */
  var actor: js.Array[Reference]
  
  /**
    * Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates
    */
  var planningHorizon: js.UndefOr[Period] = js.undefined
  
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific service that is to be performed during this appointment
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object Schedule {
  
  inline def apply(actor: js.Array[Reference]): Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActor(value: js.Array[Reference]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorVarargs(value: Reference*): Self = StObject.set(x, "actor", js.Array(value :_*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setPlanningHorizon(value: Period): Self = StObject.set(x, "planningHorizon", value.asInstanceOf[js.Any])
    
    inline def setPlanningHorizonUndefined: Self = StObject.set(x, "planningHorizon", js.undefined)
    
    inline def setServiceCategory(value: CodeableConcept): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    inline def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    inline def setServiceType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceType", js.Array(value :_*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value :_*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}
