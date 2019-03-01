package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActiveTabChanged event.
  */
trait ASPxClientRibbonTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the tab object related to the event.
    * Value: An <see cref="ASPxClientRibbonTab" /> object that is the tab, manipulations on which forced the ribbon control to raise the event.
    */
  var tab: ASPxClientRibbonTab
}

object ASPxClientRibbonTabEventArgs {
  @scala.inline
  def apply(tab: ASPxClientRibbonTab): ASPxClientRibbonTabEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[ASPxClientRibbonTabEventArgs]
  }
}

