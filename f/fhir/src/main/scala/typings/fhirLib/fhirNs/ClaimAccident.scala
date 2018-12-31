package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about an accident
  */
trait ClaimAccident extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: date
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

