package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.ActiveTabChanged event.
  */
@JSGlobal("ASPxClientRibbonTabEventArgs")
@js.native
class ASPxClientRibbonTabEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRibbonTabEventArgs class with the specified setting.
    * @param tab An ASPxClientRibbonTab object that is a tab related to the event.
    */
  def this(tab: ASPxClientRibbonTab) = this()
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientRibbonTab = js.native
}

