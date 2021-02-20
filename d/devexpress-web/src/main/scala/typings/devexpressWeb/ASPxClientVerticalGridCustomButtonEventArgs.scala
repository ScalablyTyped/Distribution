package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.CustomButtonClick event.
  */
@js.native
trait ASPxClientVerticalGridCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  
  /**
    * Gets the value which identifies the record whose custom button has been clicked.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientVerticalGridCustomButtonEventArgs {
  
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientVerticalGridCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridCustomButtonEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridCustomButtonEventArgsMutableBuilder[Self <: ASPxClientVerticalGridCustomButtonEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
