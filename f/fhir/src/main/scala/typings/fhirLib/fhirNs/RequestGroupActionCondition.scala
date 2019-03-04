package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whether or not the action is applicable
  */
trait RequestGroupActionCondition extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Natural language description of the condition
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean-valued expression
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * applicability | start | stop
    */
  var kind: code
  /**
    * Language of the expression
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object RequestGroupActionCondition {
  @scala.inline
  def apply(
    kind: code,
    _description: Element = null,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _kind: Element = null,
    _language: Element = null,
    description: java.lang.String = null,
    expression: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    language: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): RequestGroupActionCondition = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[RequestGroupActionCondition]
  }
}

