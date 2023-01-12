package typings.dwt.anon

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapPixelFlavor
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTUnitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoBorderDetection extends StObject {
  
  /**
    * Whether to enable automatic border detection.
    */
  var autoBorderDetection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable automatic brightness adjustment.
    */
  var autoBright: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable automatic skew correction.
    */
  var autoDeskew: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable automatic blank image detection and removal.
    */
  var autoDiscardBlankPages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the bit depth.
    */
  var bitDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify Brightness.
    */
  var brightness: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify contrast.
    */
  var contrast: js.UndefOr[Double] = js.undefined
  
  /**
    * "ignore" (default) or "fail".
    */
  var exception: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a layout to scan, if present, it'll override pageSize.
    */
  var layout: js.UndefOr[Bottom] = js.undefined
  
  /**
    * Specify how many images are transferred per session.
    */
  var nXferCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the page size.
    */
  var pageSize: js.UndefOr[EnumDWTCapSupportedSizes | Double] = js.undefined
  
  /**
    * Specify the pixel flavor.
    */
  var pixelFlavor: js.UndefOr[EnumDWTCapPixelFlavor | Double] = js.undefined
  
  /**
    * Specify the unit.
    */
  var unit: js.UndefOr[EnumDWTUnitType | Double] = js.undefined
}
object AutoBorderDetection {
  
  inline def apply(): AutoBorderDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBorderDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoBorderDetection] (val x: Self) extends AnyVal {
    
    inline def setAutoBorderDetection(value: Boolean): Self = StObject.set(x, "autoBorderDetection", value.asInstanceOf[js.Any])
    
    inline def setAutoBorderDetectionUndefined: Self = StObject.set(x, "autoBorderDetection", js.undefined)
    
    inline def setAutoBright(value: Boolean): Self = StObject.set(x, "autoBright", value.asInstanceOf[js.Any])
    
    inline def setAutoBrightUndefined: Self = StObject.set(x, "autoBright", js.undefined)
    
    inline def setAutoDeskew(value: Boolean): Self = StObject.set(x, "autoDeskew", value.asInstanceOf[js.Any])
    
    inline def setAutoDeskewUndefined: Self = StObject.set(x, "autoDeskew", js.undefined)
    
    inline def setAutoDiscardBlankPages(value: Boolean): Self = StObject.set(x, "autoDiscardBlankPages", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscardBlankPagesUndefined: Self = StObject.set(x, "autoDiscardBlankPages", js.undefined)
    
    inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
    
    inline def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setLayout(value: Bottom): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setNXferCount(value: Double): Self = StObject.set(x, "nXferCount", value.asInstanceOf[js.Any])
    
    inline def setNXferCountUndefined: Self = StObject.set(x, "nXferCount", js.undefined)
    
    inline def setPageSize(value: EnumDWTCapSupportedSizes | Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPixelFlavor(value: EnumDWTCapPixelFlavor | Double): Self = StObject.set(x, "pixelFlavor", value.asInstanceOf[js.Any])
    
    inline def setPixelFlavorUndefined: Self = StObject.set(x, "pixelFlavor", js.undefined)
    
    inline def setUnit(value: EnumDWTUnitType | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
