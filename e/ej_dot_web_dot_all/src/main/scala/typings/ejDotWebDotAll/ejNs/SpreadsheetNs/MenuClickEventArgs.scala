package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns menu click element.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the event information.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model] = js.undefined
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

object MenuClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.Model = null,
    parentId: String = null,
    parentText: String = null,
    text: String = null,
    `type`: String = null
  ): MenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (parentText != null) __obj.updateDynamic("parentText")(parentText)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuClickEventArgs]
  }
}

