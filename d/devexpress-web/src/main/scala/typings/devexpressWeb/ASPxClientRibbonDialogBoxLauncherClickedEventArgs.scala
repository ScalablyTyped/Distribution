package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
@JSGlobal("ASPxClientRibbonDialogBoxLauncherClickedEventArgs")
@js.native
class ASPxClientRibbonDialogBoxLauncherClickedEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonDialogBoxLauncherClickedEventArgs type with the specified settings.
    * @param group An ASPxClientRibbonGroup object to which the dialog box launcher belongs.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(group: ASPxClientRibbonGroup, processOnServer: Boolean) = this()
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
}

