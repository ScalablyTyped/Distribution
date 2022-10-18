package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Delayeddatacheckconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateDatafeedRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Delayeddatacheckconfig] = js.undefined
  
  var datafeed_id: Id
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
}
object MlUpdateDatafeedRequest {
  
  inline def apply(datafeed_id: Id): MlUpdateDatafeedRequest = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateDatafeedRequest]
  }
  
  extension [Self <: MlUpdateDatafeedRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setBody(value: Delayeddatacheckconfig): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
  }
}
