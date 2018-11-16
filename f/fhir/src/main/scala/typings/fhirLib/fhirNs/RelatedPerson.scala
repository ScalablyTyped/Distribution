package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An person that is related to a patient, but who is not a direct target of care
     */

trait RelatedPerson extends DomainResource {
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
           * Whether this related person's record is in active use
           */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Address where the related person can be contacted or visited
           */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
           * The date on which the related person was born
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
           * A name associated with the person
           */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
           * The patient this person is related to
           */
  var patient: Reference
  /**
           * Period of time that this relationship is considered valid
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Image of the person
           */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
           * The nature of the relationship
           */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * A contact detail for the person
           */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

