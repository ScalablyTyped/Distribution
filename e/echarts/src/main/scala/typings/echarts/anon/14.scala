package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setAreaColor(value: BorderType): Self = StObject.set(x, "areaColor", value.asInstanceOf[js.Any])
    
    inline def setAreaColorUndefined: Self = StObject.set(x, "areaColor", js.undefined)
  }
}
