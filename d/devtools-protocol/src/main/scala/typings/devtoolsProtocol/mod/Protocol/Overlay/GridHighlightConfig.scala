package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridHighlightConfig extends js.Object {
  /**
    * The cell border color (default: transparent).
    */
  var cellBorderColor: js.UndefOr[RGBA] = js.native
  /**
    * Whether the cell border is dashed (default: false).
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
    * Whether the extension lines from grid cells to the rulers should be shown (default: false).
    */
  var showGridExtensionLines: js.UndefOr[Boolean] = js.native
  /**
    * Show Negative line number labels (default: false).
    */
  var showNegativeLineNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Show Positive line number labels (default: false).
    */
  var showPositiveLineNumbers: js.UndefOr[Boolean] = js.native
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
    def setShowGridExtensionLines(value: Boolean): Self = this.set("showGridExtensionLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridExtensionLines: Self = this.set("showGridExtensionLines", js.undefined)
    @scala.inline
    def setShowNegativeLineNumbers(value: Boolean): Self = this.set("showNegativeLineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNegativeLineNumbers: Self = this.set("showNegativeLineNumbers", js.undefined)
    @scala.inline
    def setShowPositiveLineNumbers(value: Boolean): Self = this.set("showPositiveLineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPositiveLineNumbers: Self = this.set("showPositiveLineNumbers", js.undefined)
  }
  
}

