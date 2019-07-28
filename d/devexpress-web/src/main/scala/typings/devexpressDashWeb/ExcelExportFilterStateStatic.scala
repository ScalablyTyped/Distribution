package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelExportFilterStateStatic extends js.Object {
  /**
    * The filter state is placed below in the exported document.
    */
  var below: String
  /**
    * The filter state is not included in the exported document.
    */
  var none: String
  /**
    * The filter state is placed on a separate sheet in the exported workbook.
    */
  var separatePage: String
}

object ExcelExportFilterStateStatic {
  @scala.inline
  def apply(below: String, none: String, separatePage: String): ExcelExportFilterStateStatic = {
    val __obj = js.Dynamic.literal(below = below, none = none, separatePage = separatePage)
  
    __obj.asInstanceOf[ExcelExportFilterStateStatic]
  }
}

