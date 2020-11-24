package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoBorderDetection extends js.Object {
  
  /**
    * Whether to enable automatic border detection.
    */
  var autoBorderDetection: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable automatic brightness adjustment.
    */
  var autoBright: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable automatic skew correction.
    */
  var autoDeskew: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable automatic blank image detection and removal.
    */
  var autoDiscardBlankPages: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the bit depth.
    */
  var bitDepth: js.UndefOr[Double] = js.native
  
  /**
    * Specify Brightness.
    */
  var brightness: js.UndefOr[Double] = js.native
  
  /**
    * Specify contrast.
    */
  var contrast: js.UndefOr[Double] = js.native
  
  /**
    * "ignore" (default) or "fail".
    */
  var exception: js.UndefOr[String] = js.native
  
  /**
    * Specify a layout to scan, if present, it'll override pageSize.
    */
  var layout: js.UndefOr[Bottom] = js.native
  
  /**
    * Specify how many images are transferred per session.
    */
  var nXferCount: js.UndefOr[Double] = js.native
  
  /**
    * Specify the page size.
    */
  var pageSize: js.UndefOr[EnumDWTCapSupportedSizes | Double] = js.native
  
  /**
    * Specify the pixel flavor.
    */
  var pixelFlavor: js.UndefOr[EnumDWTCapPixelFlavor | Double] = js.native
  
  /**
    * Specify the unit.
    */
  var unit: js.UndefOr[EnumDWTUnitType | Double] = js.native
}
object AutoBorderDetection {
  
  @scala.inline
  def apply(): AutoBorderDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBorderDetection]
  }
  
  @scala.inline
  implicit class AutoBorderDetectionOps[Self <: AutoBorderDetection] (val x: Self) extends AnyVal {
    
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
    def setAutoBorderDetection(value: Boolean): Self = this.set("autoBorderDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBorderDetection: Self = this.set("autoBorderDetection", js.undefined)
    
    @scala.inline
    def setAutoBright(value: Boolean): Self = this.set("autoBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBright: Self = this.set("autoBright", js.undefined)
    
    @scala.inline
    def setAutoDeskew(value: Boolean): Self = this.set("autoDeskew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeskew: Self = this.set("autoDeskew", js.undefined)
    
    @scala.inline
    def setAutoDiscardBlankPages(value: Boolean): Self = this.set("autoDiscardBlankPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDiscardBlankPages: Self = this.set("autoDiscardBlankPages", js.undefined)
    
    @scala.inline
    def setBitDepth(value: Double): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitDepth: Self = this.set("bitDepth", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    
    @scala.inline
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setLayout(value: Bottom): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setNXferCount(value: Double): Self = this.set("nXferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNXferCount: Self = this.set("nXferCount", js.undefined)
    
    @scala.inline
    def setPageSize(value: EnumDWTCapSupportedSizes | Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPixelFlavor(value: EnumDWTCapPixelFlavor | Double): Self = this.set("pixelFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelFlavor: Self = this.set("pixelFlavor", js.undefined)
    
    @scala.inline
    def setUnit(value: EnumDWTUnitType | Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
