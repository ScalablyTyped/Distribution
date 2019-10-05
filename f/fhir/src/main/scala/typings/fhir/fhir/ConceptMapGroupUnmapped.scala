package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When no match in the mappings
  */
trait ConceptMapGroupUnmapped extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Fixed code when mode = fixed
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * provided | fixed | other-map
    */
  var mode: code
  /**
    * Canonical URL for other concept map
    */
  var url: js.UndefOr[uri] = js.undefined
}

object ConceptMapGroupUnmapped {
  @scala.inline
  def apply(
    mode: code,
    _code: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _url: Element = null,
    code: code = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    url: uri = null
  ): ConceptMapGroupUnmapped = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (code != null) __obj.updateDynamic("code")(code)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ConceptMapGroupUnmapped]
  }
}

