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
    GetEnabled: js.Function0[scala.Boolean],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonTab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ribbon")(ribbon)
    __obj.asInstanceOf[ASPxClientRibbonTab]
  }
}

