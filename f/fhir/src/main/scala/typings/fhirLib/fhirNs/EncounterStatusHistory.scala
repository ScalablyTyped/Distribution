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

object EncounterStatusHistory {
  @scala.inline
  def apply(
    period: Period,
    status: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _status: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): EncounterStatusHistory = {
    val __obj = js.Dynamic.literal(period = period, status = status)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[EncounterStatusHistory]
  }
}

