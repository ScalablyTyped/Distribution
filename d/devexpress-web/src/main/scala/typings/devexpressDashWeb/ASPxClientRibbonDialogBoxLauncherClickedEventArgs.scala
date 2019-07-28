package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DialogBoxLauncherClicked event.
  */
trait ASPxClientRibbonDialogBoxLauncherClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    * Value: An <see cref="ASPxClientRibbonGroup" /> object to which the dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup
}

object ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  @scala.inline
  def apply(group: ASPxClientRibbonGroup, processOnServer: Boolean): ASPxClientRibbonDialogBoxLauncherClickedEventArgs = {
    val __obj = js.Dynamic.literal(group = group, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientRibbonDialogBoxLauncherClickedEventArgs]
  }
}

