package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the added data, that are given initially
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the newly added elements
    */
  var nodes: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the target parent element of the added element
    */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: Model = null,
    nodes: js.Any = null,
    parentDetails: js.Any = null,
    parentElement: js.Any = null,
    `type`: String = null
  ): NodeAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (parentDetails != null) __obj.updateDynamic("parentDetails")(parentDetails.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddEventArgs]
  }
}

