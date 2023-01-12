package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRunningStateSearchInterval extends StObject {
  
  var end: js.UndefOr[Duration] = js.undefined
  
  var end_ms: DurationValue[UnitMillis]
  
  var start: js.UndefOr[Duration] = js.undefined
  
  var start_ms: DurationValue[UnitMillis]
}
object MlRunningStateSearchInterval {
  
  inline def apply(end_ms: DurationValue[UnitMillis], start_ms: DurationValue[UnitMillis]): MlRunningStateSearchInterval = {
    val __obj = js.Dynamic.literal(end_ms = end_ms.asInstanceOf[js.Any], start_ms = start_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRunningStateSearchInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlRunningStateSearchInterval] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Duration): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEnd_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "end_ms", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Duration): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStart_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "start_ms", value.asInstanceOf[js.Any])
  }
}
