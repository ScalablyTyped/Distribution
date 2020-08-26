package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.excelExporter.CellRange
import typings.devextreme.mod.DevExpress.excelExporter.ExportDataGridProps
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "excelExporter")
@js.native
object excelExporter extends js.Object {
  def exportDataGrid(options: ExportDataGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
}

