package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientGridExportFormatStatic extends js.Object {
  /**
    * Identifies Comma Separated Values format (.csv).
    */
  var Csv: java.lang.String
  /**
    * Identifies DOCX format (.docx).
    */
  var Docx: java.lang.String
  /**
    * Identifies Portable Document Format (.pdf).
    */
  var Pdf: java.lang.String
  /**
    * Identifies Rich Text Format (.rtf).
    */
  var Rtf: java.lang.String
  /**
    * Identifies Excel Binary File format (.xls).
    */
  var Xls: java.lang.String
  /**
    * Identifies XML spreadsheet file format (.xlsx).
    */
  var Xlsx: java.lang.String
}

object ASPxClientGridExportFormatStatic {
  @scala.inline
  def apply(
    Csv: java.lang.String,
    Docx: java.lang.String,
    Pdf: java.lang.String,
    Rtf: java.lang.String,
    Xls: java.lang.String,
    Xlsx: java.lang.String
  ): ASPxClientGridExportFormatStatic = {
    val __obj = js.Dynamic.literal(Csv = Csv, Docx = Docx, Pdf = Pdf, Rtf = Rtf, Xls = Xls, Xlsx = Xlsx)
  
    __obj.asInstanceOf[ASPxClientGridExportFormatStatic]
  }
}

