package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportExcelFormatStatic extends js.Object {
  /**
    * A comma-separated values (CSV) file format.
    */
  var Csv: String
  /**
    * The Excel 97 - Excel 2003 (XLS) file format.
    */
  var Xls: String
  /**
    * The Office Excel 2007 XML-based (XLSX) file format.
    */
  var Xlsx: String
}

object DashboardExportExcelFormatStatic {
  @scala.inline
  def apply(Csv: String, Xls: String, Xlsx: String): DashboardExportExcelFormatStatic = {
    val __obj = js.Dynamic.literal(Csv = Csv, Xls = Xls, Xlsx = Xlsx)
  
    __obj.asInstanceOf[DashboardExportExcelFormatStatic]
  }
}

