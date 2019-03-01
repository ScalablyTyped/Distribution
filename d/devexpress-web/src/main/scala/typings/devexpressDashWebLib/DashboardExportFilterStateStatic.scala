package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportFilterStateStatic extends js.Object {
  /**
    * The filter state is placed below the dashboard (dashboard item) in the exported document.
    */
  var Below: java.lang.String
  /**
    * The filter state is not included in the exported document.
    */
  var None: java.lang.String
  /**
    * The filter state is placed on a separate page in the exported document.
    */
  var SeparatePage: java.lang.String
}

object DashboardExportFilterStateStatic {
  @scala.inline
  def apply(Below: java.lang.String, None: java.lang.String, SeparatePage: java.lang.String): DashboardExportFilterStateStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Below")(Below)
    __obj.updateDynamic("None")(None)
    __obj.updateDynamic("SeparatePage")(SeparatePage)
    __obj.asInstanceOf[DashboardExportFilterStateStatic]
  }
}

