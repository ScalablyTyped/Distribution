package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatIndicesRequest
  extends StObject
     with CatCatRequestBase {
  
  var bytes: js.UndefOr[Bytes] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var health: js.UndefOr[HealthStatus] = js.undefined
  
  var include_unloaded_segments: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var pri: js.UndefOr[Boolean] = js.undefined
}
object CatIndicesRequest {
  
  inline def apply(): CatIndicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatIndicesRequest]
  }
  
  extension [Self <: CatIndicesRequest](x: Self) {
    
    inline def setBytes(value: Bytes): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setHealth(value: HealthStatus): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    inline def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setPri(value: Boolean): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
    
    inline def setPriUndefined: Self = StObject.set(x, "pri", js.undefined)
  }
}
