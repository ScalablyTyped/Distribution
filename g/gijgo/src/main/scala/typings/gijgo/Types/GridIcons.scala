package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridIcons extends StObject {
  
  var collapseGroup: js.UndefOr[String] = js.undefined
  
  var collapseRow: js.UndefOr[String] = js.undefined
  
  var expandGroup: js.UndefOr[String] = js.undefined
  
  var expandRow: js.UndefOr[String] = js.undefined
}
object GridIcons {
  
  inline def apply(): GridIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridIcons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridIcons] (val x: Self) extends AnyVal {
    
    inline def setCollapseGroup(value: String): Self = StObject.set(x, "collapseGroup", value.asInstanceOf[js.Any])
    
    inline def setCollapseGroupUndefined: Self = StObject.set(x, "collapseGroup", js.undefined)
    
    inline def setCollapseRow(value: String): Self = StObject.set(x, "collapseRow", value.asInstanceOf[js.Any])
    
    inline def setCollapseRowUndefined: Self = StObject.set(x, "collapseRow", js.undefined)
    
    inline def setExpandGroup(value: String): Self = StObject.set(x, "expandGroup", value.asInstanceOf[js.Any])
    
    inline def setExpandGroupUndefined: Self = StObject.set(x, "expandGroup", js.undefined)
    
    inline def setExpandRow(value: String): Self = StObject.set(x, "expandRow", value.asInstanceOf[js.Any])
    
    inline def setExpandRowUndefined: Self = StObject.set(x, "expandRow", js.undefined)
  }
}
