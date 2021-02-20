package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterItem extends StObject {
  
  var caption: js.UndefOr[String] = js.native
  
  var hierarchyName: js.UndefOr[String] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object FilterItem {
  
  @scala.inline
  def apply(): FilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterItem]
  }
  
  @scala.inline
  implicit class FilterItemMutableBuilder[Self <: FilterItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setHierarchyName(value: String): Self = StObject.set(x, "hierarchyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyNameUndefined: Self = StObject.set(x, "hierarchyName", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
