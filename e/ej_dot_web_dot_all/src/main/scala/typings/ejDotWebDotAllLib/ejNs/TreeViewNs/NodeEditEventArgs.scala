package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEditEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the element
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the newText of the element
    */
  var newText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the oldText of the element
    */
  var oldText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the target element, the given node to be cut
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NodeEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    id: java.lang.String = null,
    model: Model = null,
    newText: java.lang.String = null,
    nodeDetails: js.Any = null,
    oldText: java.lang.String = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): NodeEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (newText != null) __obj.updateDynamic("newText")(newText)
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails)
    if (oldText != null) __obj.updateDynamic("oldText")(oldText)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeEditEventArgs]
  }
}

