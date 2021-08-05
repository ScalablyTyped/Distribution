package typings.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for `echartsInstance.showLoading` method
  * {@link https://echarts.apache.org/en/api.html#echartsInstance.showLoading}
  */
trait EChartsLoadingOption extends StObject {
  
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Font size.
    * @default 12
    * @since 4.8.0
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Line width of the "spinner".
    * @default 5
    * @since 4.8.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[String] = js.undefined
  
  /**
    * Show an animated "spinner" or not.
    * @default true
    * @since 4.8.0
    */
  var showSpinner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Radius of the "spinner".
    * @default 10
    * @since 4.8.0
    */
  var spinnerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[String] = js.undefined
  
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}
object EChartsLoadingOption {
  
  inline def apply(): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsLoadingOption]
  }
  
  extension [Self <: EChartsLoadingOption](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
    
    inline def setShowSpinnerUndefined: Self = StObject.set(x, "showSpinner", js.undefined)
    
    inline def setSpinnerRadius(value: Double): Self = StObject.set(x, "spinnerRadius", value.asInstanceOf[js.Any])
    
    inline def setSpinnerRadiusUndefined: Self = StObject.set(x, "spinnerRadius", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
    
    inline def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
  }
}
