package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapComboBox control.
  */
@js.native
trait BootstrapClientComboBox extends ASPxClientComboBox {
  /**
    * Gets the CSS class of the icon displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    */
  def GetItemBadgeIconCssClass(index: scala.Double): java.lang.String = js.native
  /**
    * Gets the text displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    */
  def GetItemBadgeText(index: scala.Double): java.lang.String = js.native
  /**
    * Sets the CSS class of the icon displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    * @param cssClass A String containing the name of a CSS class.
    */
  def SetItemBadgeIconCssClass(index: scala.Double, cssClass: java.lang.String): scala.Unit = js.native
  /**
    * Sets the text displayed within a Combo Box item badge.
    * @param index The index of a Combo Box item.
    * @param text A String specifying the badge text.
    */
  def SetItemBadgeText(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the list editor's selected item.
    * @param item A BootstrapClientListBoxItem object that specifies the item to select.
    */
  def SetSelectedItem(item: BootstrapClientListBoxItem): scala.Unit = js.native
}

