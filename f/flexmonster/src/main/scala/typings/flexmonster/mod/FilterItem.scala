package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterItem extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var hierarchyName: js.UndefOr[String] = js.undefined
  
  var uniqueName: js.UndefOr[String] = js.undefined
}
object FilterItem {
  
  inline def apply(): FilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterItem]
  }
  
  extension [Self <: FilterItem](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setHierarchyName(value: String): Self = StObject.set(x, "hierarchyName", value.asInstanceOf[js.Any])
    
    inline def setHierarchyNameUndefined: Self = StObject.set(x, "hierarchyName", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
