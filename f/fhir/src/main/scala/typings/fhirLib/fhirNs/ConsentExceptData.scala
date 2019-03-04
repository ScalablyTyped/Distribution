package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data controlled by this exception
  */
trait ConsentExceptData extends BackboneElement {
  /**
    * Contains extended information for property 'meaning'.
    */
  var _meaning: js.UndefOr[Element] = js.undefined
  /**
    * instance | related | dependents | authoredby
    */
  var meaning: code
  /**
    * The actual data reference
    */
  var reference: Reference
}

object ConsentExceptData {
  @scala.inline
  def apply(
    meaning: code,
    reference: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _meaning: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ConsentExceptData = {
    val __obj = js.Dynamic.literal(meaning = meaning, reference = reference)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_meaning != null) __obj.updateDynamic("_meaning")(_meaning)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ConsentExceptData]
  }
}

