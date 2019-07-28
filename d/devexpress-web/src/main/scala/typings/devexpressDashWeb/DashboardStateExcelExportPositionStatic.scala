package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardStateExcelExportPositionStatic extends js.Object {
  /**
    * The dashboard state is placed below the exported data.
    */
  var Below: String
  /**
    * The dashboard state is placed on a separate sheet.
    */
  var SeparateSheet: String
}

object DashboardStateExcelExportPositionStatic {
  @scala.inline
  def apply(Below: String, SeparateSheet: String): DashboardStateExcelExportPositionStatic = {
    val __obj = js.Dynamic.literal(Below = Below, SeparateSheet = SeparateSheet)
  
    __obj.asInstanceOf[DashboardStateExcelExportPositionStatic]
  }
}

