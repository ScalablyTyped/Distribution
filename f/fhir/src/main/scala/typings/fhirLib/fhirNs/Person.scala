package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic person record
  */
trait Person extends DomainResource {
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
    * This person's record is in active use
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One or more addresses for the person
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date on which the person was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Link to a resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.undefined
  /**
    * The organization that is the custodian of the person record
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * Image of the person
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

