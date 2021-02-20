package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
@js.native
trait ASPxClientSplitterPaneEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the pane object related to the event.
    */
  var pane: ASPxClientSplitterPane = js.native
}
object ASPxClientSplitterPaneEventArgs {
  
  @scala.inline
  def apply(pane: ASPxClientSplitterPane): ASPxClientSplitterPaneEventArgs = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSplitterPaneEventArgsMutableBuilder[Self <: ASPxClientSplitterPaneEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPane(value: ASPxClientSplitterPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
