package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
trait ASPxClientRibbonItem extends js.Object {
  /**
    * Gets the client group object to which the current item belongs.
    * Value: An <see cref="ASPxClientRibbonGroup" /> object to which the item belongs.
    */
  var group: ASPxClientRibbonGroup
  /**
    * Gets or sets the item's index within the collection.
    * Value: An integer value that is the zero-based index of the item within the collection.
    */
  var index: scala.Double
  /**
    * Gets the name of the current ribbon item.
    * Value: A string value that is the item's name.
    */
  var name: java.lang.String
  /**
    * Gets the client ribbon object to which the current item belongs.
    * Value: An <see cref="ASPxClientRibbon" /> object to which the item belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the item value.
    */
  def GetValue(): js.Object
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: js.Object): scala.Unit
}

object ASPxClientRibbonItem {
  @scala.inline
  def apply(
    GetEnabled: js.Function0[scala.Boolean],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    group: ASPxClientRibbonGroup,
    index: scala.Double,
    name: java.lang.String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = GetEnabled, GetValue = GetValue, GetVisible = GetVisible, SetEnabled = SetEnabled, SetValue = SetValue, group = group, index = index, name = name, ribbon = ribbon)
  
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
}

