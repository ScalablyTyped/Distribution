package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkResponseItem extends StObject {
  
  var _id: js.UndefOr[String | Null] = js.undefined
  
  var _index: String
  
  var _primary_term: js.UndefOr[long] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var _shards: js.UndefOr[ShardStatistics] = js.undefined
  
  var _version: js.UndefOr[VersionNumber] = js.undefined
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var forced_refresh: js.UndefOr[Boolean] = js.undefined
  
  var get: js.UndefOr[InlineGet[Record[String, Any]]] = js.undefined
  
  var result: js.UndefOr[String] = js.undefined
  
  var status: integer
}
object BulkResponseItem {
  
  inline def apply(_index: String, status: integer): BulkResponseItem = {
    val __obj = js.Dynamic.literal(_index = _index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkResponseItem] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setForced_refresh(value: Boolean): Self = StObject.set(x, "forced_refresh", value.asInstanceOf[js.Any])
    
    inline def setForced_refreshUndefined: Self = StObject.set(x, "forced_refresh", js.undefined)
    
    inline def setGet(value: InlineGet[Record[String, Any]]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idNull: Self = StObject.set(x, "_id", null)
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    inline def set_shardsUndefined: Self = StObject.set(x, "_shards", js.undefined)
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
