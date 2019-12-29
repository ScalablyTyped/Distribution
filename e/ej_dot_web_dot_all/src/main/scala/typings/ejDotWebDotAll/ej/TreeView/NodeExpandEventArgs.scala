package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExpandEventArgs extends js.Object {
  /** returns the format asynchronous or synchronous
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of currently clicked node
    */
  var id: js.UndefOr[String] = js.undefined
  /** if the child node is ready to expanded state; otherwise, false.
    */
  var isChildLoaded: js.UndefOr[Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parent id of currently clicked node
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the value of the node
    */
  var value: js.UndefOr[String] = js.undefined
}

object NodeExpandEventArgs {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentElement: js.Any = null,
    id: String = null,
    isChildLoaded: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    parentId: String = null,
    `type`: String = null,
    value: String = null
  ): NodeExpandEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildLoaded)) __obj.updateDynamic("isChildLoaded")(isChildLoaded.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeExpandEventArgs]
  }
}

