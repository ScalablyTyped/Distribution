package typings.ejDotWebDotAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** Returns target element Id.
    */
  var Id: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the target element.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** Returns event information.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Returns target element and event information.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns target element parent Id.
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** Returns target element parent text.
    */
  var parentText: js.UndefOr[String] = js.undefined
  /** Returns target element text.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(
    Id: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    event: js.Any = null,
    events: js.Any = null,
    model: Model = null,
    parentId: String = null,
    parentText: String = null,
    text: String = null,
    `type`: String = null
  ): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (parentText != null) __obj.updateDynamic("parentText")(parentText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
}

