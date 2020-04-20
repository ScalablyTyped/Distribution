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
trait ContainerInfo extends js.Object {
  def getAnchorColumn(): Integer
  def getAnchorRow(): Integer
  def getOffsetX(): Integer
  def getOffsetY(): Integer
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
}

