package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexRequest[TDocument]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'document' instead. */
  var body: js.UndefOr[TDocument] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var if_primary_term: js.UndefOr[long] = js.undefined
  
  var if_seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var index: IndexName
  
  var op_type: js.UndefOr[OpType] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
}
object IndexRequest {
  
  inline def apply[TDocument](index: IndexName): IndexRequest[TDocument] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexRequest[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexRequest[?], TDocument] (val x: Self & IndexRequest[TDocument]) extends AnyVal {
    
    inline def setBody(value: TDocument): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIf_primary_term(value: long): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    inline def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    inline def setIf_seq_no(value: SequenceNumber): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    inline def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOp_type(value: OpType): Self = StObject.set(x, "op_type", value.asInstanceOf[js.Any])
    
    inline def setOp_typeUndefined: Self = StObject.set(x, "op_type", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    inline def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
  }
}
