package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Named sections for reader convenience
  */
trait StructureMapGroup
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'extends'.
    */
  var _extends: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'typeMode'.
    */
  var _typeMode: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional description/explaination for group
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Another group that this group adds rules to
    */
  var `extends`: js.UndefOr[id] = js.undefined
  
  /**
    * Named instance provided when invoking the map
    */
  var input: js.Array[StructureMapGroupInput]
  
  /**
    * Human-readable label
    */
  var name: id
  
  /**
    * Transform Rule from source to target
    */
  var rule: js.Array[StructureMapGroupRule]
  
  /**
    * none | types | type-and-types
    */
  var typeMode: code
}
object StructureMapGroup {
  
  inline def apply(
    input: js.Array[StructureMapGroupInput],
    name: id,
    rule: js.Array[StructureMapGroupRule],
    typeMode: code
  ): StructureMapGroup = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], typeMode = typeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroup]
  }
  
  extension [Self <: StructureMapGroup](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setExtends(value: id): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setInput(value: js.Array[StructureMapGroupInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: StructureMapGroupInput*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    inline def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[StructureMapGroupRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: StructureMapGroupRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    inline def setTypeMode(value: code): Self = StObject.set(x, "typeMode", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_extends(value: Element): Self = StObject.set(x, "_extends", value.asInstanceOf[js.Any])
    
    inline def set_extendsUndefined: Self = StObject.set(x, "_extends", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_typeMode(value: Element): Self = StObject.set(x, "_typeMode", value.asInstanceOf[js.Any])
    
    inline def set_typeModeUndefined: Self = StObject.set(x, "_typeMode", js.undefined)
  }
}
