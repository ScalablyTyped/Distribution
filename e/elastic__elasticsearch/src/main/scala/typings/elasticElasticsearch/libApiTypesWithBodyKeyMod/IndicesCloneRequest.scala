package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCloneRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Settings] = js.undefined
  
  var index: IndexName
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var target: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
}
object IndicesCloneRequest {
  
  inline def apply(index: IndexName, target: Name): IndicesCloneRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCloneRequest]
  }
  
  extension [Self <: IndicesCloneRequest](x: Self) {
    
    inline def setBody(value: Settings): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTarget(value: Name): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
