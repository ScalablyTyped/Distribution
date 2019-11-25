package typings.ejDotWebDotAll.ej.Kanban

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
  /** Returns the item id of that current element.
    */
  var itemId: js.UndefOr[String] = js.undefined
  /** Returns the item index of that current element.
    */
  var itemIndex: js.UndefOr[Double] = js.undefined
  /** Returns the item name of that current element.
    */
  var itemName: js.UndefOr[String] = js.undefined
  /** Returns the item text of that current element.
    */
  var itemText: js.UndefOr[String] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the toolbar object of the Kanban.
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
    itemId: String = null,
    itemIndex: Int | Double = null,
    itemName: String = null,
    itemText: String = null,
    model: js.Any = null,
    toolbarData: js.Any = null,
    `type`: String = null
  ): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (itemText != null) __obj.updateDynamic("itemText")(itemText.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (toolbarData != null) __obj.updateDynamic("toolbarData")(toolbarData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

