package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
trait ASPxClientRibbonDialogBoxLauncherClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup
}

object ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  @scala.inline
  def apply(group: ASPxClientRibbonGroup, processOnServer: Boolean): ASPxClientRibbonDialogBoxLauncherClickedEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonDialogBoxLauncherClickedEventArgs]
  }
}

