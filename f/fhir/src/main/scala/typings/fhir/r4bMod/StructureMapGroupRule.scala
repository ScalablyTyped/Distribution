package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRule
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Which other rules to apply in the context of this rule.
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.undefined
  
  /**
    * Documentation for this instance of data.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the rule for internal references.
    */
  var name: String
  
  /**
    * Rules contained in this rule.
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.undefined
  
  /**
    * Source inputs to the mapping.
    */
  var source: js.Array[StructureMapGroupRuleSource]
  
  /**
    * Content to create because of this mapping rule.
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.undefined
}
object StructureMapGroupRule {
  
  inline def apply(name: String, source: js.Array[StructureMapGroupRuleSource]): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureMapGroupRule] (val x: Self) extends AnyVal {
    
    inline def setDependent(value: js.Array[StructureMapGroupRuleDependent]): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setDependentVarargs(value: StructureMapGroupRuleDependent*): Self = StObject.set(x, "dependent", js.Array(value*))
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[StructureMapGroupRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: StructureMapGroupRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setSource(value: js.Array[StructureMapGroupRuleSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: StructureMapGroupRuleSource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTarget(value: js.Array[StructureMapGroupRuleTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: StructureMapGroupRuleTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
