package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.BulkResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@elastic/elasticsearch.@elastic/elasticsearch/lib/api/types.BulkOperationType, @elastic/elasticsearch.@elastic/elasticsearch/lib/api/types.BulkResponseItem>> */
trait PartialRecordBulkOperatio extends StObject {
  
  var create: js.UndefOr[BulkResponseItem] = js.undefined
  
  var delete: js.UndefOr[BulkResponseItem] = js.undefined
  
  var index: js.UndefOr[BulkResponseItem] = js.undefined
  
  var update: js.UndefOr[BulkResponseItem] = js.undefined
}
object PartialRecordBulkOperatio {
  
  inline def apply(): PartialRecordBulkOperatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordBulkOperatio]
  }
  
  extension [Self <: PartialRecordBulkOperatio](x: Self) {
    
    inline def setCreate(value: BulkResponseItem): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: BulkResponseItem): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setIndex(value: BulkResponseItem): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setUpdate(value: BulkResponseItem): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
