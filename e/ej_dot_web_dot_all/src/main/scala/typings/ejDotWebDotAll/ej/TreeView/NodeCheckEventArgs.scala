package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCheckEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** it returns the currently checked and its child node details
    */
  var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** it returns the currently checked node name
    */
  var currentNode: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the current element of the node clicked
    */
  var id: js.UndefOr[String] = js.undefined
  /** it returns true when the node checkbox is checked; otherwise, false.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the id of the parent element of current element of the node clicked
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the value of the node
    */
  var value: js.UndefOr[String] = js.undefined
}

object NodeCheckEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentCheckedNodes: js.Array[_] = null,
    currentElement: js.Any = null,
    currentNode: js.Array[_] = null,
    event: js.Any = null,
    id: String = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    parentId: String = null,
    `type`: String = null,
    value: String = null
  ): NodeCheckEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentCheckedNodes != null) __obj.updateDynamic("currentCheckedNodes")(currentCheckedNodes.asInstanceOf[js.Any])
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement.asInstanceOf[js.Any])
    if (currentNode != null) __obj.updateDynamic("currentNode")(currentNode.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckEventArgs]
  }
}

