package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
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
object DashboardSelectionMode {
  
  @JSGlobal("DashboardSelectionMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allows selecting multiple elements within the dashboard item.
    */
  /* static member */
  @JSGlobal("DashboardSelectionMode.Multiple")
  @js.native
  def Multiple: String = js.native
  @scala.inline
  def Multiple_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multiple")(x.asInstanceOf[js.Any])
  
  /**
    * The selection is disabled.
    */
  /* static member */
  @JSGlobal("DashboardSelectionMode.None")
  @js.native
  def None: String = js.native
  @scala.inline
  def None_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**
    * Allows selecting a single element within the dashboard item and disallows clearing this selection.
    */
  /* static member */
  @JSGlobal("DashboardSelectionMode.Single")
  @js.native
  def Single: String = js.native
  @scala.inline
  def Single_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
}
