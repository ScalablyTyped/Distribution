package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
trait PatientContact extends BackboneElement {
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.undefined
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

