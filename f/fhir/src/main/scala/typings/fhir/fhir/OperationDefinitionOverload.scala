package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define overloaded variants for when  generating code
  */
trait OperationDefinitionOverload extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'parameterName'.
    */
  var _parameterName: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Comments to go on overload
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Name of parameter to include in overload
    */
  var parameterName: js.UndefOr[js.Array[String]] = js.undefined
}

object OperationDefinitionOverload {
  @scala.inline
  def apply(
    _comment: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _parameterName: js.Array[Element] = null,
    comment: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    parameterName: js.Array[String] = null
  ): OperationDefinitionOverload = {
    val __obj = js.Dynamic.literal()
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_parameterName != null) __obj.updateDynamic("_parameterName")(_parameterName)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[OperationDefinitionOverload]
  }
}

