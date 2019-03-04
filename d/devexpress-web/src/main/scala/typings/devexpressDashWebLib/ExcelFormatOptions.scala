package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options which define how the dashboard item is exported to Excel format.
  */
trait ExcelFormatOptions extends js.Object {
  /**
    * Gets or sets a character used to separate values in a CSV document.
    * Value: A string value that specifies the character used to separate values in a CSV document.
    */
  var CsvValueSeparator: java.lang.String
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    * Value: A value returned by the DashboardExportExcelFormat class that specifies the Excel format in which the dashboard item is exported.
    */
  var Format: java.lang.String
}

object ExcelFormatOptions {
  @scala.inline
  def apply(CsvValueSeparator: java.lang.String, Format: java.lang.String): ExcelFormatOptions = {
    val __obj = js.Dynamic.literal(CsvValueSeparator = CsvValueSeparator, Format = Format)
  
    __obj.asInstanceOf[ExcelFormatOptions]
  }
}

