package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxCheckBoxList object.
  */
@JSGlobal("ASPxClientCheckBoxList")
@js.native
class ASPxClientCheckBoxList () extends ASPxClientCheckListBase {
  /**
    * Occurs on the client side after a different item in the check box list has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientCheckBoxList: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientCheckBoxList]] = js.native
  /**
    * Returns an array of the check box list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[Double] = js.native
  /**
    * Returns an array of the check box list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem] = js.native
  /**
    * Returns an array of the check box list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[_] = js.native
  /**
    * Selects all check box list items.
    */
  def SelectAll(): Unit = js.native
  /**
    * Selects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def SelectIndices(indices: js.Array[Double]): Unit = js.native
  /**
    * Selects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): Unit = js.native
  /**
    * Selects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def SelectValues(values: js.Array[_]): Unit = js.native
  /**
    * Unselects all check box list items.
    */
  def UnselectAll(): Unit = js.native
  /**
    * Unselects items with the specified indices within a check box list.
    * @param indices An array of integer values that are the item indices.
    */
  def UnselectIndices(indices: js.Array[Double]): Unit = js.native
  /**
    * Unselects the specified items within a check box list.
    * @param items An array of ASPxClientListEditItem objects that are the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): Unit = js.native
  /**
    * Unselects items with the specified values within a check box list.
    * @param values An array of Object[] objects that are the item values.
    */
  def UnselectValues(values: js.Array[_]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientCheckBoxList")
@js.native
object ASPxClientCheckBoxList extends js.Object {
  /**
    * Converts the specified object to the ASPxClientCheckBoxList type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientCheckBoxList = js.native
}

