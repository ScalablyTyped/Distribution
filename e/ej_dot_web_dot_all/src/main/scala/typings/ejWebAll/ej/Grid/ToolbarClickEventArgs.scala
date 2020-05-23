package typings.ejWebAll.ej.Grid

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
  /** Returns the grid model.
    */
  var gridModel: js.UndefOr[js.Any] = js.undefined
  /** Returns the Id of the current toolbar element.
    */
  var itemId: js.UndefOr[String] = js.undefined
  /** Returns the index of the current toolbar element.
    */
  var itemIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the current toolbar element.
    */
  var itemName: js.UndefOr[String] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the status of toolbar item which denotes its enabled state
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** Returns the target item.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the toolbar object of the selected toolbar element.
    */
  var toolbarData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ToolbarClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentTarget: js.Any = null,
    gridModel: js.Any = null,
    itemId: String = null,
    itemIndex: js.UndefOr[Double] = js.undefined,
    itemName: String = null,
    model: js.Any = null,
    status: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    toolbarData: js.Any = null,
    `type`: String = null
  ): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (gridModel != null) __obj.updateDynamic("gridModel")(gridModel.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (!js.isUndefined(itemIndex)) __obj.updateDynamic("itemIndex")(itemIndex.get.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (toolbarData != null) __obj.updateDynamic("toolbarData")(toolbarData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

