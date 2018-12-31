package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Party to be paid any benefits payable
  */
trait ClaimPayee extends BackboneElement {
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.undefined
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[Coding] = js.undefined
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: CodeableConcept
}

