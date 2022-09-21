package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedColumns extends StObject {
  
  /**
    * Each card supports up to 2 columns.
    */
  var columnItems: js.UndefOr[js.Array[SchemaAppsDynamiteSharedColumnsColumn]] = js.undefined
  
  /**
    * Controls how the column resizes based on screen width.
    */
  var wrapStyle: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedColumns {
  
  inline def apply(): SchemaAppsDynamiteSharedColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedColumns]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedColumns](x: Self) {
    
    inline def setColumnItems(value: js.Array[SchemaAppsDynamiteSharedColumnsColumn]): Self = StObject.set(x, "columnItems", value.asInstanceOf[js.Any])
    
    inline def setColumnItemsUndefined: Self = StObject.set(x, "columnItems", js.undefined)
    
    inline def setColumnItemsVarargs(value: SchemaAppsDynamiteSharedColumnsColumn*): Self = StObject.set(x, "columnItems", js.Array(value*))
    
    inline def setWrapStyle(value: String): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapStyleNull: Self = StObject.set(x, "wrapStyle", null)
    
    inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
  }
}
