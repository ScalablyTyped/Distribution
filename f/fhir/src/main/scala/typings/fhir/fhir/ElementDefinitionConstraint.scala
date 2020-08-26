package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that must evaluate to true
  */
@js.native
trait ElementDefinitionConstraint extends Element {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'human'.
    */
  var _human: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'key'.
    */
  var _key: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requirements'.
    */
  var _requirements: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.native
  /**
    * FHIRPath expression of constraint
    */
  var expression: String = js.native
  /**
    * Human description of constraint
    */
  var human: String = js.native
  /**
    * Target of 'condition' reference above
    */
  var key: id = js.native
  /**
    * Why this constraint is necessary or appropriate
    */
  var requirements: js.UndefOr[String] = js.native
  /**
    * error | warning
    */
  var severity: code = js.native
  /**
    * Reference to original source of constraint
    */
  var source: js.UndefOr[uri] = js.native
  /**
    * XPath expression of constraint
    */
  var xpath: js.UndefOr[String] = js.native
}

object ElementDefinitionConstraint {
  @scala.inline
  def apply(expression: String, human: String, key: id, severity: code): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  @scala.inline
  implicit class ElementDefinitionConstraintOps[Self <: ElementDefinitionConstraint] (val x: Self) extends AnyVal {
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setHuman(value: String): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: id): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: code): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    @scala.inline
    def set_human(value: Element): Self = this.set("_human", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_human: Self = this.set("_human", js.undefined)
    @scala.inline
    def set_key(value: Element): Self = this.set("_key", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_key: Self = this.set("_key", js.undefined)
    @scala.inline
    def set_requirements(value: Element): Self = this.set("_requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_requirements: Self = this.set("_requirements", js.undefined)
    @scala.inline
    def set_severity(value: Element): Self = this.set("_severity", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_severity: Self = this.set("_severity", js.undefined)
    @scala.inline
    def set_source(value: Element): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_xpath(value: Element): Self = this.set("_xpath", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_xpath: Self = this.set("_xpath", js.undefined)
    @scala.inline
    def setRequirements(value: String): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    @scala.inline
    def setSource(value: uri): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
  }
  
}

