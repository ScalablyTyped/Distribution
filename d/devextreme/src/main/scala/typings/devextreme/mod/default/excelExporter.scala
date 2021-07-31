package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.excelExporter.CellRange
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportDataGridProps
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportPivotGridProps
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @JSImport("devextreme", "default.excelExporter")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def exportDataGrid(options: ExcelExportDataGridProps): Promise[CellRange] & JQueryPromise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[Promise[CellRange] & JQueryPromise[CellRange]]
  
  @scala.inline
  def exportPivotGrid(options: ExcelExportPivotGridProps): Promise[CellRange] & JQueryPromise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPivotGrid")(options.asInstanceOf[js.Any]).asInstanceOf[Promise[CellRange] & JQueryPromise[CellRange]]
}
