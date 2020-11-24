package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for `echartsInstance.showLoading` method
  * {@link https://echarts.apache.org/en/api.html#echartsInstance.showLoading}
  */
@js.native
trait EChartsLoadingOption extends js.Object {
  
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Font size.
    * @default 12
    * @since 4.8.0
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Line width of the "spinner".
    * @default 5
    * @since 4.8.0
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[String] = js.native
  
  /**
    * Show an animated "spinner" or not.
    * @default true
    * @since 4.8.0
    */
  var showSpinner: js.UndefOr[Boolean] = js.native
  
  /**
    * Radius of the "spinner".
    * @default 10
    * @since 4.8.0
    */
  var spinnerRadius: js.UndefOr[Double] = js.native
  
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[String] = js.native
  
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object EChartsLoadingOption {
  
  @scala.inline
  def apply(): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsLoadingOption]
  }
  
  @scala.inline
  implicit class EChartsLoadingOptionOps[Self <: EChartsLoadingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = this.set("maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskColor: Self = this.set("maskColor", js.undefined)
    
    @scala.inline
    def setShowSpinner(value: Boolean): Self = this.set("showSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSpinner: Self = this.set("showSpinner", js.undefined)
    
    @scala.inline
    def setSpinnerRadius(value: Double): Self = this.set("spinnerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerRadius: Self = this.set("spinnerRadius", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
}
