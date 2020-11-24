package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placeholder for evaluated elements
  */
@js.native
trait TestScriptVariable extends BackboneElement {
  
  /**
    * Contains extended information for property 'defaultValue'.
    */
  var _defaultValue: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'hint'.
    */
  var _hint: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.native
  
  /**
    * Default, hard-coded, or user-defined value for this variable
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * Natural language description of the variable
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The fluentpath expression against the fixture body
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * HTTP header field name for source
    */
  var headerField: js.UndefOr[String] = js.native
  
  /**
    * Hint help text for default value to enter
    */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * Descriptive name for this variable
    */
  var name: String = js.native
  
  /**
    * XPath or JSONPath against the fixture body
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Fixture Id of source expression or headerField within this variable
    */
  var sourceId: js.UndefOr[id] = js.native
}
object TestScriptVariable {
  
  @scala.inline
  def apply(name: String): TestScriptVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptVariable]
  }
  
  @scala.inline
  implicit class TestScriptVariableOps[Self <: TestScriptVariable] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValue(value: Element): Self = this.set("_defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValue: Self = this.set("_defaultValue", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    
    @scala.inline
    def set_headerField(value: Element): Self = this.set("_headerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_headerField: Self = this.set("_headerField", js.undefined)
    
    @scala.inline
    def set_hint(value: Element): Self = this.set("_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_hint: Self = this.set("_hint", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    
    @scala.inline
    def set_sourceId(value: Element): Self = this.set("_sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sourceId: Self = this.set("_sourceId", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setHeaderField(value: String): Self = this.set("headerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderField: Self = this.set("headerField", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSourceId(value: id): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
  }
}
