package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container for slots of time that may be available for booking appointments
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Schedule extends DomainResource {
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
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson
    */
  var actor: js.Array[Reference]
  /**
    * Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
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
  @scala.inline
  def apply(
    actor: js.Array[Reference],
    _active: Element = null,
    _comment: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    comment: java.lang.String = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    planningHorizon: Period = null,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    text: Narrative = null
  ): Schedule = {
    val __obj = js.Dynamic.literal(actor = actor)
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (planningHorizon != null) __obj.updateDynamic("planningHorizon")(planningHorizon)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory)
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType)
    if (specialty != null) __obj.updateDynamic("specialty")(specialty)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Schedule]
  }
}

