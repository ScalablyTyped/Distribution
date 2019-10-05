package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the toolbar item on which mouse click has been performed
    */
  var itemName: js.UndefOr[String] = js.undefined
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ToolbarClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentTarget: js.Any = null,
    itemName: String = null,
    model: js.Any = null,
    `type`: String = null
  ): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (itemName != null) __obj.updateDynamic("itemName")(itemName)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

