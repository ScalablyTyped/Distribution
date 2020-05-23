package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
trait ASPxClientRibbonTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientRibbonTab
}

object ASPxClientRibbonTabEventArgs {
  @scala.inline
  def apply(tab: ASPxClientRibbonTab): ASPxClientRibbonTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTabEventArgs]
  }
}

