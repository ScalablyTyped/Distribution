package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MgetResponse[TDocument] extends StObject {
  
  var docs: js.Array[MgetResponseItem[TDocument]]
}
object MgetResponse {
  
  inline def apply[TDocument](docs: js.Array[MgetResponseItem[TDocument]]): MgetResponse[TDocument] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MgetResponse[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MgetResponse[?], TDocument] (val x: Self & MgetResponse[TDocument]) extends AnyVal {
    
    inline def setDocs(value: js.Array[MgetResponseItem[TDocument]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: MgetResponseItem[TDocument]*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
