package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.pdfExporter.PdfExportDataGridProps
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfExporter {
  
  @JSImport("devextreme", "default.pdfExporter")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def exportDataGrid(options: PdfExportDataGridProps): Promise[Unit] & JQueryPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportDataGrid")(options.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit] & JQueryPromise[Unit]]
}
