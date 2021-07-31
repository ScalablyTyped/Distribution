package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content to create because of this mapping rule
  */
trait StructureMapGroupRuleTarget
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'listRuleId'.
    */
  var _listRuleId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'transform'.
    */
  var _transform: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.undefined
  
  /**
    * Type or variable this rule applies to
    */
  var context: js.UndefOr[id] = js.undefined
  
  /**
    * type | variable
    */
  var contextType: js.UndefOr[code] = js.undefined
  
  /**
    * Field to create in the context
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * first | share | last | collate
    */
  var listMode: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * Internal rule reference for shared list items
    */
  var listRuleId: js.UndefOr[id] = js.undefined
  
  /**
    * Parameters to the transform
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.undefined
  
  /**
    * create | copy +
    */
  var transform: js.UndefOr[code] = js.undefined
  
  /**
    * Named context for field, if desired, and a field is specified
    */
  var variable: js.UndefOr[id] = js.undefined
}
object StructureMapGroupRuleTarget {
  
  @scala.inline
  def apply(): StructureMapGroupRuleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleTargetMutableBuilder[Self <: StructureMapGroupRuleTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: id): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextType(value: code): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setListMode(value: js.Array[code]): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    @scala.inline
    def setListModeVarargs(value: code*): Self = StObject.set(x, "listMode", js.Array(value :_*))
    
    @scala.inline
    def setListRuleId(value: id): Self = StObject.set(x, "listRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRuleIdUndefined: Self = StObject.set(x, "listRuleId", js.undefined)
    
    @scala.inline
    def setParameter(value: js.Array[StructureMapGroupRuleTargetParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: StructureMapGroupRuleTargetParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: code): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVariable(value: id): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def set_context(value: Element): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contextType(value: Element): Self = StObject.set(x, "_contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contextTypeUndefined: Self = StObject.set(x, "_contextType", js.undefined)
    
    @scala.inline
    def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    @scala.inline
    def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
    
    @scala.inline
    def set_listMode(value: js.Array[Element]): Self = StObject.set(x, "_listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_listModeUndefined: Self = StObject.set(x, "_listMode", js.undefined)
    
    @scala.inline
    def set_listModeVarargs(value: Element*): Self = StObject.set(x, "_listMode", js.Array(value :_*))
    
    @scala.inline
    def set_listRuleId(value: Element): Self = StObject.set(x, "_listRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_listRuleIdUndefined: Self = StObject.set(x, "_listRuleId", js.undefined)
    
    @scala.inline
    def set_transform(value: Element): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_transformUndefined: Self = StObject.set(x, "_transform", js.undefined)
    
    @scala.inline
    def set_variable(value: Element): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
  }
}
