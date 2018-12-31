package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clinical service(s) being documented
  */
trait CompositionEvent extends BackboneElement {
  /**
    * Code(s) that apply to the event being documented
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * The event(s) being documented
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The period covered by the documentation
    */
  var period: js.UndefOr[Period] = js.undefined
}

