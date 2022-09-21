package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
@JSGlobal("ASPxClientRibbonDialogBoxLauncherClickedEventArgs")
@js.native
open class ASPxClientRibbonDialogBoxLauncherClickedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonDialogBoxLauncherClickedEventArgs type with the specified settings.
    * @param group An ASPxClientRibbonGroup object to which the dialog box launcher belongs.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(group: typings.devexpressWeb.ASPxClientRibbonGroup, processOnServer: Boolean) = this()
  
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  /* CompleteClass */
  var group: typings.devexpressWeb.ASPxClientRibbonGroup = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
