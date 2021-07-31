package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placeholder for evaluated elements
  */
trait TestScriptVariable
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'defaultValue'.
    */
  var _defaultValue: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'hint'.
    */
  var _hint: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  /**
    * Default, hard-coded, or user-defined value for this variable
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Natural language description of the variable
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The fluentpath expression against the fixture body
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP header field name for source
    */
  var headerField: js.UndefOr[String] = js.undefined
  
  /**
    * Hint help text for default value to enter
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptive name for this variable
    */
  var name: String
  
  /**
    * XPath or JSONPath against the fixture body
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Fixture Id of source expression or headerField within this variable
    */
  var sourceId: js.UndefOr[id] = js.undefined
}
object TestScriptVariable {
  
  @scala.inline
  def apply(name: String): TestScriptVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptVariable]
  }
  
  @scala.inline
  implicit class TestScriptVariableMutableBuilder[Self <: TestScriptVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setHeaderField(value: String): Self = StObject.set(x, "headerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFieldUndefined: Self = StObject.set(x, "headerField", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSourceId(value: id): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    @scala.inline
    def set_defaultValue(value: Element): Self = StObject.set(x, "_defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueUndefined: Self = StObject.set(x, "_defaultValue", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    @scala.inline
    def set_headerField(value: Element): Self = StObject.set(x, "_headerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_headerFieldUndefined: Self = StObject.set(x, "_headerField", js.undefined)
    
    @scala.inline
    def set_hint(value: Element): Self = StObject.set(x, "_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hintUndefined: Self = StObject.set(x, "_hint", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    @scala.inline
    def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
  }
}
