package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.CustomButtonClick event.
  */
trait ASPxClientVerticalGridCustomButtonEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String
  
  /**
    * Gets the value which identifies the record whose custom button has been clicked.
    */
  var visibleIndex: Double
}
object ASPxClientVerticalGridCustomButtonEventArgs {
  
  inline def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientVerticalGridCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridCustomButtonEventArgs]
  }
  
  extension [Self <: ASPxClientVerticalGridCustomButtonEventArgs](x: Self) {
    
    inline def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
