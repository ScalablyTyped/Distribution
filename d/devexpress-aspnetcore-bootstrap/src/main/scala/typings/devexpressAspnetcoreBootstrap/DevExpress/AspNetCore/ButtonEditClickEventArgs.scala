package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonEditClickEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val buttonIndex: Double
}
object ButtonEditClickEventArgs {
  
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean, sender: Control): ButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonEditClickEventArgs]
  }
  
  @scala.inline
  implicit class ButtonEditClickEventArgsMutableBuilder[Self <: ButtonEditClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonIndex(value: Double): Self = StObject.set(x, "buttonIndex", value.asInstanceOf[js.Any])
  }
}
