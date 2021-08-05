package typings.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartsOptionConfig extends StObject {
  
  var lazyUpdate: js.UndefOr[Boolean] = js.undefined
  
  var notMerge: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object EChartsOptionConfig {
  
  inline def apply(): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsOptionConfig]
  }
  
  extension [Self <: EChartsOptionConfig](x: Self) {
    
    inline def setLazyUpdate(value: Boolean): Self = StObject.set(x, "lazyUpdate", value.asInstanceOf[js.Any])
    
    inline def setLazyUpdateUndefined: Self = StObject.set(x, "lazyUpdate", js.undefined)
    
    inline def setNotMerge(value: Boolean): Self = StObject.set(x, "notMerge", value.asInstanceOf[js.Any])
    
    inline def setNotMergeUndefined: Self = StObject.set(x, "notMerge", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
