package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
trait ASPxClientRibbonTab extends js.Object {
  /**
    * Gets or sets the tab's index within the collection.
    * Value: An integer value that is the zero-based index of the tab within the collection.
    */
  var index: scala.Double
  /**
    * Gets the name of the current ribbon tab.
    * Value: A string value that is the tab's name.
    */
  var name: java.lang.String
  /**
    * Gets the client ribbon object to which the current tab belongs.
    * Value: An <see cref="ASPxClientRibbon" /> object to which the tab belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Returns a value indicating whether a ribbon tab is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the text displayed in the tab.
    */
  def GetText(): java.lang.String
  /**
    * Returns a value specifying whether a ribbon tab is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Sets a value specifying whether the tab is enabled.
    * @param enabled true to enable the tab; false to disable it.
    */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
}

object ASPxClientRibbonTab {
  @scala.inline
  def apply(
    GetEnabled: () => scala.Boolean,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetEnabled: scala.Boolean => scala.Unit,
    index: scala.Double,
    name: java.lang.String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonTab = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), index = index, name = name, ribbon = ribbon)
  
    __obj.asInstanceOf[ASPxClientRibbonTab]
  }
}

