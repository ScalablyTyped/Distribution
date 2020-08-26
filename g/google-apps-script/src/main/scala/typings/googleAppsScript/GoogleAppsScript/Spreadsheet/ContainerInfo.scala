package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access the chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function.
  *
  *     chart = chart.modify().setPosition(5, 5, 0, 0).build();
  *     sheet.updateChart(chart);
  */
@js.native
trait ContainerInfo extends js.Object {
  def getAnchorColumn(): Integer = js.native
  def getAnchorRow(): Integer = js.native
  def getOffsetX(): Integer = js.native
  def getOffsetY(): Integer = js.native
}

object ContainerInfo {
  @scala.inline
  def apply(
    getAnchorColumn: () => Integer,
    getAnchorRow: () => Integer,
    getOffsetX: () => Integer,
    getOffsetY: () => Integer
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(getAnchorColumn = js.Any.fromFunction0(getAnchorColumn), getAnchorRow = js.Any.fromFunction0(getAnchorRow), getOffsetX = js.Any.fromFunction0(getOffsetX), getOffsetY = js.Any.fromFunction0(getOffsetY))
    __obj.asInstanceOf[ContainerInfo]
  }
  @scala.inline
  implicit class ContainerInfoOps[Self <: ContainerInfo] (val x: Self) extends AnyVal {
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
    def setGetAnchorColumn(value: () => Integer): Self = this.set("getAnchorColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAnchorRow(value: () => Integer): Self = this.set("getAnchorRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffsetX(value: () => Integer): Self = this.set("getOffsetX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffsetY(value: () => Integer): Self = this.set("getOffsetY", js.Any.fromFunction0(value))
  }
  
}

