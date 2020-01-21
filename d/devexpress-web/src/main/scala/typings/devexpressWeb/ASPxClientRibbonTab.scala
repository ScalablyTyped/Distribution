package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
@JSGlobal("ASPxClientRibbonTab")
@js.native
class ASPxClientRibbonTab () extends js.Object {
  /**
    * Gets or sets the tab's index within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name of the current ribbon tab.
    */
  var name: String = js.native
  /**
    * Gets the client ribbon object to which the current tab belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
  /**
    * Returns a value indicating whether a ribbon tab is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the text displayed in the tab.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a ribbon tab is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Sets a value specifying whether the tab is enabled.
    * @param enabled true to enable the tab; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
}

