package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Tree
trait TreeIcons extends StObject {
  
  var collapse: js.UndefOr[String] = js.undefined
  
  var expand: js.UndefOr[String] = js.undefined
}
object TreeIcons {
  
  inline def apply(): TreeIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeIcons]
  }
  
  extension [Self <: TreeIcons](x: Self) {
    
    inline def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
