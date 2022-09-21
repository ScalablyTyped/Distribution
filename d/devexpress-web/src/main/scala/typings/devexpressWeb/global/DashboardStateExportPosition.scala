package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists constants that specify the position of the dashboard state (such as master filter or current parameter values) in the exported document.
  */
@JSGlobal("DashboardStateExportPosition")
@js.native
open class DashboardStateExportPosition ()
  extends StObject
     with typings.devexpressWeb.DashboardStateExportPosition
object DashboardStateExportPosition {
  
  /**
    * The dashboard state is placed below the exported dashboard/dashboard item.
    */
  /* static member */
  @JSGlobal("DashboardStateExportPosition.Below")
  @js.native
  val Below: String = js.native
  
  /**
    * The dashboard state is placed on a separate page.
    */
  /* static member */
  @JSGlobal("DashboardStateExportPosition.SeparatePage")
  @js.native
  val SeparatePage: String = js.native
}
