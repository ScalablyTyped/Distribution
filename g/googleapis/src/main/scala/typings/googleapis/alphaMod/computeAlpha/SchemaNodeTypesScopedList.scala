package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTypesScopedList extends StObject {
  
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the node types list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaNodeTypesScopedList {
  
  inline def apply(): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
  
  extension [Self <: SchemaNodeTypesScopedList](x: Self) {
    
    inline def setNodeTypes(value: js.Array[SchemaNodeType]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
    
    inline def setNodeTypesUndefined: Self = StObject.set(x, "nodeTypes", js.undefined)
    
    inline def setNodeTypesVarargs(value: SchemaNodeType*): Self = StObject.set(x, "nodeTypes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
