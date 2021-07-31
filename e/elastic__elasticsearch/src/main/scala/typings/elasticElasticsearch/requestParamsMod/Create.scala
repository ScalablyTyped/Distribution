package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var id: String
  
  var index: String
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var version_type: js.UndefOr[internal | external | external_gte] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}
object Create {
  
  @scala.inline
  def apply[T](body: T, id: String, index: String): Create[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create[T]]
  }
  
  @scala.inline
  implicit class CreateMutableBuilder[Self <: Create[?], T] (val x: Self & Create[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersion_type(value: internal | external | external_gte): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
