package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.CustomButtonClick event.
  */
trait ASPxClientCardViewCustomButtonEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String
  
  /**
    * Gets the value which identifies the card whose custom button has been clicked.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewCustomButtonEventArgs {
  
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientCardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCustomButtonEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewCustomButtonEventArgsMutableBuilder[Self <: ASPxClientCardViewCustomButtonEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
