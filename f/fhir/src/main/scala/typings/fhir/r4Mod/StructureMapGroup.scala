package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`type-and-types`
import typings.fhir.fhirStrings.none
import typings.fhir.fhirStrings.types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroup
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _extends: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _typeMode: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional supporting documentation that explains the purpose of the group and the types of mappings within it.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Another group that this group adds rules to.
    */
  var `extends`: js.UndefOr[String] = js.undefined
  
  /**
    * If no inputs are named, then the entry mappings are type based.
    */
  var input: js.Array[StructureMapGroupInput]
  
  /**
    * A unique name for the group for the convenience of human readers.
    */
  var name: String
  
  /**
    * Transform Rule from source to target.
    */
  var rule: js.Array[StructureMapGroupRule]
  
  /**
    * Not applicable if the underlying model is untyped. There can only be one default mapping for any particular type combination.
    */
  var typeMode: none | types | `type-and-types`
}
object StructureMapGroup {
  
  inline def apply(
    input: js.Array[StructureMapGroupInput],
    name: String,
    rule: js.Array[StructureMapGroupRule],
    typeMode: none | types | `type-and-types`
  ): StructureMapGroup = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], typeMode = typeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroup]
  }
  
  extension [Self <: StructureMapGroup](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setInput(value: js.Array[StructureMapGroupInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: StructureMapGroupInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[StructureMapGroupRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: StructureMapGroupRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setTypeMode(value: none | types | `type-and-types`): Self = StObject.set(x, "typeMode", value.asInstanceOf[js.Any])
    
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
