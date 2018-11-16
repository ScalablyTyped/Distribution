package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A container for slots of time that may be available for booking appointments
     */

trait Schedule extends DomainResource {
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

