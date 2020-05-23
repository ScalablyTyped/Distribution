package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
trait ASPxClientToolbarItemValueChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  var editor: ASPxClientControl
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem
}

object ASPxClientToolbarItemValueChangedEventArgs {
  @scala.inline
  def apply(editor: ASPxClientControl, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientToolbarItemValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolbarItemValueChangedEventArgs]
  }
}

