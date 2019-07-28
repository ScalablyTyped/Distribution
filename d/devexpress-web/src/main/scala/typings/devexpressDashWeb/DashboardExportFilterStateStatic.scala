package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportFilterStateStatic extends js.Object {
  /**
    * The filter state is placed below the dashboard (dashboard item) in the exported document.
    */
  var Below: String
  /**
    * The filter state is not included in the exported document.
    */
  var None: String
  /**
    * The filter state is placed on a separate page in the exported document.
    */
  var SeparatePage: String
}

object DashboardExportFilterStateStatic {
  @scala.inline
  def apply(Below: String, None: String, SeparatePage: String): DashboardExportFilterStateStatic = {
    val __obj = js.Dynamic.literal(Below = Below, None = None, SeparatePage = SeparatePage)
  
    __obj.asInstanceOf[DashboardExportFilterStateStatic]
  }
}

