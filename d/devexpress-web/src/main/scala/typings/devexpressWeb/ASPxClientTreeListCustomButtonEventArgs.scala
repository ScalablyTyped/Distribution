package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
@js.native
trait ASPxClientTreeListCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  
  /**
    * Gets the button's index.
    */
  var buttonIndex: Double = js.native
  
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  var nodeKey: String = js.native
}
object ASPxClientTreeListCustomButtonEventArgs {
  
  @scala.inline
  def apply(buttonID: String, buttonIndex: Double, nodeKey: String, processOnServer: Boolean): ASPxClientTreeListCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], buttonIndex = buttonIndex.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomButtonEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListCustomButtonEventArgsMutableBuilder[Self <: ASPxClientTreeListCustomButtonEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
  }
}
