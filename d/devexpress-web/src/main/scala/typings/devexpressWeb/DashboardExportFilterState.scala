package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists constants used to identify the filter state&amp;#39;s location on the exported document.
  */
@JSGlobal("DashboardExportFilterState")
@js.native
class DashboardExportFilterState () extends js.Object

/* static members */
@JSGlobal("DashboardExportFilterState")
@js.native
object DashboardExportFilterState extends js.Object {
  /**
    * The filter state is placed below the dashboard (dashboard item) in the exported document.
    */
  val Below: String = js.native
  /**
    * The filter state is not included in the exported document.
    */
  val None: String = js.native
  /**
    * The filter state is placed on a separate page in the exported document.
    */
  val SeparatePage: String = js.native
}

