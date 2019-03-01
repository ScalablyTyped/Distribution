package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportExcelFormatStatic extends js.Object {
  /**
    * A comma-separated values (CSV) file format.
    */
  var Csv: java.lang.String
  /**
    * The Excel 97 - Excel 2003 (XLS) file format.
    */
  var Xls: java.lang.String
  /**
    * The Office Excel 2007 XML-based (XLSX) file format.
    */
  var Xlsx: java.lang.String
}

object DashboardExportExcelFormatStatic {
  @scala.inline
  def apply(Csv: java.lang.String, Xls: java.lang.String, Xlsx: java.lang.String): DashboardExportExcelFormatStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Csv")(Csv)
    __obj.updateDynamic("Xls")(Xls)
    __obj.updateDynamic("Xlsx")(Xlsx)
    __obj.asInstanceOf[DashboardExportExcelFormatStatic]
  }
}

