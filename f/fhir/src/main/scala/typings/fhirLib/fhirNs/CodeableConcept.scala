package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concept - reference to a terminology or just  text
  */
trait CodeableConcept extends Element {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Code defined by a terminology system
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Plain text representation of the concept
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CodeableConcept {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _text: Element = null,
    coding: js.Array[Coding] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    text: java.lang.String = null
  ): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (coding != null) __obj.updateDynamic("coding")(coding)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CodeableConcept]
  }
}

