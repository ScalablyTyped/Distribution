package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardStateExcelExportPositionStatic extends js.Object {
  /**
    * The dashboard state is placed below the exported data.
    */
  var Below: java.lang.String
  /**
    * The dashboard state is placed on a separate sheet.
    */
  var SeparateSheet: java.lang.String
}

object DashboardStateExcelExportPositionStatic {
  @scala.inline
  def apply(Below: java.lang.String, SeparateSheet: java.lang.String): DashboardStateExcelExportPositionStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Below")(Below)
    __obj.updateDynamic("SeparateSheet")(SeparateSheet)
    __obj.asInstanceOf[DashboardStateExcelExportPositionStatic]
  }
}

