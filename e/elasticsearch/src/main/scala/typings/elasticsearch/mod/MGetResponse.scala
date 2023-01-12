package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MGetResponse[T] extends StObject {
  
  var docs: js.UndefOr[js.Array[GetResponse[T]]] = js.undefined
}
object MGetResponse {
  
  inline def apply[T](): MGetResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MGetResponse[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MGetResponse[?], T] (val x: Self & MGetResponse[T]) extends AnyVal {
    
    inline def setDocs(value: js.Array[GetResponse[T]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: GetResponse[T]*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
