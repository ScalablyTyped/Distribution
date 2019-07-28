package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mappings for a concept from the source set
  */
trait ConceptMapGroupElement extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Identifies element being mapped
    */
  var code: js.UndefOr[typings.fhir.fhirNs.code] = js.undefined
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * Concept in target system for element
    */
  var target: js.UndefOr[js.Array[ConceptMapGroupElementTarget]] = js.undefined
}

object ConceptMapGroupElement {
  @scala.inline
  def apply(
    _code: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    code: code = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    target: js.Array[ConceptMapGroupElementTarget] = null
  ): ConceptMapGroupElement = {
    val __obj = js.Dynamic.literal()
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (code != null) __obj.updateDynamic("code")(code)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ConceptMapGroupElement]
  }
}

