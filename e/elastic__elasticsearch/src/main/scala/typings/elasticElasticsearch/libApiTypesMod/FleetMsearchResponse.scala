package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetMsearchResponse[TDocument] extends StObject {
  
  var docs: js.Array[MsearchResponseItem[TDocument]]
}
object FleetMsearchResponse {
  
  inline def apply[TDocument](docs: js.Array[MsearchResponseItem[TDocument]]): FleetMsearchResponse[TDocument] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetMsearchResponse[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetMsearchResponse[?], TDocument] (val x: Self & FleetMsearchResponse[TDocument]) extends AnyVal {
    
    inline def setDocs(value: js.Array[MsearchResponseItem[TDocument]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: MsearchResponseItem[TDocument]*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
