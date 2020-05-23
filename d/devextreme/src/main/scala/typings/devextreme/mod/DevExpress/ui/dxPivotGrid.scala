package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AlternateDataFields
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGrid extends Widget {
  /** @name dxPivotGrid.bindChart(chart, integrationOptions) */
  def bindChart(chart: String, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: js.Any, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: JQuery, integrationOptions: AlternateDataFields): js.Function with Null = js.native
  /** @name dxPivotGrid.exportToExcel() */
  def exportToExcel(): Unit = js.native
  /** @name dxPivotGrid.getDataSource() */
  def getDataSource(): PivotGridDataSource = js.native
  /** @name dxPivotGrid.getFieldChooserPopup() */
  def getFieldChooserPopup(): dxPopup = js.native
  /** @name dxPivotGrid.updateDimensions() */
  def updateDimensions(): Unit = js.native
}

