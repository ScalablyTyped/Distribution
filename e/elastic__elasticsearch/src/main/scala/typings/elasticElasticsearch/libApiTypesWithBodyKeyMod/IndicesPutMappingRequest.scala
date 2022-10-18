package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Datedetection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutMappingRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Datedetection] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: Indices
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var write_index_only: js.UndefOr[Boolean] = js.undefined
}
object IndicesPutMappingRequest {
  
  inline def apply(index: Indices): IndicesPutMappingRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutMappingRequest]
  }
  
  extension [Self <: IndicesPutMappingRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setBody(value: Datedetection): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWrite_index_only(value: Boolean): Self = StObject.set(x, "write_index_only", value.asInstanceOf[js.Any])
    
    inline def setWrite_index_onlyUndefined: Self = StObject.set(x, "write_index_only", js.undefined)
  }
}
