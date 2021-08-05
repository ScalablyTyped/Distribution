package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaColorEmphasis extends StObject {
  
  /**
    * Area filling color.
    *
    *
    * @default
    * "#eee"
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.undefined
  
  /**
    * Map area style in highlighted state.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[AreaColor] = js.undefined
}
object AreaColorEmphasis {
  
  inline def apply(): AreaColorEmphasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaColorEmphasis]
  }
  
  extension [Self <: AreaColorEmphasis](x: Self) {
    
    inline def setAreaColor(value: BorderType): Self = StObject.set(x, "areaColor", value.asInstanceOf[js.Any])
    
    inline def setAreaColorUndefined: Self = StObject.set(x, "areaColor", js.undefined)
    
    inline def setEmphasis(value: AreaColor): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
  }
}
