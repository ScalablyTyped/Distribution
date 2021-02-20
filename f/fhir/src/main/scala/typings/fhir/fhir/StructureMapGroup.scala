package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named sections for reader convenience
  */
@js.native
trait StructureMapGroup extends BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'extends'.
    */
  var _extends: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'typeMode'.
    */
  var _typeMode: js.UndefOr[Element] = js.native
  
  /**
    * Additional description/explaination for group
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Another group that this group adds rules to
    */
  var `extends`: js.UndefOr[id] = js.native
  
  /**
    * Named instance provided when invoking the map
    */
  var input: js.Array[StructureMapGroupInput] = js.native
  
  /**
    * Human-readable label
    */
  var name: id = js.native
  
  /**
    * Transform Rule from source to target
    */
  var rule: js.Array[StructureMapGroupRule] = js.native
  
  /**
    * none | types | type-and-types
    */
  var typeMode: code = js.native
}
object StructureMapGroup {
  
  @scala.inline
  def apply(
    input: js.Array[StructureMapGroupInput],
    name: id,
    rule: js.Array[StructureMapGroupRule],
    typeMode: code
  ): StructureMapGroup = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], typeMode = typeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroup]
  }
  
  @scala.inline
  implicit class StructureMapGroupMutableBuilder[Self <: StructureMapGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setExtends(value: id): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setInput(value: js.Array[StructureMapGroupInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputVarargs(value: StructureMapGroupInput*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: js.Array[StructureMapGroupRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVarargs(value: StructureMapGroupRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setTypeMode(value: code): Self = StObject.set(x, "typeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_extends(value: Element): Self = StObject.set(x, "_extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_extendsUndefined: Self = StObject.set(x, "_extends", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_typeMode(value: Element): Self = StObject.set(x, "_typeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeModeUndefined: Self = StObject.set(x, "_typeMode", js.undefined)
  }
}
