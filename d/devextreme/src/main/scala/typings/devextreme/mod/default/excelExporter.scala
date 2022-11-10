package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.excelExporter.CellRange
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportDataGridProps
import typings.devextreme.mod.DevExpress.excelExporter.ExcelExportPivotGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @JSImport("devextreme", "default.excelExporter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportDataGrid(options: ExcelExportDataGridProps): js.Promise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CellRange]]
  
  inline def exportPivotGrid(options: ExcelExportPivotGridProps): js.Promise[CellRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPivotGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CellRange]]
}
