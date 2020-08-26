package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container for slots of time that may be available for booking appointments
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Schedule extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Whether this schedule is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson
    */
  var actor: js.Array[Reference] = js.native
  /**
    * Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates
    */
  var planningHorizon: js.UndefOr[Period] = js.native
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * The specific service that is to be performed during this appointment
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object Schedule {
  @scala.inline
  def apply(actor: js.Array[Reference]): Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActorVarargs(value: Reference*): Self = this.set("actor", js.Array(value :_*))
    @scala.inline
    def setActor(value: js.Array[Reference]): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setPlanningHorizon(value: Period): Self = this.set("planningHorizon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanningHorizon: Self = this.set("planningHorizon", js.undefined)
    @scala.inline
    def setServiceCategory(value: CodeableConcept): Self = this.set("serviceCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCategory: Self = this.set("serviceCategory", js.undefined)
    @scala.inline
    def setServiceTypeVarargs(value: CodeableConcept*): Self = this.set("serviceType", js.Array(value :_*))
    @scala.inline
    def setServiceType(value: js.Array[CodeableConcept]): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = this.set("specialty", js.Array(value :_*))
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = this.set("specialty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialty: Self = this.set("specialty", js.undefined)
  }
  
}

