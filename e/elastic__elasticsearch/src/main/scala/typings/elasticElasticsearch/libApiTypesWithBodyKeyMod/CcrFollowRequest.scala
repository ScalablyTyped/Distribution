package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Leaderindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Leaderindex] = js.undefined
  
  var index: IndexName
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
}
object CcrFollowRequest {
  
  inline def apply(index: IndexName): CcrFollowRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowRequest]
  }
  
  extension [Self <: CcrFollowRequest](x: Self) {
    
    inline def setBody(value: Leaderindex): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
