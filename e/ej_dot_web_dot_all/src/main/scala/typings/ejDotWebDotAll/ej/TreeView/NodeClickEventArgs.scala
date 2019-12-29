package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of currently clicked TreeView node
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parentId of currently clicked TreeView node
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentElement: js.Any = null,
    event: js.Any = null,
    id: String = null,
    model: Model = null,
    parentId: String = null,
    `type`: String = null
  ): NodeClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeClickEventArgs]
  }
}

