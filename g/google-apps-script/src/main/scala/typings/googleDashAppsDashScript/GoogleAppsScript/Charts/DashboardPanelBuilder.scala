package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardPanelBuilder extends js.Object {
  def bind(control: Control, chart: Chart, controls: js.Array[Control], charts: js.Array[Chart]): DashboardPanelBuilder = js.native
  def build(): DashboardPanel = js.native
  def setDataTable(source: DataTableSource): DashboardPanelBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): DashboardPanelBuilder = js.native
}

