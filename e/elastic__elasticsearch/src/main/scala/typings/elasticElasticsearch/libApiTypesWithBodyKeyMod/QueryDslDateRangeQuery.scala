package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslDateRangeQuery
  extends StObject
     with QueryDslRangeQueryBase
     with QueryDslRangeQuery {
  
  var format: js.UndefOr[DateFormat] = js.undefined
  
  var from: js.UndefOr[DateMath | Null] = js.undefined
  
  var gt: js.UndefOr[DateMath] = js.undefined
  
  var gte: js.UndefOr[DateMath] = js.undefined
  
  var lt: js.UndefOr[DateMath] = js.undefined
  
  var lte: js.UndefOr[DateMath] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
  
  var to: js.UndefOr[DateMath | Null] = js.undefined
}
object QueryDslDateRangeQuery {
  
  inline def apply(): QueryDslDateRangeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslDateRangeQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslDateRangeQuery] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: DateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrom(value: DateMath): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGt(value: DateMath): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: DateMath): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: DateMath): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: DateMath): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    inline def setTo(value: DateMath): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
