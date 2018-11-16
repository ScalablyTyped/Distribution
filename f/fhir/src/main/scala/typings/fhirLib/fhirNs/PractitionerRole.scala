package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Roles/organizations the practitioner is associated with
     */

trait PractitionerRole extends DomainResource {
  /**
           * Contains extended information for property 'active'.
           */
  var _active: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'availabilityExceptions'.
           */
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  /**
           * Whether this practitioner's record is in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Description of availability exceptions
           */
  var availabilityExceptions: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Times the Service Site is available
           */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.undefined
  /**
           * Roles which this practitioner may perform
           */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Technical endpoints providing access to services operated for the practitioner with this role
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * The list of healthcare services that this worker provides for this role's Organization/Location(s)
           */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Business Identifiers that are specific to a role/location
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * The location(s) at which this practitioner provides care
           */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Not available during this time due to provided reason
           */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.undefined
  /**
           * Organization where the roles are available
           */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
           * The period during which the practitioner is authorized to perform in these role(s)
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Practitioner that is able to provide the defined services for the organation
           */
  var practitioner: js.UndefOr[Reference] = js.undefined
  /**
           * Specific specialty of the practitioner
           */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Contact details that are specific to the role/location/service
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

