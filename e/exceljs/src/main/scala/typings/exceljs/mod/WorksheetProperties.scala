package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetProperties extends js.Object {
  /**
  	 * Default column width (optional)
  	 */
  var defaultColWidth: js.UndefOr[Double] = js.native
  /**
  	 * Default row height (default: 15)
  	 */
  var defaultRowHeight: Double = js.native
  /**
  	 * default: 55
  	 */
  var dyDescent: Double = js.native
  /**
  	 * The worksheet column outline level (default: 0)
  	 */
  var outlineLevelCol: Double = js.native
  /**
  	 * The worksheet row outline level (default: 0)
  	 */
  var outlineLevelRow: Double = js.native
  var showGridLines: Boolean = js.native
  /**
  	 * Color of the tab
  	 */
  var tabColor: PartialColor = js.native
}

object WorksheetProperties {
  @scala.inline
  def apply(
    defaultRowHeight: Double,
    dyDescent: Double,
    outlineLevelCol: Double,
    outlineLevelRow: Double,
    showGridLines: Boolean,
    tabColor: PartialColor
  ): WorksheetProperties = {
    val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], dyDescent = dyDescent.asInstanceOf[js.Any], outlineLevelCol = outlineLevelCol.asInstanceOf[js.Any], outlineLevelRow = outlineLevelRow.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], tabColor = tabColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProperties]
  }
  @scala.inline
  implicit class WorksheetPropertiesOps[Self <: WorksheetProperties] (val x: Self) extends AnyVal {
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
    def setDefaultRowHeight(value: Double): Self = this.set("defaultRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDyDescent(value: Double): Self = this.set("dyDescent", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineLevelCol(value: Double): Self = this.set("outlineLevelCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineLevelRow(value: Double): Self = this.set("outlineLevelRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabColor(value: PartialColor): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultColWidth(value: Double): Self = this.set("defaultColWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColWidth: Self = this.set("defaultColWidth", js.undefined)
  }
  
}

