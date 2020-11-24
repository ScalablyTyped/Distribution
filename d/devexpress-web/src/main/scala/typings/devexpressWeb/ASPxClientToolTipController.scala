package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ChartToolTipController class.
  */
@js.native
trait ASPxClientToolTipController extends ASPxClientWebChartElement {
  
  /**
    * Gets a value that defines the position of an image within a tooltip.
    */
  var imagePosition: String = js.native
  
  /**
    * Gets a value that defines when tooltips should be invoked.
    */
  var openMode: String = js.native
  
  /**
    * Gets a value indicating whether an image should be shown in tooltips.
    */
  var showImage: Boolean = js.native
  
  /**
    * Gets a value indicating whether it is necessary to show text in tooltips.
    */
  var showText: Boolean = js.native
}
object ASPxClientToolTipController {
  
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    imagePosition: String,
    openMode: String,
    showImage: Boolean,
    showText: Boolean
  ): ASPxClientToolTipController = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], imagePosition = imagePosition.asInstanceOf[js.Any], openMode = openMode.asInstanceOf[js.Any], showImage = showImage.asInstanceOf[js.Any], showText = showText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolTipController]
  }
  
  @scala.inline
  implicit class ASPxClientToolTipControllerOps[Self <: ASPxClientToolTipController] (val x: Self) extends AnyVal {
    
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
    def setImagePosition(value: String): Self = this.set("imagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMode(value: String): Self = this.set("openMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowImage(value: Boolean): Self = this.set("showImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowText(value: Boolean): Self = this.set("showText", value.asInstanceOf[js.Any])
  }
}
