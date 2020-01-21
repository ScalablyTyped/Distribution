package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@JSGlobal("ASPxClientToolbarItemValueChangedEventArgs")
@js.native
class ASPxClientToolbarItemValueChangedEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientToolbarItemValueChangedEventArgs class with the specified settings.
    */
  def this(processOnServer: Boolean, item: ASPxClientMenuItem, editor: ASPxClientControl) = this()
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  var editor: ASPxClientControl = js.native
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem = js.native
}

