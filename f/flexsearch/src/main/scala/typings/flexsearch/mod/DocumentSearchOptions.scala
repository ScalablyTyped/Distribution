package typings.flexsearch.mod

import typings.flexsearch.flexsearchStrings.and
import typings.flexsearch.flexsearchStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSearchOptions[T /* <: Boolean */]
  extends StObject
     with SearchOptions {
  
  var bool: js.UndefOr[and | or] = js.undefined
  
  var enrich: js.UndefOr[T] = js.undefined
  
  var index: js.UndefOr[String | (js.Array[SearchOptions | String])] = js.undefined
  
  var tag: js.UndefOr[String | js.Array[String]] = js.undefined
}
object DocumentSearchOptions {
  
  inline def apply[T /* <: Boolean */](): DocumentSearchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSearchOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSearchOptions[?], T /* <: Boolean */] (val x: Self & DocumentSearchOptions[T]) extends AnyVal {
    
    inline def setBool(value: and | or): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setEnrich(value: T): Self = StObject.set(x, "enrich", value.asInstanceOf[js.Any])
    
    inline def setEnrichUndefined: Self = StObject.set(x, "enrich", js.undefined)
    
    inline def setIndex(value: String | (js.Array[SearchOptions | String])): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: (SearchOptions | String)*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
  }
}
