package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientTreeListExportFormatStatic extends js.Object {
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

object ASPxClientTreeListExportFormatStatic {
  @scala.inline
  def apply(Docx: String, Pdf: String, Rtf: String, Xls: String, Xlsx: String): ASPxClientTreeListExportFormatStatic = {
    val __obj = js.Dynamic.literal(Docx = Docx, Pdf = Pdf, Rtf = Rtf, Xls = Xls, Xlsx = Xlsx)
  
    __obj.asInstanceOf[ASPxClientTreeListExportFormatStatic]
  }
}

