package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
@js.native
trait ASPxClientRibbonTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientRibbonTab = js.native
}
object ASPxClientRibbonTabEventArgs {
  
  @scala.inline
  def apply(tab: ASPxClientRibbonTab): ASPxClientRibbonTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTabEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonTabEventArgsMutableBuilder[Self <: ASPxClientRibbonTabEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: ASPxClientRibbonTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
