package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
trait ASPxClientSplitterPaneEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the pane object related to the event.
    */
  var pane: ASPxClientSplitterPane
}
object ASPxClientSplitterPaneEventArgs {
  
  inline def apply(pane: ASPxClientSplitterPane): ASPxClientSplitterPaneEventArgs = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneEventArgs]
  }
  
  extension [Self <: ASPxClientSplitterPaneEventArgs](x: Self) {
    
    inline def setPane(value: ASPxClientSplitterPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
