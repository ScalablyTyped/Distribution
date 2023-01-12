package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
trait ASPxClientToolbarItemValueChangedEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
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
  
  inline def apply(editor: ASPxClientControl, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientToolbarItemValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolbarItemValueChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientToolbarItemValueChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setEditor(value: ASPxClientControl): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
