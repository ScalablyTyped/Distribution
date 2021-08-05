package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
trait ASPxClientSelectedTabPageChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the tab page that was selected.
    */
  var PreviousPage: String
  
  /**
    * Gets the tab page that is selected.
    */
  var SelectedPage: String
  
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  var TabContainerName: String
}
object ASPxClientSelectedTabPageChangedEventArgs {
  
  inline def apply(PreviousPage: String, SelectedPage: String, TabContainerName: String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage.asInstanceOf[js.Any], SelectedPage = SelectedPage.asInstanceOf[js.Any], TabContainerName = TabContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
  
  extension [Self <: ASPxClientSelectedTabPageChangedEventArgs](x: Self) {
    
    inline def setPreviousPage(value: String): Self = StObject.set(x, "PreviousPage", value.asInstanceOf[js.Any])
    
    inline def setSelectedPage(value: String): Self = StObject.set(x, "SelectedPage", value.asInstanceOf[js.Any])
    
    inline def setTabContainerName(value: String): Self = StObject.set(x, "TabContainerName", value.asInstanceOf[js.Any])
  }
}
