package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists constants that specify the position of the dashboard state (such as master filter or current parameter values) in the exported Excel document.
  */
@JSGlobal("DashboardStateExcelExportPosition")
@js.native
class DashboardStateExcelExportPosition () extends js.Object

/* static members */
@JSGlobal("DashboardStateExcelExportPosition")
@js.native
object DashboardStateExcelExportPosition extends js.Object {
  /**
    * The dashboard state is placed below the exported data.
    */
  val Below: String = js.native
  /**
    * The dashboard state is placed on a separate sheet.
    */
  val SeparateSheet: String = js.native
}

