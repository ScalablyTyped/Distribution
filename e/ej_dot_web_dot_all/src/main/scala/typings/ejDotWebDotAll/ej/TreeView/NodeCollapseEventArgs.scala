package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCollapseEventArgs extends js.Object {
  /** returns the format asynchronous or synchronous
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the current element of the node clicked
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns the child nodes are loaded or not
    */
  var isChildLoaded: js.UndefOr[Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TreeView.Model] = js.undefined
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

object NodeCollapseEventArgs {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentElement: js.Any = null,
    id: String = null,
    isChildLoaded: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.TreeView.Model = null,
    parentId: String = null,
    `type`: String = null,
    value: String = null
  ): NodeCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isChildLoaded)) __obj.updateDynamic("isChildLoaded")(isChildLoaded)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NodeCollapseEventArgs]
  }
}

