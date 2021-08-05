package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthLineStyle extends StObject {
  
  /**
    * The length of split line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 30
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  
  /**
    * Whether to show the split line.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object LengthLineStyle {
  
  inline def apply(): LengthLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthLineStyle]
  }
  
  extension [Self <: LengthLineStyle](x: Self) {
    
    inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
