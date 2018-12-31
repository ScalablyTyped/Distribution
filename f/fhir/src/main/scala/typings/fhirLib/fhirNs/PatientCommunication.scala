package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Languages which may be used to communicate with the patient about his or her health
  */
trait PatientCommunication extends BackboneElement {
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.undefined
  /**
    * The language which can be used to communicate with the patient about his or her health
    */
  var language: CodeableConcept
  /**
    * Language preference indicator
    */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
}

