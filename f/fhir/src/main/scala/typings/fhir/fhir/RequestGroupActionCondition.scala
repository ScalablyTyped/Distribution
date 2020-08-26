package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whether or not the action is applicable
  */
@js.native
trait RequestGroupActionCondition extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  /**
    * Natural language description of the condition
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Boolean-valued expression
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * applicability | start | stop
    */
  var kind: code = js.native
  /**
    * Language of the expression
    */
  var language: js.UndefOr[String] = js.native
}

object RequestGroupActionCondition {
  @scala.inline
  def apply(kind: code): RequestGroupActionCondition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionCondition]
  }
  @scala.inline
  implicit class RequestGroupActionConditionOps[Self <: RequestGroupActionCondition] (val x: Self) extends AnyVal {
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
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    @scala.inline
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

