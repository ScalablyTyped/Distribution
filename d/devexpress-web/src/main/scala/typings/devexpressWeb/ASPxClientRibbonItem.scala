package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
trait ASPxClientRibbonItem extends js.Object {
  /**
    * Gets the client group object to which the current item belongs.
    */
  var group: ASPxClientRibbonGroup
  /**
    * Gets or sets the item's index within the collection.
    */
  var index: Double
  /**
    * Gets the name of the current ribbon item.
    */
  var name: String
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  var ribbon: ASPxClientRibbon
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Returns the item value.
    */
  def GetValue(): js.Any
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
  def SetValue(value: js.Any): Unit
}

object ASPxClientRibbonItem {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetValue: js.Any => Unit,
    group: ASPxClientRibbonGroup,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetValue = js.Any.fromFunction1(SetValue), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
}

