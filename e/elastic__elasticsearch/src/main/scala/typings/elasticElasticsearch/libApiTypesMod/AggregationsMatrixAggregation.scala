package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMatrixAggregation
  extends StObject
     with AggregationsAggregation {
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var missing: js.UndefOr[Record[Field, double]] = js.undefined
}
object AggregationsMatrixAggregation {
  
  inline def apply(): AggregationsMatrixAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsMatrixAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsMatrixAggregation] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMissing(value: Record[Field, double]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
  }
}
