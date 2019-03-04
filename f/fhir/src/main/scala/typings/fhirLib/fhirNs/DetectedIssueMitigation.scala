package typings
package fhirLib.fhirNs

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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): DetectedIssueMitigation = {
    val __obj = js.Dynamic.literal(action = action)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (author != null) __obj.updateDynamic("author")(author)
    if (date != null) __obj.updateDynamic("date")(date)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[DetectedIssueMitigation]
  }
}

