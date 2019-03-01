package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineEditValidationEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current node element id
    */
  var id: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the new entered text for the node
    */
  var newText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the old node text
    */
  var oldText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InlineEditValidationEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.Any = null,
    model: Model = null,
    newText: java.lang.String = null,
    oldText: java.lang.String = null,
    `type`: java.lang.String = null
  ): InlineEditValidationEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (newText != null) __obj.updateDynamic("newText")(newText)
    if (oldText != null) __obj.updateDynamic("oldText")(oldText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InlineEditValidationEventArgs]
  }
}

