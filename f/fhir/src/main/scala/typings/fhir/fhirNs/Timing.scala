package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A timing schedule that specifies an event that may occur multiple times
  */
trait Timing extends Element {
  /**
    * Contains extended information for property 'event'.
    */
  var _event: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When the event occurs
    */
  var event: js.UndefOr[js.Array[dateTime]] = js.undefined
  /**
    * When the event is to occur
    */
  var repeat: js.UndefOr[TimingRepeat] = js.undefined
}

object Timing {
  @scala.inline
  def apply(
    _event: js.Array[Element] = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    code: CodeableConcept = null,
    event: js.Array[dateTime] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    repeat: TimingRepeat = null
  ): Timing = {
    val __obj = js.Dynamic.literal()
    if (_event != null) __obj.updateDynamic("_event")(_event)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (event != null) __obj.updateDynamic("event")(event)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[Timing]
  }
}

