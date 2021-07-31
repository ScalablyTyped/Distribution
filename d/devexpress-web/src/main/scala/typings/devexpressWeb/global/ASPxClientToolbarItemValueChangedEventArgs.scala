package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@JSGlobal("ASPxClientToolbarItemValueChangedEventArgs")
@js.native
class ASPxClientToolbarItemValueChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientToolbarItemValueChangedEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientToolbarItemValueChangedEventArgs class with the specified settings.
    */
  def this(
    processOnServer: Boolean,
    item: typings.devexpressWeb.ASPxClientMenuItem,
    editor: typings.devexpressWeb.ASPxClientControl
  ) = this()
  
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  /* CompleteClass */
  var editor: typings.devexpressWeb.ASPxClientControl = js.native
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
