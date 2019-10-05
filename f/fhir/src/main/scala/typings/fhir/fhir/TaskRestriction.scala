package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constraints on fulfillment tasks
  */
trait TaskRestriction extends BackboneElement {
  /**
    * Contains extended information for property 'repetitions'.
    */
  var _repetitions: js.UndefOr[Element] = js.undefined
  /**
    * When fulfillment sought
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * For whom is fulfillment sought?
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * How many times to repeat
    */
  var repetitions: js.UndefOr[positiveInt] = js.undefined
}

object TaskRestriction {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _repetitions: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    recipient: js.Array[Reference] = null,
    repetitions: Int | Double = null
  ): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_repetitions != null) __obj.updateDynamic("_repetitions")(_repetitions)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (repetitions != null) __obj.updateDynamic("repetitions")(repetitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRestriction]
  }
}

