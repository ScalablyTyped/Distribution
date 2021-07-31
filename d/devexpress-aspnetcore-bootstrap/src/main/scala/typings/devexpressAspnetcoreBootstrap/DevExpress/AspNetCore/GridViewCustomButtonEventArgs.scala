package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewCustomButtonEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val buttonID: String
  
  val visibleIndex: Double
}
object GridViewCustomButtonEventArgs {
  
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, sender: Control, visibleIndex: Double): GridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewCustomButtonEventArgs]
  }
  
  @scala.inline
  implicit class GridViewCustomButtonEventArgsMutableBuilder[Self <: GridViewCustomButtonEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
