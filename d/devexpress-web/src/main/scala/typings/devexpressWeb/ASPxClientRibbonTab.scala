package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
trait ASPxClientRibbonTab extends js.Object {
  /**
    * Gets or sets the tab's index within the collection.
    */
  var index: Double
  /**
    * Gets the name of the current ribbon tab.
    */
  var name: String
  /**
    * Gets the client ribbon object to which the current tab belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Returns a value indicating whether a ribbon tab is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns the text displayed in the tab.
    */
  def GetText(): String
  /**
    * Returns a value specifying whether a ribbon tab is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Sets a value specifying whether the tab is enabled.
    * @param enabled true to enable the tab; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
}

object ASPxClientRibbonTab {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonTab = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTab]
  }
}

