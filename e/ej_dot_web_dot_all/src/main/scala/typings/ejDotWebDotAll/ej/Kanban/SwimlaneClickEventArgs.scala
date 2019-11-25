package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneClickEventArgs extends js.Object {
  /** Current Action name while swim lane clicked. Actions are "expand" or "collapse"
    */
  var action: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the swim lane group data's.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current swim lane row index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns current target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SwimlaneClickEventArgs {
  @scala.inline
  def apply(
    action: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    rowIndex: Int | Double = null,
    target: js.Any = null,
    `type`: String = null
  ): SwimlaneClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwimlaneClickEventArgs]
  }
}

