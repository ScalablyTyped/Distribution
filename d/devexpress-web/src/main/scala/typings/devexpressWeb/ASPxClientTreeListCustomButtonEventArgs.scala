package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
trait ASPxClientTreeListCustomButtonEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String
  
  /**
    * Gets the button's index.
    */
  var buttonIndex: Double
  
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  var nodeKey: String
}
object ASPxClientTreeListCustomButtonEventArgs {
  
  inline def apply(buttonID: String, buttonIndex: Double, nodeKey: String, processOnServer: Boolean): ASPxClientTreeListCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], buttonIndex = buttonIndex.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomButtonEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListCustomButtonEventArgs](x: Self) {
    
    inline def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    inline def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
    
    inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
  }
}
