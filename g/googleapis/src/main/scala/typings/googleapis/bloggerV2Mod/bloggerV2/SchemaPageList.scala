package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageList extends StObject {
  
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPage]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#pageList
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPageList {
  
  inline def apply(): SchemaPageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageList]
  }
  
  extension [Self <: SchemaPageList](x: Self) {
    
    inline def setItems(value: js.Array[SchemaPage]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPage*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
