package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
@JSGlobal("ASPxClientSelectedTabPageChangedEventArgs")
@js.native
class ASPxClientSelectedTabPageChangedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSelectedTabPageChangedEventArgs {
  
  /**
    * Gets the tab page that was selected.
    */
  /* CompleteClass */
  var PreviousPage: String = js.native
  
  /**
    * Gets the tab page that is selected.
    */
  /* CompleteClass */
  var SelectedPage: String = js.native
  
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  /* CompleteClass */
  var TabContainerName: String = js.native
}
