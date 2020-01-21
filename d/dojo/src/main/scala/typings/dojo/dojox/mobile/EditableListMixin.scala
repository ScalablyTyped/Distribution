package typings.dojo.dojox.mobile

import typings.dojo.dijit.WidgetBase
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_EditableListMixin.html
  *
  * A rounded rectangle list.
  * EditableRoundRectList is a rounded rectangle list, which can be used to
  * display a group of items. Each item must be a dojox/mobile/ListItem.
  *
  */
@JSGlobal("dojox.mobile._EditableListMixin")
@js.native
class EditableListMixin () extends js.Object {
  /**
    *
    */
  var deleteIconForEdit: String = js.native
  /**
    * A read-only flag that indicates whether the widget is in the editing mode.
    *
    */
  var isEditing: Boolean = js.native
  /**
    *
    */
  var rightIconForEdit: String = js.native
  /**
    * Destroys the widget.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Ends the editing.
    *
    */
  def endEdit(): Unit = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  /**
    * Stub function to connect to from your application.
    * This function is called when a user clicks the delete
    * button.
    * You have to provide that function or subscribe to /dojox/mobile/deleteListItem,
    * otherwise the delete button will have no-effect.
    *
    * @param item
    */
  def onDeleteItem(item: WidgetBase): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    */
  def onEndEdit(): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    * @param item
    * @param from
    * @param to
    */
  def onMoveItem(item: WidgetBase, from: Double, to: Double): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    */
  def onStartEdit(): Unit = js.native
  /**
    * Starts the editing.
    *
    */
  def startEdit(): Unit = js.native
}

