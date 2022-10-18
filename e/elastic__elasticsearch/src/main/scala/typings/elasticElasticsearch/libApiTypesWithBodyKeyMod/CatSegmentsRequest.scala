package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatSegmentsRequest
  extends StObject
     with CatCatRequestBase {
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
}
object CatSegmentsRequest {
  
  inline def apply(): CatSegmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatSegmentsRequest]
  }
  
  extension [Self <: CatSegmentsRequest](x: Self) {
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
