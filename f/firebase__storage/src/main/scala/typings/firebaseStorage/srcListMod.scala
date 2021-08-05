package typings.firebaseStorage

import typings.firebaseStorage.srcReferenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcListMod {
  
  type ListOptions = typings.firebaseStorageTypes.mod.ListOptions
  
  trait ListResult extends StObject {
    
    var items: js.Array[Reference]
    
    var nextPageToken: js.UndefOr[String] = js.undefined
    
    var prefixes: js.Array[Reference]
  }
  object ListResult {
    
    inline def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResult]
    }
    
    extension [Self <: ListResult](x: Self) {
      
      inline def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      inline def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
    }
  }
}
