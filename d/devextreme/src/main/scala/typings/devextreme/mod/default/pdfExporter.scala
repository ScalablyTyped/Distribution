package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.pdfExporter.PdfExportDataGridProps
import typings.devextreme.mod.DevExpress.pdfExporter.PdfExportGanttProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  @JSImport("devextreme", "default.pdfExporter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def exportDataGrid(options: PdfExportDataGridProps): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def exportGantt(options: PdfExportGanttProps): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportGantt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
