package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDeleteEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the deleted node
    */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the currently removed nodes
    */
  var removedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodeDeleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    model: Model = null,
    parentDetails: js.Any = null,
    parentElement: js.Any = null,
    removedNodes: js.Array[_] = null,
    `type`: java.lang.String = null
  ): NodeDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentDetails != null) __obj.updateDynamic("parentDetails")(parentDetails)
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement)
    if (removedNodes != null) __obj.updateDynamic("removedNodes")(removedNodes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeDeleteEventArgs]
  }
}

