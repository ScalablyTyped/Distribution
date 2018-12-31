package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of past encounter statuses
  */
trait EncounterStatusHistory extends BackboneElement {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The time that the episode was in the specified status
    */
  var period: Period
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code
}

