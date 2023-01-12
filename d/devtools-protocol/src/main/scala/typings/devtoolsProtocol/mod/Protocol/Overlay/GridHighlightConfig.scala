package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridHighlightConfig extends StObject {
  
  /**
    * The named grid areas border color (Default: transparent).
    */
  var areaBorderColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The cell border color (default: transparent). Deprecated, please use rowLineColor and columnLineColor instead.
    */
  var cellBorderColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Whether the cell border is dashed (default: false). Deprecated, please us rowLineDash and columnLineDash instead.
    */
  var cellBorderDash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The column gap highlight fill color (default: transparent).
    */
  var columnGapColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The column gap hatching fill color (default: transparent).
    */
  var columnHatchColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The column line color (default: transparent).
    */
  var columnLineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Whether column lines are dashed (default: false).
    */
  var columnLineDash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The grid container background color (Default: transparent).
    */
  var gridBackgroundColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The grid container border highlight color (default: transparent).
    */
  var gridBorderColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Whether the grid border is dashed (default: false).
    */
  var gridBorderDash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The row gap highlight fill color (default: transparent).
    */
  var rowGapColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The row gap hatching fill color (default: transparent).
    */
  var rowHatchColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * The row line color (default: transparent).
    */
  var rowLineColor: js.UndefOr[RGBA] = js.undefined
  
  /**
    * Whether row lines are dashed (default: false).
    */
  var rowLineDash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show area name labels (default: false).
    */
  var showAreaNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the extension lines from grid cells to the rulers should be shown (default: false).
    */
  var showGridExtensionLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show line name labels (default: false).
    */
  var showLineNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show Negative line number labels (default: false).
    */
  var showNegativeLineNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show Positive line number labels (default: false).
    */
  var showPositiveLineNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show track size labels (default: false).
    */
  var showTrackSizes: js.UndefOr[Boolean] = js.undefined
}
object GridHighlightConfig {
  
  inline def apply(): GridHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setAreaBorderColor(value: RGBA): Self = StObject.set(x, "areaBorderColor", value.asInstanceOf[js.Any])
    
    inline def setAreaBorderColorUndefined: Self = StObject.set(x, "areaBorderColor", js.undefined)
    
    inline def setCellBorderColor(value: RGBA): Self = StObject.set(x, "cellBorderColor", value.asInstanceOf[js.Any])
    
    inline def setCellBorderColorUndefined: Self = StObject.set(x, "cellBorderColor", js.undefined)
    
    inline def setCellBorderDash(value: Boolean): Self = StObject.set(x, "cellBorderDash", value.asInstanceOf[js.Any])
    
    inline def setCellBorderDashUndefined: Self = StObject.set(x, "cellBorderDash", js.undefined)
    
    inline def setColumnGapColor(value: RGBA): Self = StObject.set(x, "columnGapColor", value.asInstanceOf[js.Any])
    
    inline def setColumnGapColorUndefined: Self = StObject.set(x, "columnGapColor", js.undefined)
    
    inline def setColumnHatchColor(value: RGBA): Self = StObject.set(x, "columnHatchColor", value.asInstanceOf[js.Any])
    
    inline def setColumnHatchColorUndefined: Self = StObject.set(x, "columnHatchColor", js.undefined)
    
    inline def setColumnLineColor(value: RGBA): Self = StObject.set(x, "columnLineColor", value.asInstanceOf[js.Any])
    
    inline def setColumnLineColorUndefined: Self = StObject.set(x, "columnLineColor", js.undefined)
    
    inline def setColumnLineDash(value: Boolean): Self = StObject.set(x, "columnLineDash", value.asInstanceOf[js.Any])
    
    inline def setColumnLineDashUndefined: Self = StObject.set(x, "columnLineDash", js.undefined)
    
    inline def setGridBackgroundColor(value: RGBA): Self = StObject.set(x, "gridBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setGridBackgroundColorUndefined: Self = StObject.set(x, "gridBackgroundColor", js.undefined)
    
    inline def setGridBorderColor(value: RGBA): Self = StObject.set(x, "gridBorderColor", value.asInstanceOf[js.Any])
    
    inline def setGridBorderColorUndefined: Self = StObject.set(x, "gridBorderColor", js.undefined)
    
    inline def setGridBorderDash(value: Boolean): Self = StObject.set(x, "gridBorderDash", value.asInstanceOf[js.Any])
    
    inline def setGridBorderDashUndefined: Self = StObject.set(x, "gridBorderDash", js.undefined)
    
    inline def setRowGapColor(value: RGBA): Self = StObject.set(x, "rowGapColor", value.asInstanceOf[js.Any])
    
    inline def setRowGapColorUndefined: Self = StObject.set(x, "rowGapColor", js.undefined)
    
    inline def setRowHatchColor(value: RGBA): Self = StObject.set(x, "rowHatchColor", value.asInstanceOf[js.Any])
    
    inline def setRowHatchColorUndefined: Self = StObject.set(x, "rowHatchColor", js.undefined)
    
    inline def setRowLineColor(value: RGBA): Self = StObject.set(x, "rowLineColor", value.asInstanceOf[js.Any])
    
    inline def setRowLineColorUndefined: Self = StObject.set(x, "rowLineColor", js.undefined)
    
    inline def setRowLineDash(value: Boolean): Self = StObject.set(x, "rowLineDash", value.asInstanceOf[js.Any])
    
    inline def setRowLineDashUndefined: Self = StObject.set(x, "rowLineDash", js.undefined)
    
    inline def setShowAreaNames(value: Boolean): Self = StObject.set(x, "showAreaNames", value.asInstanceOf[js.Any])
    
    inline def setShowAreaNamesUndefined: Self = StObject.set(x, "showAreaNames", js.undefined)
    
    inline def setShowGridExtensionLines(value: Boolean): Self = StObject.set(x, "showGridExtensionLines", value.asInstanceOf[js.Any])
    
    inline def setShowGridExtensionLinesUndefined: Self = StObject.set(x, "showGridExtensionLines", js.undefined)
    
    inline def setShowLineNames(value: Boolean): Self = StObject.set(x, "showLineNames", value.asInstanceOf[js.Any])
    
    inline def setShowLineNamesUndefined: Self = StObject.set(x, "showLineNames", js.undefined)
    
    inline def setShowNegativeLineNumbers(value: Boolean): Self = StObject.set(x, "showNegativeLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowNegativeLineNumbersUndefined: Self = StObject.set(x, "showNegativeLineNumbers", js.undefined)
    
    inline def setShowPositiveLineNumbers(value: Boolean): Self = StObject.set(x, "showPositiveLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowPositiveLineNumbersUndefined: Self = StObject.set(x, "showPositiveLineNumbers", js.undefined)
    
    inline def setShowTrackSizes(value: Boolean): Self = StObject.set(x, "showTrackSizes", value.asInstanceOf[js.Any])
    
    inline def setShowTrackSizesUndefined: Self = StObject.set(x, "showTrackSizes", js.undefined)
  }
}
