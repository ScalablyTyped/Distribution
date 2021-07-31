package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
@JSGlobal("ASPxClientDashboardInitializingEventArgs")
@js.native
class ASPxClientDashboardInitializingEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardInitializingEventArgs {
  
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  /* CompleteClass */
  var Dashboard: js.Any = js.native
  
  /**
    * Gets a string value that is the dashboard identifier.
    */
  /* CompleteClass */
  var DashboardId: String = js.native
  
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  /* CompleteClass */
  var Ready: js.Any = js.native
}
