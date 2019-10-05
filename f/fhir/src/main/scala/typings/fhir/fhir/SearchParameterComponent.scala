package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For Composite resources to define the parts
  */
trait SearchParameterComponent extends BackboneElement {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Defines how the part works
    */
  var definition: Reference
  /**
    * Subexpression relative to main expression
    */
  var expression: String
}

object SearchParameterComponent {
  @scala.inline
  def apply(
    definition: Reference,
    expression: String,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition, expression = expression)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[SearchParameterComponent]
  }
}

