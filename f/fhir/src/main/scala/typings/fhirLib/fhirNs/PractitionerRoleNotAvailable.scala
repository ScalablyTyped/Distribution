package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Not available during this time due to provided reason
  */
trait PractitionerRoleNotAvailable extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Reason presented to the user explaining why time not available
    */
  var description: java.lang.String
  /**
    * Service not availablefrom this date
    */
  var during: js.UndefOr[Period] = js.undefined
}

