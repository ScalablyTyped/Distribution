package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For Composite resources to define the parts
  */
@js.native
trait SearchParameterComponent extends BackboneElement {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Defines how the part works
    */
  var definition: Reference = js.native
  /**
    * Subexpression relative to main expression
    */
  var expression: String = js.native
}

object SearchParameterComponent {
  @scala.inline
  def apply(definition: Reference, expression: String): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameterComponent]
  }
  @scala.inline
  implicit class SearchParameterComponentOps[Self <: SearchParameterComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefinition(value: Reference): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
  }
  
}

