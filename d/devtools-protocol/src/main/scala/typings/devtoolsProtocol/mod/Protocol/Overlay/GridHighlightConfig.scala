package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridHighlightConfig extends js.Object {
  
  /**
    * The named grid areas border color (Default: transparent).
    */
  var areaBorderColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The cell border color (default: transparent). Deprecated, please use rowLineColor and columnLineColor instead.
    */
  var cellBorderColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Whether the cell border is dashed (default: false). Deprecated, please us rowLineDash and columnLineDash instead.
    */
  var cellBorderDash: js.UndefOr[Boolean] = js.native
  
  /**
    * The column gap highlight fill color (default: transparent).
    */
  var columnGapColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The column gap hatching fill color (default: transparent).
    */
  var columnHatchColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The column line color (default: transparent).
    */
  var columnLineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Whether column lines are dashed (default: false).
    */
  var columnLineDash: js.UndefOr[Boolean] = js.native
  
  /**
    * The grid container background color (Default: transparent).
    */
  var gridBackgroundColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The grid container border highlight color (default: transparent).
    */
  var gridBorderColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Whether the grid border is dashed (default: false).
    */
  var gridBorderDash: js.UndefOr[Boolean] = js.native
  
  /**
    * The row gap highlight fill color (default: transparent).
    */
  var rowGapColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The row gap hatching fill color (default: transparent).
    */
  var rowHatchColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The row line color (default: transparent).
    */
  var rowLineColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Whether row lines are dashed (default: false).
    */
  var rowLineDash: js.UndefOr[Boolean] = js.native
  
  /**
    * Show area name labels (default: false).
    */
  var showAreaNames: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the extension lines from grid cells to the rulers should be shown (default: false).
    */
  var showGridExtensionLines: js.UndefOr[Boolean] = js.native
  
  /**
    * Show line name labels (default: false).
    */
  var showLineNames: js.UndefOr[Boolean] = js.native
  
  /**
    * Show Negative line number labels (default: false).
    */
  var showNegativeLineNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Show Positive line number labels (default: false).
    */
  var showPositiveLineNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Show track size labels (default: false).
    */
  var showTrackSizes: js.UndefOr[Boolean] = js.native
}
object GridHighlightConfig {
  
  @scala.inline
  def apply(): GridHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridHighlightConfig]
  }
  
  @scala.inline
  implicit class GridHighlightConfigOps[Self <: GridHighlightConfig] (val x: Self) extends AnyVal {
    
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
    def setAreaBorderColor(value: RGBA): Self = this.set("areaBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaBorderColor: Self = this.set("areaBorderColor", js.undefined)
    
    @scala.inline
    def setCellBorderColor(value: RGBA): Self = this.set("cellBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBorderColor: Self = this.set("cellBorderColor", js.undefined)
    
    @scala.inline
    def setCellBorderDash(value: Boolean): Self = this.set("cellBorderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBorderDash: Self = this.set("cellBorderDash", js.undefined)
    
    @scala.inline
    def setColumnGapColor(value: RGBA): Self = this.set("columnGapColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGapColor: Self = this.set("columnGapColor", js.undefined)
    
    @scala.inline
    def setColumnHatchColor(value: RGBA): Self = this.set("columnHatchColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHatchColor: Self = this.set("columnHatchColor", js.undefined)
    
    @scala.inline
    def setColumnLineColor(value: RGBA): Self = this.set("columnLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLineColor: Self = this.set("columnLineColor", js.undefined)
    
    @scala.inline
    def setColumnLineDash(value: Boolean): Self = this.set("columnLineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLineDash: Self = this.set("columnLineDash", js.undefined)
    
    @scala.inline
    def setGridBackgroundColor(value: RGBA): Self = this.set("gridBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridBackgroundColor: Self = this.set("gridBackgroundColor", js.undefined)
    
    @scala.inline
    def setGridBorderColor(value: RGBA): Self = this.set("gridBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridBorderColor: Self = this.set("gridBorderColor", js.undefined)
    
    @scala.inline
    def setGridBorderDash(value: Boolean): Self = this.set("gridBorderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridBorderDash: Self = this.set("gridBorderDash", js.undefined)
    
    @scala.inline
    def setRowGapColor(value: RGBA): Self = this.set("rowGapColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGapColor: Self = this.set("rowGapColor", js.undefined)
    
    @scala.inline
    def setRowHatchColor(value: RGBA): Self = this.set("rowHatchColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHatchColor: Self = this.set("rowHatchColor", js.undefined)
    
    @scala.inline
    def setRowLineColor(value: RGBA): Self = this.set("rowLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLineColor: Self = this.set("rowLineColor", js.undefined)
    
    @scala.inline
    def setRowLineDash(value: Boolean): Self = this.set("rowLineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLineDash: Self = this.set("rowLineDash", js.undefined)
    
    @scala.inline
    def setShowAreaNames(value: Boolean): Self = this.set("showAreaNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAreaNames: Self = this.set("showAreaNames", js.undefined)
    
    @scala.inline
    def setShowGridExtensionLines(value: Boolean): Self = this.set("showGridExtensionLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridExtensionLines: Self = this.set("showGridExtensionLines", js.undefined)
    
    @scala.inline
    def setShowLineNames(value: Boolean): Self = this.set("showLineNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLineNames: Self = this.set("showLineNames", js.undefined)
    
    @scala.inline
    def setShowNegativeLineNumbers(value: Boolean): Self = this.set("showNegativeLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNegativeLineNumbers: Self = this.set("showNegativeLineNumbers", js.undefined)
    
    @scala.inline
    def setShowPositiveLineNumbers(value: Boolean): Self = this.set("showPositiveLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPositiveLineNumbers: Self = this.set("showPositiveLineNumbers", js.undefined)
    
    @scala.inline
    def setShowTrackSizes(value: Boolean): Self = this.set("showTrackSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTrackSizes: Self = this.set("showTrackSizes", js.undefined)
  }
}
