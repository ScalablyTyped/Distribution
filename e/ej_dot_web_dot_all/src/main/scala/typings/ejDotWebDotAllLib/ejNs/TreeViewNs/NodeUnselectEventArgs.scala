package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeUnselectEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node unselected
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the current element of the node unselected
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the id of the parent element of current element of the node unselected
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current selected nodes index of TreeView
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object NodeUnselectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentElement: js.Any = null,
    id: java.lang.String = null,
    model: Model = null,
    parentId: java.lang.String = null,
    selectedNodes: js.Array[_] = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): NodeUnselectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NodeUnselectEventArgs]
  }
}

