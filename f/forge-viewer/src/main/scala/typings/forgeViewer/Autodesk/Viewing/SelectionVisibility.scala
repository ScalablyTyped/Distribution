package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionVisibility extends StObject {
  
  var hasHidden: Boolean
  
  var hasVisible: Boolean
}
object SelectionVisibility {
  
  inline def apply(hasHidden: Boolean, hasVisible: Boolean): SelectionVisibility = {
    val __obj = js.Dynamic.literal(hasHidden = hasHidden.asInstanceOf[js.Any], hasVisible = hasVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionVisibility]
  }
  
  extension [Self <: SelectionVisibility](x: Self) {
    
    inline def setHasHidden(value: Boolean): Self = StObject.set(x, "hasHidden", value.asInstanceOf[js.Any])
    
    inline def setHasVisible(value: Boolean): Self = StObject.set(x, "hasVisible", value.asInstanceOf[js.Any])
  }
}
