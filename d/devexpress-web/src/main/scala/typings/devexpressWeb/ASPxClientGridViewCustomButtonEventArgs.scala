package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.CustomButtonClick event.
  */
@js.native
trait ASPxClientGridViewCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the value that identifies the custom button.
    */
  var buttonID: String = js.native
  
  /**
    * Gets the value that identifies the row whose custom button has been clicked.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientGridViewCustomButtonEventArgs {
  
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientGridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCustomButtonEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewCustomButtonEventArgsMutableBuilder[Self <: ASPxClientGridViewCustomButtonEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
