package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelExportFilterStateStatic extends js.Object {
  /**
    * The filter state is placed below in the exported document.
    */
  var below: java.lang.String
  /**
    * The filter state is not included in the exported document.
    */
  var none: java.lang.String
  /**
    * The filter state is placed on a separate sheet in the exported workbook.
    */
  var separatePage: java.lang.String
}

object ExcelExportFilterStateStatic {
  @scala.inline
  def apply(below: java.lang.String, none: java.lang.String, separatePage: java.lang.String): ExcelExportFilterStateStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("below")(below)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("separatePage")(separatePage)
    __obj.asInstanceOf[ExcelExportFilterStateStatic]
  }
}

