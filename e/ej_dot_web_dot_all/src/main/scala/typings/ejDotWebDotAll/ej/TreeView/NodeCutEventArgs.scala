package typings.ejDotWebDotAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCutEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the key pressed key code value
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TreeView.Model] = js.undefined
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the cut node
    */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeCutEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    keyCode: Int | Double = null,
    model: typings.ejDotWebDotAll.ej.TreeView.Model = null,
    parentDetails: js.Any = null,
    parentElement: js.Any = null,
    `type`: String = null
  ): NodeCutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (event != null) __obj.updateDynamic("event")(event)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentDetails != null) __obj.updateDynamic("parentDetails")(parentDetails)
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeCutEventArgs]
  }
}

