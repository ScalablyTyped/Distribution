package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionDef extends StObject {
  
  var ids: js.Array[Double]
  
  var model: Model
  
  var selectionType: js.UndefOr[SelectionType] = js.undefined
}
object SelectionDef {
  
  inline def apply(ids: js.Array[Double], model: Model): SelectionDef = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionDef]
  }
  
  extension [Self <: SelectionDef](x: Self) {
    
    inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSelectionType(value: SelectionType): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
  }
}
