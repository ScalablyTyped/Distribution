package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`type`
import typings.fhir.fhirStrings.append
import typings.fhir.fhirStrings.c
import typings.fhir.fhirStrings.cast
import typings.fhir.fhirStrings.cc
import typings.fhir.fhirStrings.collate
import typings.fhir.fhirStrings.copy
import typings.fhir.fhirStrings.cp
import typings.fhir.fhirStrings.create
import typings.fhir.fhirStrings.dateOp
import typings.fhir.fhirStrings.escape
import typings.fhir.fhirStrings.evaluate
import typings.fhir.fhirStrings.first
import typings.fhir.fhirStrings.id
import typings.fhir.fhirStrings.last
import typings.fhir.fhirStrings.pointer
import typings.fhir.fhirStrings.qty
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.share
import typings.fhir.fhirStrings.translate
import typings.fhir.fhirStrings.truncate
import typings.fhir.fhirStrings.uuid
import typings.fhir.fhirStrings.variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRuleTarget
  extends StObject
     with BackboneElement {
  
  var _context: js.UndefOr[Element] = js.undefined
  
  var _contextType: js.UndefOr[Element] = js.undefined
  
  var _element: js.UndefOr[Element] = js.undefined
  
  var _listMode: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _listRuleId: js.UndefOr[Element] = js.undefined
  
  var _transform: js.UndefOr[Element] = js.undefined
  
  var _variable: js.UndefOr[Element] = js.undefined
  
  /**
    * Type or variable this rule applies to.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * How to interpret the context.
    */
  var contextType: js.UndefOr[`type` | variable] = js.undefined
  
  /**
    * Field to create in the context.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * If field is a list, how to manage the list.
    */
  var listMode: js.UndefOr[js.Array[first | share | last | collate]] = js.undefined
  
  /**
    * Internal rule reference for shared list items.
    */
  var listRuleId: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters to the transform.
    */
  var parameter: js.UndefOr[js.Array[StructureMapGroupRuleTargetParameter]] = js.undefined
  
  /**
    * How the data is copied / created.
    */
  var transform: js.UndefOr[
    create | copy | truncate | escape | cast | append | translate | reference | dateOp | uuid | pointer | evaluate | cc | c | qty | id | cp
  ] = js.undefined
  
  /**
    * Named context for field, if desired, and a field is specified.
    */
  var variable: js.UndefOr[String] = js.undefined
}
object StructureMapGroupRuleTarget {
  
  inline def apply(): StructureMapGroupRuleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureMapGroupRuleTarget] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextType(value: `type` | variable): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setListMode(value: js.Array[first | share | last | collate]): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setListModeVarargs(value: (first | share | last | collate)*): Self = StObject.set(x, "listMode", js.Array(value*))
    
    inline def setListRuleId(value: String): Self = StObject.set(x, "listRuleId", value.asInstanceOf[js.Any])
    
    inline def setListRuleIdUndefined: Self = StObject.set(x, "listRuleId", js.undefined)
    
    inline def setParameter(value: js.Array[StructureMapGroupRuleTargetParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: StructureMapGroupRuleTargetParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setTransform(
      value: create | copy | truncate | escape | cast | append | translate | reference | dateOp | uuid | pointer | evaluate | cc | c | qty | id | cp
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def set_context(value: Element): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextType(value: Element): Self = StObject.set(x, "_contextType", value.asInstanceOf[js.Any])
    
    inline def set_contextTypeUndefined: Self = StObject.set(x, "_contextType", js.undefined)
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    inline def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
    
    inline def set_listMode(value: js.Array[Element]): Self = StObject.set(x, "_listMode", value.asInstanceOf[js.Any])
    
    inline def set_listModeUndefined: Self = StObject.set(x, "_listMode", js.undefined)
    
    inline def set_listModeVarargs(value: Element*): Self = StObject.set(x, "_listMode", js.Array(value*))
    
    inline def set_listRuleId(value: Element): Self = StObject.set(x, "_listRuleId", value.asInstanceOf[js.Any])
    
    inline def set_listRuleIdUndefined: Self = StObject.set(x, "_listRuleId", js.undefined)
    
    inline def set_transform(value: Element): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    
    inline def set_transformUndefined: Self = StObject.set(x, "_transform", js.undefined)
    
    inline def set_variable(value: Element): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    inline def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
  }
}
