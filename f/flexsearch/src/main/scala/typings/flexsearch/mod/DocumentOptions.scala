package typings.flexsearch.mod

import typings.flexsearch.anon.Field
import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOptions[T, Store /* <: StoreOption */] extends StObject {
  
  var id: String
  
  var index: String | (js.Array[((IndexOptions[T, Store]) & Field) | String])
  
  var store: js.UndefOr[Store] = js.undefined
  
  var tag: js.UndefOr[`false` | String] = js.undefined
}
object DocumentOptions {
  
  inline def apply[T, Store /* <: StoreOption */](id: String, index: String | (js.Array[((IndexOptions[T, Store]) & Field) | String])): DocumentOptions[T, Store] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOptions[T, Store]]
  }
  
  extension [Self <: DocumentOptions[?, ?], T, Store /* <: StoreOption */](x: Self & (DocumentOptions[T, Store])) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String | (js.Array[((IndexOptions[T, Store]) & Field) | String])): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: (((IndexOptions[T, Store]) & Field) | String)*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTag(value: `false` | String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
