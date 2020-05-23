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
    repetitions: js.UndefOr[positiveInt] = js.undefined
  ): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_repetitions != null) __obj.updateDynamic("_repetitions")(_repetitions.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (!js.isUndefined(repetitions)) __obj.updateDynamic("repetitions")(repetitions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRestriction]
  }
}

