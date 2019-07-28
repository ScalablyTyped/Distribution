package typings.devexpressDashWeb

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
  var index: Double
  /**
    * Gets the name of the current ribbon item.
    * Value: A string value that is the item's name.
    */
  var name: String
  /**
    * Gets the client ribbon object to which the current item belongs.
    * Value: An <see cref="ASPxClientRibbon" /> object to which the item belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns the item value.
    */
  def GetValue(): js.Object
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: js.Object): Unit
}

object ASPxClientRibbonItem {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetValue: () => js.Object,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetValue: js.Object => Unit,
    group: ASPxClientRibbonGroup,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetValue = js.Any.fromFunction1(SetValue), group = group, index = index, name = name, ribbon = ribbon)
  
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
}

