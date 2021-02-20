package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridIcons extends StObject {
  
  var collapseGroup: js.UndefOr[String] = js.native
  
  var collapseRow: js.UndefOr[String] = js.native
  
  var expandGroup: js.UndefOr[String] = js.native
  
  var expandRow: js.UndefOr[String] = js.native
}
object GridIcons {
  
  @scala.inline
  def apply(): GridIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridIcons]
  }
  
  @scala.inline
  implicit class GridIconsMutableBuilder[Self <: GridIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseGroup(value: String): Self = StObject.set(x, "collapseGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseGroupUndefined: Self = StObject.set(x, "collapseGroup", js.undefined)
    
    @scala.inline
    def setCollapseRow(value: String): Self = StObject.set(x, "collapseRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseRowUndefined: Self = StObject.set(x, "collapseRow", js.undefined)
    
    @scala.inline
    def setExpandGroup(value: String): Self = StObject.set(x, "expandGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandGroupUndefined: Self = StObject.set(x, "expandGroup", js.undefined)
    
    @scala.inline
    def setExpandRow(value: String): Self = StObject.set(x, "expandRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandRowUndefined: Self = StObject.set(x, "expandRow", js.undefined)
  }
}
