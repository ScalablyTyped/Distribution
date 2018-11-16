package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The details of a healthcare service available at a location
     */

trait HealthcareService extends DomainResource {
  /**
           * Contains extended information for property 'active'.
           */
  var _active: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'appointmentRequired'.
           */
  var _appointmentRequired: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'availabilityExceptions'.
           */
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'eligibilityNote'.
           */
  var _eligibilityNote: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'extraDetails'.
           */
  var _extraDetails: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'programName'.
           */
  var _programName: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Whether this healthcareservice is in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If an appointment is required for access to this service
           */
  var appointmentRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Description of availability exceptions
           */
  var availabilityExceptions: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Times the Service Site is available
           */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.undefined
  /**
           * Broad category of service being performed or delivered
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Collection of characteristics (attributes)
           */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Additional description and/or any specific issues not covered elsewhere
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Location(s) service is inteded for/available to
           */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Specific eligibility requirements required to use the service
           */
  var eligibility: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Describes the eligibility conditions for the service
           */
  var eligibilityNote: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Technical endpoints providing access to services operated for the location
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Extra details about the service that can't be placed in the other fields
           */
  var extraDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
           * External identifiers for this item
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Location(s) where service may be provided
           */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Description of service as presented to a consumer while searching
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Not available during this time due to provided reason
           */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.undefined
  /**
           * Facilitates quick identification of the service
           */
  var photo: js.UndefOr[Attachment] = js.undefined
  /**
           * Program Names that categorize the service
           */
  var programName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Organization that provides this service
           */
  var providedBy: js.UndefOr[Reference] = js.undefined
  /**
           * Ways that the service accepts referrals
           */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Conditions under which service is available/offered
           */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Specialties handled by the HealthcareService
           */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Contacts related to the healthcare service
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
           * Type of service that may be delivered or performed
           */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

