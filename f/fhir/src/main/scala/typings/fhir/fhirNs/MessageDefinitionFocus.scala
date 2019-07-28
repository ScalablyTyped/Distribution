package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource(s) that are the subject of the event
  */
trait MessageDefinitionFocus extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  /**
    * Type of resource
    */
  var code: typings.fhir.fhirNs.code
  /**
    * Maximum number of focuses of this type
    */
  var max: js.UndefOr[String] = js.undefined
  /**
    * Minimum number of focuses of this type
    */
  var min: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Profile that must be adhered to by focus
    */
  var profile: js.UndefOr[Reference] = js.undefined
}

object MessageDefinitionFocus {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _max: Element = null,
    _min: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    max: String = null,
    min: js.UndefOr[unsignedInt] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    profile: Reference = null
  ): MessageDefinitionFocus = {
    val __obj = js.Dynamic.literal(code = code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_max != null) __obj.updateDynamic("_max")(_max)
    if (_min != null) __obj.updateDynamic("_min")(_min)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[MessageDefinitionFocus]
  }
}

