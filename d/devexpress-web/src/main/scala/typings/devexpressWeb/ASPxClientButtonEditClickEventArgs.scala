package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientButtonEditBase.ButtonClick event.
  */
@js.native
trait ASPxClientButtonEditClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the index of the clicked button.
    */
  var buttonIndex: Double = js.native
}
object ASPxClientButtonEditClickEventArgs {
  
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean): ASPxClientButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonEditClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientButtonEditClickEventArgsMutableBuilder[Self <: ASPxClientButtonEditClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
  }
}
