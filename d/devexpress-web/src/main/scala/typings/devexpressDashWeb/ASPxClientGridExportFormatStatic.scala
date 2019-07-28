package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientGridExportFormatStatic extends js.Object {
  /**
    * Identifies Comma Separated Values format (.csv).
    */
  var Csv: String
  /**
    * Identifies DOCX format (.docx).
    */
  var Docx: String
  /**
    * Identifies Portable Document Format (.pdf).
    */
  var Pdf: String
  /**
    * Identifies Rich Text Format (.rtf).
    */
  var Rtf: String
  /**
    * Identifies Excel Binary File format (.xls).
    */
  var Xls: String
  /**
    * Identifies XML spreadsheet file format (.xlsx).
    */
  var Xlsx: String
}

object ASPxClientGridExportFormatStatic {
  @scala.inline
  def apply(Csv: String, Docx: String, Pdf: String, Rtf: String, Xls: String, Xlsx: String): ASPxClientGridExportFormatStatic = {
    val __obj = js.Dynamic.literal(Csv = Csv, Docx = Docx, Pdf = Pdf, Rtf = Rtf, Xls = Xls, Xlsx = Xlsx)
  
    __obj.asInstanceOf[ASPxClientGridExportFormatStatic]
  }
}

