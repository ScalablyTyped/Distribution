package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridBase.ToolbarItemClick event.
  */
trait ASPxClientGridToolbarItemClickEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Specifies whether the toolbar item click is handled manually, so no default processing is required.
    */
  var handled: Boolean
  
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem
  
  /**
    * Gets the toolbar index.
    */
  var toolbarIndex: Double
  
  /**
    * Gets the toolbar name.
    */
  var toolbarName: String
  
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean
}
object ASPxClientGridToolbarItemClickEventArgs {
  
  inline def apply(
    handled: Boolean,
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientGridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setToolbarIndex(value: Double): Self = StObject.set(x, "toolbarIndex", value.asInstanceOf[js.Any])
    
    inline def setToolbarName(value: String): Self = StObject.set(x, "toolbarName", value.asInstanceOf[js.Any])
    
    inline def setUsePostBack(value: Boolean): Self = StObject.set(x, "usePostBack", value.asInstanceOf[js.Any])
  }
}
