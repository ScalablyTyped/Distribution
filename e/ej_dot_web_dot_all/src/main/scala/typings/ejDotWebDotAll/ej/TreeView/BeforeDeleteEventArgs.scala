package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDeleteEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the parent node values
    */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the target node
    */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the currently removed nodes
    */
  var removedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the target element, the given node to be deleted
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeDeleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    model: Model = null,
    nodeDetails: js.Any = null,
    parentDetails: js.Any = null,
    parentElement: js.Any = null,
    removedNodes: js.Array[_] = null,
    target: js.Any = null,
    `type`: String = null
  ): BeforeDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails.asInstanceOf[js.Any])
    if (parentDetails != null) __obj.updateDynamic("parentDetails")(parentDetails.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (removedNodes != null) __obj.updateDynamic("removedNodes")(removedNodes.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeDeleteEventArgs]
  }
}

