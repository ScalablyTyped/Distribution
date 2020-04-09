package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAlternateDataFields
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGrid extends Widget {
  /** @name dxPivotGrid.bindChart(chart, integrationOptions) */
  def bindChart(chart: String, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: js.Any, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  def bindChart(chart: JQuery, integrationOptions: AnonAlternateDataFields): js.Function with Null = js.native
  /** @name dxPivotGrid.exportToExcel() */
  def exportToExcel(): Unit = js.native
  /** @name dxPivotGrid.getDataSource() */
  def getDataSource(): PivotGridDataSource = js.native
  /** @name dxPivotGrid.getFieldChooserPopup() */
  def getFieldChooserPopup(): dxPopup = js.native
  /** @name dxPivotGrid.updateDimensions() */
  def updateDimensions(): Unit = js.native
}

