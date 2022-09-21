package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
  */
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to dashboard title options.
    */
  var Options: Any
}
object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  
  inline def apply(Options: Any): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardTitleToolbarUpdatedEventArgs](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
