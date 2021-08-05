package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.DialogBoxLauncherClicked event.
  */
trait ASPxClientRibbonDialogBoxLauncherClickedEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the client group object to which the clicked dialog box launcher belongs.
    */
  var group: ASPxClientRibbonGroup
}
object ASPxClientRibbonDialogBoxLauncherClickedEventArgs {
  
  inline def apply(group: ASPxClientRibbonGroup, processOnServer: Boolean): ASPxClientRibbonDialogBoxLauncherClickedEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonDialogBoxLauncherClickedEventArgs]
  }
  
  extension [Self <: ASPxClientRibbonDialogBoxLauncherClickedEventArgs](x: Self) {
    
    inline def setGroup(value: ASPxClientRibbonGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
