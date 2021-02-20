package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.create
import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.index
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[T] extends Generic {
  
  var body: T = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var if_primary_term: js.UndefOr[Double] = js.native
  
  var if_seq_no: js.UndefOr[Double] = js.native
  
  var index: String = js.native
  
  var op_type: js.UndefOr[index | create] = js.native
  
  var pipeline: js.UndefOr[String] = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
  
  var require_alias: js.UndefOr[Boolean] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var version_type: js.UndefOr[internal | external | external_gte] = js.native
  
  var wait_for_active_shards: js.UndefOr[String] = js.native
}
object Index {
  
  @scala.inline
  def apply[T](body: T, index: String): Index[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIf_primary_term(value: Double): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    @scala.inline
    def setIf_seq_no(value: Double): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp_type(value: index | create): Self = StObject.set(x, "op_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp_typeUndefined: Self = StObject.set(x, "op_type", js.undefined)
    
    @scala.inline
    def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
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
