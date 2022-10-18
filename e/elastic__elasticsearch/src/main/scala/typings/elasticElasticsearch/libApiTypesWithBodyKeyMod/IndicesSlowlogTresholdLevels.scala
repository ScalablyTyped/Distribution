package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSlowlogTresholdLevels extends StObject {
  
  var debug: js.UndefOr[Duration] = js.undefined
  
  var info: js.UndefOr[Duration] = js.undefined
  
  var trace: js.UndefOr[Duration] = js.undefined
  
  var warn: js.UndefOr[Duration] = js.undefined
}
object IndicesSlowlogTresholdLevels {
  
  inline def apply(): IndicesSlowlogTresholdLevels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSlowlogTresholdLevels]
  }
  
  extension [Self <: IndicesSlowlogTresholdLevels](x: Self) {
    
    inline def setDebug(value: Duration): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setInfo(value: Duration): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setTrace(value: Duration): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setWarn(value: Duration): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
