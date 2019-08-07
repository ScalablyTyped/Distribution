package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapComboBox control.
  */
@JSGlobal("BootstrapClientComboBox")
@js.native
class BootstrapClientComboBox () extends ASPxClientComboBox {
  /**
    * Gets the CSS class of the icon displayed within a Combo Box item badge. A String containing the name of a CSS class.
    * @param index The index of a Combo Box item.
    */
  def GetItemBadgeIconCssClass(index: Double): String = js.native
  /**
    * Gets the text displayed within a Combo Box item badge. A String specifying the badge text.
    * @param index The index of a Combo Box item.
    */
  def GetItemBadgeText(index: Double): String = js.native
  /**
    * Sets the CSS class of the icon displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetItemBadgeIconCssClass(index: Double, cssClass: String): Unit = js.native
  /**
    * Sets the text displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    * @param text A String specifying the badge text.
    */
  def SetItemBadgeText(index: Double, text: String): Unit = js.native
  /**
    * Sets the list editor's selected item.
    * @param item A BootstrapClientListBoxItem object that specifies the item to select.
    */
  def SetSelectedItem(item: BootstrapClientListBoxItem): Unit = js.native
}

