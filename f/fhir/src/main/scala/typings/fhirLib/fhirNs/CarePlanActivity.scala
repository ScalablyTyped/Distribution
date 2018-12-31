package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action to occur as part of plan
  */
trait CarePlanActivity extends BackboneElement {
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.undefined
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
}

