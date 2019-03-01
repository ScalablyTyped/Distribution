package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPressEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of current TreeView node
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** it returns when the current node is in expanded state; otherwise, false.
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the key pressed key code value
    */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the parentId of current TreeView node
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** returns node path from root element
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the value of the node
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object KeyPressEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentElement: js.Any = null,
    event: js.Any = null,
    id: java.lang.String = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    keyCode: scala.Int | scala.Double = null,
    model: Model = null,
    parentId: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): KeyPressEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyPressEventArgs]
  }
}

