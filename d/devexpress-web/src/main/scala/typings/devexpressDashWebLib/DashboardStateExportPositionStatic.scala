package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardStateExportPositionStatic extends js.Object {
  /**
    * The dashboard state is placed below the exported dashboard/dashboard item.
    */
  var Below: java.lang.String
  /**
    * The dashboard state is placed on a separate page.
    */
  var SeparatePage: java.lang.String
}

object DashboardStateExportPositionStatic {
  @scala.inline
  def apply(Below: java.lang.String, SeparatePage: java.lang.String): DashboardStateExportPositionStatic = {
    val __obj = js.Dynamic.literal(Below = Below, SeparatePage = SeparatePage)
  
    __obj.asInstanceOf[DashboardStateExportPositionStatic]
  }
}

