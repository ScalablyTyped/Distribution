package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var conflicts: js.UndefOr[Conflicts] = js.undefined
  
  var dest: ReindexDestination
  
  var max_docs: js.UndefOr[long] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var requests_per_second: js.UndefOr[float] = js.undefined
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var scroll: js.UndefOr[Duration] = js.undefined
  
  var size: js.UndefOr[long] = js.undefined
  
  var slices: js.UndefOr[Slices] = js.undefined
  
  var source: ReindexSource
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object ReindexRequest {
  
  inline def apply(dest: ReindexDestination, source: ReindexSource): ReindexRequest = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRequest]
  }
  
  extension [Self <: ReindexRequest](x: Self) {
    
    inline def setConflicts(value: Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDest(value: ReindexDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setMax_docs(value: long): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRequests_per_second(value: float): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    inline def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    inline def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    inline def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setScroll(value: Duration): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlices(value: Slices): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setSource(value: ReindexSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
