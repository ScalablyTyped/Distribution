package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
@JSGlobal("ASPxClientRibbonItem")
@js.native
class ASPxClientRibbonItem () extends js.Object {
  /**
    * Gets the client group object to which the current item belongs.
    */
  var group: ASPxClientRibbonGroup = js.native
  /**
    * Gets or sets the item's index within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name of the current ribbon item.
    */
  var name: String = js.native
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the item value.
    */
  def GetValue(): js.Any = js.native
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: js.Any): Unit = js.native
}

