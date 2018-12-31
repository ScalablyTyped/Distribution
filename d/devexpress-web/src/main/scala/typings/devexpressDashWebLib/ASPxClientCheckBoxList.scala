package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
trait ASPxClientCheckBoxList extends ASPxClientCheckListBase {
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]]
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[scala.Double]
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem]
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[js.Object]
  /**
    * Selects all check box list items.
    */
  def SelectAll(): scala.Unit
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[js.Object]): scala.Unit
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): scala.Unit
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[scala.Double]): scala.Unit
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[js.Object]): scala.Unit
}

