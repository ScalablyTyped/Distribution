package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this is a reply to prior message
  */
trait MessageHeaderResponse extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.undefined
  /**
    * ok | transient-error | fatal-error
    */
  var code: typings.fhir.fhir.code
  /**
    * Specific list of hints/warnings/errors
    */
  var details: js.UndefOr[Reference] = js.undefined
  /**
    * Id of original message
    */
  var identifier: id
}

object MessageHeaderResponse {
  @scala.inline
  def apply(
    code: code,
    identifier: id,
    _code: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _identifier: Element = null,
    details: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): MessageHeaderResponse = {
    val __obj = js.Dynamic.literal(code = code, identifier = identifier)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_identifier != null) __obj.updateDynamic("_identifier")(_identifier)
    if (details != null) __obj.updateDynamic("details")(details)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[MessageHeaderResponse]
  }
}

