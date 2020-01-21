package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client editor objects that display a list of items.
  */
@JSGlobal("ASPxClientListEdit")
@js.native
class ASPxClientListEdit () extends ASPxClientEdit {
  /**
    * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
    */
  var SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientListEdit]] = js.native
  /**
    * Returns the index of the selected item within the list editor.
    */
  def GetSelectedIndex(): Double = js.native
  /**
    * Returns the list editor's selected item.
    */
  def GetSelectedItem(): ASPxClientListEditItem = js.native
  /**
    * Sets the list editor's selected item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to select.
    */
  def SetSelectedIndex(index: Double): Unit = js.native
  /**
    * Sets the list editor's selected item.
    * @param item An ASPxClientListEditItem object that specifies the item to select.
    */
  def SetSelectedItem(item: ASPxClientListEditItem): Unit = js.native
}

