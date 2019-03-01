package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientTreeListExportFormatStatic extends js.Object {
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

object ASPxClientTreeListExportFormatStatic {
  @scala.inline
  def apply(
    Docx: java.lang.String,
    Pdf: java.lang.String,
    Rtf: java.lang.String,
    Xls: java.lang.String,
    Xlsx: java.lang.String
  ): ASPxClientTreeListExportFormatStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Docx")(Docx)
    __obj.updateDynamic("Pdf")(Pdf)
    __obj.updateDynamic("Rtf")(Rtf)
    __obj.updateDynamic("Xls")(Xls)
    __obj.updateDynamic("Xlsx")(Xlsx)
    __obj.asInstanceOf[ASPxClientTreeListExportFormatStatic]
  }
}

