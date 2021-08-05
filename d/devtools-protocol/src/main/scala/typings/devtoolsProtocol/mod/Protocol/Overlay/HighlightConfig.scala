package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightConfig extends StObject {
  
  /**
    * The border highlight fill color (default: transparent).
    */
  var borderColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The color format used to format color styles (default: hex).
    */
  var colorFormat: js.UndefOr[ColorFormat] = js.undefined
  
  /**
    * The content box highlight fill color (default: transparent).
    */
  var contentColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The grid layout color (default: transparent).
    */
  var cssGridColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The event target element highlight fill color (default: transparent).
    */
  var eventTargetColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The grid layout highlight configuration (default: all transparent).
    */
  var gridHighlightConfig: js.UndefOr[GridHighlightConfig] = js.undefined
  
  /**
    * The margin highlight fill color (default: transparent).
    */
  var marginColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The padding highlight fill color (default: transparent).
    */
  var paddingColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The shape outside fill color (default: transparent).
    */
  var shapeColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The shape margin fill color (default: transparent).
    */
  var shapeMarginColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Whether the a11y info should be shown (default: true).
    */
  var showAccessibilityInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the extension lines from node to the rulers should be shown (default: false).
    */
  var showExtensionLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the node info tooltip should be shown (default: false).
    */
  var showInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the rulers should be shown (default: false).
    */
  var showRulers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the node styles in the tooltip (default: false).
    */
  var showStyles: js.UndefOr[Boolean] = js.undefined
}
object HighlightConfig {
  
  inline def apply(): HighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightConfig]
  }
  
  extension [Self <: HighlightConfig](x: Self) {
    
    inline def setBorderColor(value: RGBA): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColorFormat(value: ColorFormat): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    inline def setColorFormatUndefined: Self = StObject.set(x, "colorFormat", js.undefined)
    
    inline def setContentColor(value: RGBA): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
    
    inline def setContentColorUndefined: Self = StObject.set(x, "contentColor", js.undefined)
    
    inline def setCssGridColor(value: RGBA): Self = StObject.set(x, "cssGridColor", value.asInstanceOf[js.Any])
    
    inline def setCssGridColorUndefined: Self = StObject.set(x, "cssGridColor", js.undefined)
    
    inline def setEventTargetColor(value: RGBA): Self = StObject.set(x, "eventTargetColor", value.asInstanceOf[js.Any])
    
    inline def setEventTargetColorUndefined: Self = StObject.set(x, "eventTargetColor", js.undefined)
    
    inline def setGridHighlightConfig(value: GridHighlightConfig): Self = StObject.set(x, "gridHighlightConfig", value.asInstanceOf[js.Any])
    
    inline def setGridHighlightConfigUndefined: Self = StObject.set(x, "gridHighlightConfig", js.undefined)
    
    inline def setMarginColor(value: RGBA): Self = StObject.set(x, "marginColor", value.asInstanceOf[js.Any])
    
    inline def setMarginColorUndefined: Self = StObject.set(x, "marginColor", js.undefined)
    
    inline def setPaddingColor(value: RGBA): Self = StObject.set(x, "paddingColor", value.asInstanceOf[js.Any])
    
    inline def setPaddingColorUndefined: Self = StObject.set(x, "paddingColor", js.undefined)
    
    inline def setShapeColor(value: RGBA): Self = StObject.set(x, "shapeColor", value.asInstanceOf[js.Any])
    
    inline def setShapeColorUndefined: Self = StObject.set(x, "shapeColor", js.undefined)
    
    inline def setShapeMarginColor(value: RGBA): Self = StObject.set(x, "shapeMarginColor", value.asInstanceOf[js.Any])
    
    inline def setShapeMarginColorUndefined: Self = StObject.set(x, "shapeMarginColor", js.undefined)
    
    inline def setShowAccessibilityInfo(value: Boolean): Self = StObject.set(x, "showAccessibilityInfo", value.asInstanceOf[js.Any])
    
    inline def setShowAccessibilityInfoUndefined: Self = StObject.set(x, "showAccessibilityInfo", js.undefined)
    
    inline def setShowExtensionLines(value: Boolean): Self = StObject.set(x, "showExtensionLines", value.asInstanceOf[js.Any])
    
    inline def setShowExtensionLinesUndefined: Self = StObject.set(x, "showExtensionLines", js.undefined)
    
    inline def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    inline def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
    
    inline def setShowRulers(value: Boolean): Self = StObject.set(x, "showRulers", value.asInstanceOf[js.Any])
    
    inline def setShowRulersUndefined: Self = StObject.set(x, "showRulers", js.undefined)
    
    inline def setShowStyles(value: Boolean): Self = StObject.set(x, "showStyles", value.asInstanceOf[js.Any])
    
    inline def setShowStylesUndefined: Self = StObject.set(x, "showStyles", js.undefined)
  }
}
