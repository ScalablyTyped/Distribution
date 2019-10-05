package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What operations are supported?
  */
trait CapabilityStatementRestResourceInteraction extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * read | vread | update | patch | delete | history-instance | history-type | create | search-type
    */
  var code: typings.fhir.fhir.code
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[String] = js.undefined
}

object CapabilityStatementRestResourceInteraction {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementRestResourceInteraction = {
    val __obj = js.Dynamic.literal(code = code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CapabilityStatementRestResourceInteraction]
  }
}

