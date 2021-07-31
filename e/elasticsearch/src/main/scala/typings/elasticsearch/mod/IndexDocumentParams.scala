package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.create
import typings.elasticsearch.elasticsearchStrings.index
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDocumentParams[T]
  extends StObject
     with GenericParams {
  
  @JSName("body")
  var body_IndexDocumentParams: T
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: String
  
  var opType: js.UndefOr[index | create] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var timestamp: js.UndefOr[Date | Double] = js.undefined
  
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  
  var `type`: String
  
  var version: js.UndefOr[Double] = js.undefined
  
  var versionType: js.UndefOr[VersionType] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}
object IndexDocumentParams {
  
  @scala.inline
  def apply[T](body: T, index: String, `type`: String): IndexDocumentParams[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocumentParams[T]]
  }
  
  @scala.inline
  implicit class IndexDocumentParamsMutableBuilder[Self <: IndexDocumentParams[?], T] (val x: Self & IndexDocumentParams[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpType(value: index | create): Self = StObject.set(x, "opType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpTypeUndefined: Self = StObject.set(x, "opType", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTtl(value: TimeSpan): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: VersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTypeUndefined: Self = StObject.set(x, "versionType", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
