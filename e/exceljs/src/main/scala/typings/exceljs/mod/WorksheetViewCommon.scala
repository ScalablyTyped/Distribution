package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetViewCommon extends js.Object {
  /**
  	 * The currently selected cell
  	 */
  var activeCell: String = js.native
  /**
  	 * Sets the worksheet view's orientation to right-to-left, `false` by default
  	 */
  var rightToLeft: Boolean = js.native
  /**
  	 * Shows or hides the gridlines (shown for cells where borders have not been defined),
  	 * `true` by default
  	 */
  var showGridLines: Boolean = js.native
  /**
  	 * Shows or hides the row and column headers (e.g. A1, B1 at the top and 1,2,3 on the left,
  	 * `true` by default
  	 */
  var showRowColHeaders: Boolean = js.native
  /**
  	 * Shows or hides the ruler in Page Layout, `true` by default
  	 */
  var showRuler: Boolean = js.native
  /**
  	 * 	Percentage zoom to use for the view, `100` by default
  	 */
  var zoomScale: Double = js.native
  /**
  	 * 	Normal zoom for the view, `100` by default
  	 */
  var zoomScaleNormal: Double = js.native
}

object WorksheetViewCommon {
  @scala.inline
  def apply(
    activeCell: String,
    rightToLeft: Boolean,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    showRuler: Boolean,
    zoomScale: Double,
    zoomScaleNormal: Double
  ): WorksheetViewCommon = {
    val __obj = js.Dynamic.literal(activeCell = activeCell.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], showRuler = showRuler.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any], zoomScaleNormal = zoomScaleNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewCommon]
  }
  @scala.inline
  implicit class WorksheetViewCommonOps[Self <: WorksheetViewCommon] (val x: Self) extends AnyVal {
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
    def setActiveCell(value: String): Self = this.set("activeCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRowColHeaders(value: Boolean): Self = this.set("showRowColHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRuler(value: Boolean): Self = this.set("showRuler", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomScaleNormal(value: Double): Self = this.set("zoomScaleNormal", value.asInstanceOf[js.Any])
  }
  
}

