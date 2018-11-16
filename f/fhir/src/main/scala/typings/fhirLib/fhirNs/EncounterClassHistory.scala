package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * List of past encounter classes
     */

trait EncounterClassHistory extends BackboneElement {
  /**
           * inpatient | outpatient | ambulatory | emergency +
           */
  var `class`: Coding
  /**
           * The time that the episode was in the specified class
           */
  var period: Period
}

