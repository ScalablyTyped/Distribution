package typings.ejDotWebDotAll.ejNs.TreeViewNs

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.TreeViewNs.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ejNs.TreeViewNs.Model = null,
    parentId: String = null,
    `type`: String = null,
    value: String = null
  ): NodeExpandEventArgs = {
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
    __obj.asInstanceOf[NodeExpandEventArgs]
  }
}

