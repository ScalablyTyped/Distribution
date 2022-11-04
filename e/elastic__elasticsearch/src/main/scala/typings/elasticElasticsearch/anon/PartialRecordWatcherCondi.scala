package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.FieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@elastic/elasticsearch.@elastic/elasticsearch/lib/api/types.WatcherConditionOp, @elastic/elasticsearch.@elastic/elasticsearch/lib/api/types.FieldValue>> */
trait PartialRecordWatcherCondi extends StObject {
  
  @JSName("eq")
  var eq_FPartialRecordWatcherCondi: js.UndefOr[FieldValue] = js.undefined
  
  var gt: js.UndefOr[FieldValue] = js.undefined
  
  var gte: js.UndefOr[FieldValue] = js.undefined
  
  var lt: js.UndefOr[FieldValue] = js.undefined
  
  var lte: js.UndefOr[FieldValue] = js.undefined
  
  var not_eq: js.UndefOr[FieldValue] = js.undefined
}
object PartialRecordWatcherCondi {
  
  inline def apply(): PartialRecordWatcherCondi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordWatcherCondi]
  }
  
  extension [Self <: PartialRecordWatcherCondi](x: Self) {
    
    inline def setEq_(value: FieldValue): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Null: Self = StObject.set(x, "eq", null)
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setGt(value: FieldValue): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtNull: Self = StObject.set(x, "gt", null)
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: FieldValue): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteNull: Self = StObject.set(x, "gte", null)
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: FieldValue): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtNull: Self = StObject.set(x, "lt", null)
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: FieldValue): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteNull: Self = StObject.set(x, "lte", null)
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    inline def setNot_eq(value: FieldValue): Self = StObject.set(x, "not_eq", value.asInstanceOf[js.Any])
    
    inline def setNot_eqNull: Self = StObject.set(x, "not_eq", null)
    
    inline def setNot_eqUndefined: Self = StObject.set(x, "not_eq", js.undefined)
  }
}
