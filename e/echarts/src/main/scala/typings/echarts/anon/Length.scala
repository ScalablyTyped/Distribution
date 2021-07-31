package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Show] = js.undefined
  
  /**
    * The length of the first part from visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
  
  /**
    * Whether to show visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object Length {
  
  @scala.inline
  def apply(): Length = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmphasis(value: Show): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
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
  }
}
