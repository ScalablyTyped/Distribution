package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on tabs.
  */
trait BootstrapClientTabControlTabEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab
}
object BootstrapClientTabControlTabEventArgs {
  
  inline def apply(tab: BootstrapClientTab): BootstrapClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabEventArgs]
  }
  
  extension [Self <: BootstrapClientTabControlTabEventArgs](x: Self) {
    
    inline def setTab(value: BootstrapClientTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
