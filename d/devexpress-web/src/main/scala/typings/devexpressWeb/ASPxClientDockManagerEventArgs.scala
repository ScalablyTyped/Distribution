package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on panels.
  */
@js.native
trait ASPxClientDockManagerEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}
object ASPxClientDockManagerEventArgs {
  
  @scala.inline
  def apply(panel: ASPxClientDockPanel): ASPxClientDockManagerEventArgs = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDockManagerEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDockManagerEventArgsMutableBuilder[Self <: ASPxClientDockManagerEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanel(value: ASPxClientDockPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
