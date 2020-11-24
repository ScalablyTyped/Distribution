package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the selection mode for the Master-Filtering feature.
  */
@JSGlobal("DashboardSelectionMode")
@js.native
class DashboardSelectionMode ()
  extends typings.devexpressWeb.DashboardSelectionMode
/* static members */
@JSGlobal("DashboardSelectionMode")
@js.native
object DashboardSelectionMode extends js.Object {
  
  /**
    * Allows selecting multiple elements within the dashboard item.
    */
  var Multiple: String = js.native
  
  /**
    * The selection is disabled.
    */
  var None: String = js.native
  
  /**
    * Allows selecting a single element within the dashboard item and disallows clearing this selection.
    */
  var Single: String = js.native
}
