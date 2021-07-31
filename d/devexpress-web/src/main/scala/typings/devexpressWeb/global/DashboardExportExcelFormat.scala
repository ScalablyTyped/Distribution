package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify Excel formats available for exporting individual dashboard items.
  */
@JSGlobal("DashboardExportExcelFormat")
@js.native
class DashboardExportExcelFormat ()
  extends StObject
     with typings.devexpressWeb.DashboardExportExcelFormat
object DashboardExportExcelFormat {
  
  /**
    * A comma-separated values (CSV) file format.
    */
  /* static member */
  @JSGlobal("DashboardExportExcelFormat.Csv")
  @js.native
  val Csv: String = js.native
  
  /**
    * The Excel 97 - Excel 2003 (XLS) file format.
    */
  /* static member */
  @JSGlobal("DashboardExportExcelFormat.Xls")
  @js.native
  val Xls: String = js.native
  
  /**
    * The Office Excel 2007 XML-based (XLSX) file format.
    */
  /* static member */
  @JSGlobal("DashboardExportExcelFormat.Xlsx")
  @js.native
  val Xlsx: String = js.native
}
