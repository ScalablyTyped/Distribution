package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteResponseBase extends StObject {
  
  var _id: Id
  
  var _index: IndexName
  
  var _primary_term: long
  
  var _seq_no: SequenceNumber
  
  var _shards: ShardStatistics
  
  var _version: VersionNumber
  
  var forced_refresh: js.UndefOr[Boolean] = js.undefined
  
  var result: Result
}
object WriteResponseBase {
  
  inline def apply(
    _id: Id,
    _index: IndexName,
    _primary_term: long,
    _seq_no: SequenceNumber,
    _shards: ShardStatistics,
    _version: VersionNumber,
    result: Result
  ): WriteResponseBase = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _primary_term = _primary_term.asInstanceOf[js.Any], _seq_no = _seq_no.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResponseBase]
  }
  
  extension [Self <: WriteResponseBase](x: Self) {
    
    inline def setForced_refresh(value: Boolean): Self = StObject.set(x, "forced_refresh", value.asInstanceOf[js.Any])
    
    inline def setForced_refreshUndefined: Self = StObject.set(x, "forced_refresh", js.undefined)
    
    inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
