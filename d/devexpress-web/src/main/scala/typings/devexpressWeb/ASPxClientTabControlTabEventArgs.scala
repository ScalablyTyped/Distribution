package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on tabs.
  */
trait ASPxClientTabControlTabEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab
}
object ASPxClientTabControlTabEventArgs {
  
  inline def apply(tab: ASPxClientTab): ASPxClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabEventArgs]
  }
  
  extension [Self <: ASPxClientTabControlTabEventArgs](x: Self) {
    
    inline def setTab(value: ASPxClientTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
