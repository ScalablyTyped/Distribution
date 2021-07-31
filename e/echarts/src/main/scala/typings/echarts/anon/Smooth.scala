package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Smooth extends StObject {
  
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Show] = js.undefined
  
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or
    * the values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.undefined
}
object Smooth {
  
  @scala.inline
  def apply(): Smooth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Smooth]
  }
  
  @scala.inline
  implicit class SmoothMutableBuilder[Self <: Smooth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmphasis(value: Show): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength2(value: Double): Self = StObject.set(x, "length2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength2Undefined: Self = StObject.set(x, "length2", js.undefined)
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
  }
}
