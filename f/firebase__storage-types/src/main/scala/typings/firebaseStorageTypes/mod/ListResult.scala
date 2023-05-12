package typings.firebaseStorageTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResult extends StObject {
  
  var items: js.Array[Reference]
  
  var nextPageToken: String | Null
  
  var prefixes: js.Array[Reference]
}
object ListResult {
  
  inline def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], nextPageToken = null)
    __obj.asInstanceOf[ListResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResult] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value*))
  }
}
