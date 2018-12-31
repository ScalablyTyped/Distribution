package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contact for the organization for a certain purpose
  */
trait OrganizationContact extends BackboneElement {
  /**
    * Visiting or postal addresses for the contact
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * A name associated with the contact
    */
  var name: js.UndefOr[HumanName] = js.undefined
  /**
    * The type of contact
    */
  var purpose: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contact details (telephone, email, etc.)  for a contact
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

