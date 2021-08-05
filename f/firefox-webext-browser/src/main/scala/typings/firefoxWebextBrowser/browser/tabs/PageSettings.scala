package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the page settings to be used when saving a page as a pdf file. */
trait PageSettings extends StObject {
  
  /** The spacing between the bottom of the footers and the bottom edge of the paper (inches). Default: 0. */
  var edgeBottom: js.UndefOr[Double] = js.undefined
  
  /** The spacing between the left header/footer and the left edge of the paper (inches). Default: 0. */
  var edgeLeft: js.UndefOr[Double] = js.undefined
  
  /** The spacing between the right header/footer and the right edge of the paper (inches). Default: 0. */
  var edgeRight: js.UndefOr[Double] = js.undefined
  
  /** The spacing between the top of the headers and the top edge of the paper (inches). Default: 0 */
  var edgeTop: js.UndefOr[Double] = js.undefined
  
  /** The text for the page's center footer. Default: ''. */
  var footerCenter: js.UndefOr[String] = js.undefined
  
  /** The text for the page's left footer. Default: '&PT'. */
  var footerLeft: js.UndefOr[String] = js.undefined
  
  /** The text for the page's right footer. Default: '&D'. */
  var footerRight: js.UndefOr[String] = js.undefined
  
  /** The text for the page's center header. Default: ''. */
  var headerCenter: js.UndefOr[String] = js.undefined
  
  /** The text for the page's left header. Default: '&T'. */
  var headerLeft: js.UndefOr[String] = js.undefined
  
  /** The text for the page's right header. Default: '&U'. */
  var headerRight: js.UndefOr[String] = js.undefined
  
  /** The margin between the page content and the bottom edge of the paper (inches). Default: 0.5. */
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  /** The margin between the page content and the left edge of the paper (inches). Default: 0.5. */
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  /** The margin between the page content and the right edge of the paper (inches). Default: 0.5. */
  var marginRight: js.UndefOr[Double] = js.undefined
  
  /** The margin between the page content and the top edge of the paper (inches). Default: 0.5. */
  var marginTop: js.UndefOr[Double] = js.undefined
  
  /** The page content orientation: 0 = portrait, 1 = landscape. Default: 0. */
  var orientation: js.UndefOr[Double] = js.undefined
  
  /** The paper height in paper size units. Default: 11.0. */
  var paperHeight: js.UndefOr[Double] = js.undefined
  
  /** The page size unit: 0 = inches, 1 = millimeters. Default: 0. */
  var paperSizeUnit: js.UndefOr[Double] = js.undefined
  
  /** The paper width in paper size units. Default: 8.5. */
  var paperWidth: js.UndefOr[Double] = js.undefined
  
  /** The page content scaling factor: 1.0 = 100% = normal size. Default: 1.0. */
  var scaling: js.UndefOr[Double] = js.undefined
  
  /** Whether the page background colors should be shown. Default: false. */
  var showBackgroundColors: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the page background images should be shown. Default: false. */
  var showBackgroundImages: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the page content should shrink to fit the page width (overrides scaling). Default: true. */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the file. May include optional .pdf extension. */
  var toFileName: js.UndefOr[String] = js.undefined
}
object PageSettings {
  
  inline def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  
  extension [Self <: PageSettings](x: Self) {
    
    inline def setEdgeBottom(value: Double): Self = StObject.set(x, "edgeBottom", value.asInstanceOf[js.Any])
    
    inline def setEdgeBottomUndefined: Self = StObject.set(x, "edgeBottom", js.undefined)
    
    inline def setEdgeLeft(value: Double): Self = StObject.set(x, "edgeLeft", value.asInstanceOf[js.Any])
    
    inline def setEdgeLeftUndefined: Self = StObject.set(x, "edgeLeft", js.undefined)
    
    inline def setEdgeRight(value: Double): Self = StObject.set(x, "edgeRight", value.asInstanceOf[js.Any])
    
    inline def setEdgeRightUndefined: Self = StObject.set(x, "edgeRight", js.undefined)
    
    inline def setEdgeTop(value: Double): Self = StObject.set(x, "edgeTop", value.asInstanceOf[js.Any])
    
    inline def setEdgeTopUndefined: Self = StObject.set(x, "edgeTop", js.undefined)
    
    inline def setFooterCenter(value: String): Self = StObject.set(x, "footerCenter", value.asInstanceOf[js.Any])
    
    inline def setFooterCenterUndefined: Self = StObject.set(x, "footerCenter", js.undefined)
    
    inline def setFooterLeft(value: String): Self = StObject.set(x, "footerLeft", value.asInstanceOf[js.Any])
    
    inline def setFooterLeftUndefined: Self = StObject.set(x, "footerLeft", js.undefined)
    
    inline def setFooterRight(value: String): Self = StObject.set(x, "footerRight", value.asInstanceOf[js.Any])
    
    inline def setFooterRightUndefined: Self = StObject.set(x, "footerRight", js.undefined)
    
    inline def setHeaderCenter(value: String): Self = StObject.set(x, "headerCenter", value.asInstanceOf[js.Any])
    
    inline def setHeaderCenterUndefined: Self = StObject.set(x, "headerCenter", js.undefined)
    
    inline def setHeaderLeft(value: String): Self = StObject.set(x, "headerLeft", value.asInstanceOf[js.Any])
    
    inline def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
    
    inline def setHeaderRight(value: String): Self = StObject.set(x, "headerRight", value.asInstanceOf[js.Any])
    
    inline def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPaperHeight(value: Double): Self = StObject.set(x, "paperHeight", value.asInstanceOf[js.Any])
    
    inline def setPaperHeightUndefined: Self = StObject.set(x, "paperHeight", js.undefined)
    
    inline def setPaperSizeUnit(value: Double): Self = StObject.set(x, "paperSizeUnit", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUnitUndefined: Self = StObject.set(x, "paperSizeUnit", js.undefined)
    
    inline def setPaperWidth(value: Double): Self = StObject.set(x, "paperWidth", value.asInstanceOf[js.Any])
    
    inline def setPaperWidthUndefined: Self = StObject.set(x, "paperWidth", js.undefined)
    
    inline def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setShowBackgroundColors(value: Boolean): Self = StObject.set(x, "showBackgroundColors", value.asInstanceOf[js.Any])
    
    inline def setShowBackgroundColorsUndefined: Self = StObject.set(x, "showBackgroundColors", js.undefined)
    
    inline def setShowBackgroundImages(value: Boolean): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
    
    inline def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    inline def setToFileName(value: String): Self = StObject.set(x, "toFileName", value.asInstanceOf[js.Any])
    
    inline def setToFileNameUndefined: Self = StObject.set(x, "toFileName", js.undefined)
  }
}
