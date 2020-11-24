package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
@JSGlobal("ASPxClientRibbonDialogBoxLauncherClickedEventArgs")
@js.native
class ASPxClientRibbonDialogBoxLauncherClickedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonDialogBoxLauncherClickedEventArgs type with the specified settings.
    * @param group An ASPxClientRibbonGroup object to which the dialog box launcher belongs.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(group: typings.devexpressWeb.ASPxClientRibbonGroup, processOnServer: Boolean) = this()
}
