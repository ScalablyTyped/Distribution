package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists constants that specify the position of the dashboard state (such as master filter or current parameter values) in the exported document.
  */
@JSGlobal("DashboardStateExportPosition")
@js.native
class DashboardStateExportPosition ()
  extends typings.devexpressWeb.DashboardStateExportPosition
/* static members */
@JSGlobal("DashboardStateExportPosition")
@js.native
object DashboardStateExportPosition extends js.Object {
  
  /**
    * The dashboard state is placed below the exported dashboard/dashboard item.
    */
  val Below: String = js.native
  
  /**
    * The dashboard state is placed on a separate page.
    */
  val SeparatePage: String = js.native
}
