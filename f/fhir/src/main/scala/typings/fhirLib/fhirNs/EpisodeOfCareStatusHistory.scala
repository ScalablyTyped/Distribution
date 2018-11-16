package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Past list of status codes (the current status may be included to cover the start date of the status)
     */

trait EpisodeOfCareStatusHistory extends BackboneElement {
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Duration the EpisodeOfCare was in the specified status
           */
  var period: Period
  /**
           * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
           */
  var status: code
}

