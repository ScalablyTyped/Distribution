package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
trait ASPxClientRibbonTabEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientRibbonTab
}
object ASPxClientRibbonTabEventArgs {
  
  inline def apply(tab: ASPxClientRibbonTab): ASPxClientRibbonTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTabEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientRibbonTabEventArgs] (val x: Self) extends AnyVal {
    
    inline def setTab(value: ASPxClientRibbonTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
