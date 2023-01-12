package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuCallbackStatus extends StObject {
  
  var hasHidden: Boolean
  
  var hasSelected: Boolean
  
  var hasVisible: Boolean
  
  var numSelected: Double
}
object ContextMenuCallbackStatus {
  
  inline def apply(hasHidden: Boolean, hasSelected: Boolean, hasVisible: Boolean, numSelected: Double): ContextMenuCallbackStatus = {
    val __obj = js.Dynamic.literal(hasHidden = hasHidden.asInstanceOf[js.Any], hasSelected = hasSelected.asInstanceOf[js.Any], hasVisible = hasVisible.asInstanceOf[js.Any], numSelected = numSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuCallbackStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuCallbackStatus] (val x: Self) extends AnyVal {
    
    inline def setHasHidden(value: Boolean): Self = StObject.set(x, "hasHidden", value.asInstanceOf[js.Any])
    
    inline def setHasSelected(value: Boolean): Self = StObject.set(x, "hasSelected", value.asInstanceOf[js.Any])
    
    inline def setHasVisible(value: Boolean): Self = StObject.set(x, "hasVisible", value.asInstanceOf[js.Any])
    
    inline def setNumSelected(value: Double): Self = StObject.set(x, "numSelected", value.asInstanceOf[js.Any])
  }
}
