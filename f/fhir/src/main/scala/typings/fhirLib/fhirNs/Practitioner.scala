package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person with a  formal responsibility in the provisioning of healthcare or related services
  */
trait Practitioner extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Address(es) of the practitioner that are not role specific (typically home address)
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date  on which the practitioner was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
    * A language the practitioner is able to use in patient communication
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A identifier for the person as this agent
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The name(s) associated with the practitioner
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Qualifications obtained by training and certification
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.undefined
  /**
    * A contact detail for the practitioner (that apply to all roles)
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

