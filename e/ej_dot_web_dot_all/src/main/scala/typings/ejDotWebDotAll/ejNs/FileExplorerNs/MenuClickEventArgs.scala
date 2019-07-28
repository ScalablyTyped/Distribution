package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuClickEventArgs extends js.Object {
  /** returns the ID of clicked ContextMenu item.
    */
  var ID: js.UndefOr[String] = js.undefined
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the name of ContextMenu items group.
    */
  var contextMenu: js.UndefOr[String] = js.undefined
  /** returns the element of clicked ContextMenu item.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event of ContextMenu.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model] = js.undefined
  /** returns the parent element ID of clicked ContextMenu item.
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** returns the parent element text of clicked ContextMenu item.
    */
  var parentText: js.UndefOr[String] = js.undefined
  /** returns the text of clicked ContextMenu item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuClickEventArgs {
  @scala.inline
  def apply(
    ID: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    element: js.Any = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model = null,
    parentId: String = null,
    parentText: String = null,
    text: String = null,
    `type`: String = null
  ): MenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
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

