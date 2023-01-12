package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUpdateWriteResponseBase[TDocument]
  extends StObject
     with WriteResponseBase {
  
  var get: js.UndefOr[InlineGet[TDocument]] = js.undefined
}
object UpdateUpdateWriteResponseBase {
  
  inline def apply[TDocument](
    _id: Id,
    _index: IndexName,
    _primary_term: long,
    _seq_no: SequenceNumber,
    _shards: ShardStatistics,
    _version: VersionNumber,
    result: Result
  ): UpdateUpdateWriteResponseBase[TDocument] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _primary_term = _primary_term.asInstanceOf[js.Any], _seq_no = _seq_no.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUpdateWriteResponseBase[TDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUpdateWriteResponseBase[?], TDocument] (val x: Self & UpdateUpdateWriteResponseBase[TDocument]) extends AnyVal {
    
    inline def setGet(value: InlineGet[TDocument]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
  }
}
