package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoComplete extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaAutoCompleteItem]] = js.undefined
}
object SchemaAutoComplete {
  
  inline def apply(): SchemaAutoComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoComplete]
  }
  
  extension [Self <: SchemaAutoComplete](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAutoCompleteItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAutoCompleteItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
