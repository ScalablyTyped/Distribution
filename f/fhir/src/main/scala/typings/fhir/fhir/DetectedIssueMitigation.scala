package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Step taken to address
  */
trait DetectedIssueMitigation extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * What mitigation?
    */
  var action: CodeableConcept
  /**
    * Who is committing?
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Date committed
    */
  var date: js.UndefOr[dateTime] = js.undefined
}

object DetectedIssueMitigation {
  @scala.inline
  def apply(
    action: CodeableConcept,
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    author: Reference = null,
    date: dateTime = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): DetectedIssueMitigation = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssueMitigation]
  }
}

