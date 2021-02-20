package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoBorderDetection extends StObject {
  
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
  implicit class AutoBorderDetectionMutableBuilder[Self <: AutoBorderDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBorderDetection(value: Boolean): Self = StObject.set(x, "autoBorderDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBorderDetectionUndefined: Self = StObject.set(x, "autoBorderDetection", js.undefined)
    
    @scala.inline
    def setAutoBright(value: Boolean): Self = StObject.set(x, "autoBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBrightUndefined: Self = StObject.set(x, "autoBright", js.undefined)
    
    @scala.inline
    def setAutoDeskew(value: Boolean): Self = StObject.set(x, "autoDeskew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeskewUndefined: Self = StObject.set(x, "autoDeskew", js.undefined)
    
    @scala.inline
    def setAutoDiscardBlankPages(value: Boolean): Self = StObject.set(x, "autoDiscardBlankPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscardBlankPagesUndefined: Self = StObject.set(x, "autoDiscardBlankPages", js.undefined)
    
    @scala.inline
    def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setLayout(value: Bottom): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setNXferCount(value: Double): Self = StObject.set(x, "nXferCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNXferCountUndefined: Self = StObject.set(x, "nXferCount", js.undefined)
    
    @scala.inline
    def setPageSize(value: EnumDWTCapSupportedSizes | Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPixelFlavor(value: EnumDWTCapPixelFlavor | Double): Self = StObject.set(x, "pixelFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelFlavorUndefined: Self = StObject.set(x, "pixelFlavor", js.undefined)
    
    @scala.inline
    def setUnit(value: EnumDWTUnitType | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
