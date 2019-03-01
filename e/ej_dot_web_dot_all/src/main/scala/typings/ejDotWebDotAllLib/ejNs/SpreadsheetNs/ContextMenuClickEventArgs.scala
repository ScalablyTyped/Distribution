package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** Returns target element Id.
    */
  var Id: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the target element.
    */
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
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
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** Returns target element parent text.
    */
  var parentText: js.UndefOr[java.lang.String] = js.undefined
  /** Returns target element text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(
    Id: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    element: stdLib.HTMLElement = null,
    event: js.Any = null,
    events: js.Any = null,
    model: Model = null,
    parentId: java.lang.String = null,
    parentText: java.lang.String = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (parentText != null) __obj.updateDynamic("parentText")(parentText)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
}

