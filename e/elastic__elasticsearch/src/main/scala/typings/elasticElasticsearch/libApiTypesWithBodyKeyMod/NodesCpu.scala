package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesCpu extends StObject {
  
  var load_average: js.UndefOr[Record[String, double]] = js.undefined
  
  var percent: js.UndefOr[integer] = js.undefined
  
  var sys: js.UndefOr[Duration] = js.undefined
  
  var sys_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var total: js.UndefOr[Duration] = js.undefined
  
  var total_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var user: js.UndefOr[Duration] = js.undefined
  
  var user_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
}
object NodesCpu {
  
  inline def apply(): NodesCpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesCpu]
  }
  
  extension [Self <: NodesCpu](x: Self) {
    
    inline def setLoad_average(value: Record[String, double]): Self = StObject.set(x, "load_average", value.asInstanceOf[js.Any])
    
    inline def setLoad_averageUndefined: Self = StObject.set(x, "load_average", js.undefined)
    
    inline def setPercent(value: integer): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setSys(value: Duration): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    inline def setSys_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "sys_in_millis", value.asInstanceOf[js.Any])
    
    inline def setSys_in_millisUndefined: Self = StObject.set(x, "sys_in_millis", js.undefined)
    
    inline def setTotal(value: Duration): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotal_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_in_millisUndefined: Self = StObject.set(x, "total_in_millis", js.undefined)
    
    inline def setUser(value: Duration): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUser_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "user_in_millis", value.asInstanceOf[js.Any])
    
    inline def setUser_in_millisUndefined: Self = StObject.set(x, "user_in_millis", js.undefined)
  }
}
