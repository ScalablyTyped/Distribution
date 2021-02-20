package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonClickEventArgs extends ProcessingModeEventArgs {
  
  val cancelEventAndBubble: Boolean = js.native
}
object ButtonClickEventArgs {
  
  @scala.inline
  def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
  
  @scala.inline
  implicit class ButtonClickEventArgsMutableBuilder[Self <: ButtonClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelEventAndBubble(value: Boolean): Self = StObject.set(x, "cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
}
