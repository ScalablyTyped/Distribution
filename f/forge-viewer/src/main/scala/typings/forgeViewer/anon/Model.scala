package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var model: typings.forgeViewer.Autodesk.Viewing.Model
  
  var selection: js.Array[Double]
}
object Model {
  
  inline def apply(model: typings.forgeViewer.Autodesk.Viewing.Model, selection: js.Array[Double]): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: typings.forgeViewer.Autodesk.Viewing.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[Double]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: Double*): Self = StObject.set(x, "selection", js.Array(value*))
  }
}
