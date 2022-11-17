package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpListCategory extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/jump-list-category
  /**
    * Array of `JumpListItem` objects if `type` is `tasks` or `custom`, otherwise it
    * should be omitted.
    */
  var items: js.UndefOr[js.Array[JumpListItem]] = js.undefined
  
  /**
    * Must be set if `type` is `custom`, otherwise it should be omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * One of the following:
    */
  var `type`: js.UndefOr["tasks" | "frequent" | "recent" | "custom"] = js.undefined
}
object JumpListCategory {
  
  inline def apply(): JumpListCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListCategory]
  }
  
  extension [Self <: JumpListCategory](x: Self) {
    
    inline def setItems(value: js.Array[JumpListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: JumpListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: "tasks" | "frequent" | "recent" | "custom"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
