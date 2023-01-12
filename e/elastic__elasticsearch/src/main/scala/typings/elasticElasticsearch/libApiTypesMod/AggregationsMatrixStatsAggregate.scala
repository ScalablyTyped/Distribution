package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMatrixStatsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var doc_count: long
  
  var fields: js.Array[AggregationsMatrixStatsFields]
}
object AggregationsMatrixStatsAggregate {
  
  inline def apply(doc_count: long, fields: js.Array[AggregationsMatrixStatsFields]): AggregationsMatrixStatsAggregate = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMatrixStatsAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMatrixStatsAggregate] (val x: Self) extends AnyVal {
    
    inline def setDoc_count(value: long): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[AggregationsMatrixStatsFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: AggregationsMatrixStatsFields*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
