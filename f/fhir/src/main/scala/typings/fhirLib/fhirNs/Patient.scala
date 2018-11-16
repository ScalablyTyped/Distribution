package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about an individual or animal receiving health care services
     */

trait Patient extends DomainResource {
  /**
           * Contains extended information for property 'active'.
           */
  var _active: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'birthDate'.
           */
  var _birthDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'deceasedBoolean'.
           */
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'deceasedDateTime'.
           */
  var _deceasedDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'gender'.
           */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'multipleBirthBoolean'.
           */
  var _multipleBirthBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'multipleBirthInteger'.
           */
  var _multipleBirthInteger: js.UndefOr[Element] = js.undefined
  /**
           * Whether this patient's record is in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Addresses for the individual
           */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
           * This patient is known to be an animal (non-human)
           */
  var animal: js.UndefOr[PatientAnimal] = js.undefined
  /**
           * The date of birth for the individual
           */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
           * A list of Languages which may be used to communicate with the patient about his or her health
           */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.undefined
  /**
           * A contact party (e.g. guardian, partner, friend) for the patient
           */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.undefined
  /**
           * Indicates if the individual is deceased or not
           */
  var deceasedBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Indicates if the individual is deceased or not
           */
  var deceasedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * male | female | other | unknown
           */
  var gender: js.UndefOr[code] = js.undefined
  /**
           * Patient's nominated primary care provider
           */
  var generalPractitioner: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * An identifier for this patient
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Link to another patient resource that concerns the same actual person
           */
  var link: js.UndefOr[js.Array[PatientLink]] = js.undefined
  /**
           * Organization that is the custodian of the patient record
           */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * Marital (civil) status of a patient
           */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Whether patient is part of a multiple birth
           */
  var multipleBirthBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether patient is part of a multiple birth
           */
  var multipleBirthInteger: js.UndefOr[integer] = js.undefined
  /**
           * A name associated with the patient
           */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
           * Image of the patient
           */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
           * A contact detail for the individual
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

