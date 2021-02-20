package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transform Rule from source to target
  */
@js.native
trait StructureMapGroupRule extends BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Which other rules to apply in the context of this rule
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.native
  
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Name of the rule for internal references
    */
  var name: id = js.native
  
  /**
    * Rules contained in this rule
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.native
  
  /**
    * Source inputs to the mapping
    */
  var source: js.Array[StructureMapGroupRuleSource] = js.native
  
  /**
    * Content to create because of this mapping rule
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.native
}
object StructureMapGroupRule {
  
  @scala.inline
  def apply(name: id, source: js.Array[StructureMapGroupRuleSource]): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRule]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleMutableBuilder[Self <: StructureMapGroupRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependent(value: js.Array[StructureMapGroupRuleDependent]): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    @scala.inline
    def setDependentVarargs(value: StructureMapGroupRuleDependent*): Self = StObject.set(x, "dependent", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: js.Array[StructureMapGroupRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: StructureMapGroupRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[StructureMapGroupRuleSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: StructureMapGroupRuleSource*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[StructureMapGroupRuleTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: StructureMapGroupRuleTarget*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
