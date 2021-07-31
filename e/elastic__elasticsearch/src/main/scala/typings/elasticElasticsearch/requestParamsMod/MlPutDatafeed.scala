package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutDatafeed[T]
  extends StObject
     with Generic {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var body: T
  
  var datafeed_id: String
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
}
object MlPutDatafeed {
  
  @scala.inline
  def apply[T](body: T, datafeed_id: String): MlPutDatafeed[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDatafeed[T]]
  }
  
  @scala.inline
  implicit class MlPutDatafeedMutableBuilder[Self <: MlPutDatafeed[?], T] (val x: Self & MlPutDatafeed[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeed_id(value: String): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
  }
}
