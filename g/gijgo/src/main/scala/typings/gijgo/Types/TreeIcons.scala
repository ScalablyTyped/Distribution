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
  
  @scala.inline
  def apply(): TreeIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeIcons]
  }
  
  @scala.inline
  implicit class TreeIconsMutableBuilder[Self <: TreeIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
