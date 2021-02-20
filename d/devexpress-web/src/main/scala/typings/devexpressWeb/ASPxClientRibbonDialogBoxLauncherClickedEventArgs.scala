package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
@js.native
trait ASPxClientRibbonDialogBoxLauncherClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
}
object ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  
  @scala.inline
  def apply(group: ASPxClientRibbonGroup, processOnServer: Boolean): ASPxClientRibbonDialogBoxLauncherClickedEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonDialogBoxLauncherClickedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonDialogBoxLauncherClickedEventArgsMutableBuilder[Self <: ASPxClientRibbonDialogBoxLauncherClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: ASPxClientRibbonGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
