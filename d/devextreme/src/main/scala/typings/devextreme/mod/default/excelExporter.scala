package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.excelExporter.CellRange
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportDataGridProps
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportPivotGridProps
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @JSImport("devextreme", "default.excelExporter.exportDataGrid")
  @js.native
  def exportDataGrid(options: ExcelExportDataGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
  
  @JSImport("devextreme", "default.excelExporter.exportPivotGrid")
  @js.native
  def exportPivotGrid(options: ExcelExportPivotGridProps): Promise[CellRange] with JQueryPromise[CellRange] = js.native
}
