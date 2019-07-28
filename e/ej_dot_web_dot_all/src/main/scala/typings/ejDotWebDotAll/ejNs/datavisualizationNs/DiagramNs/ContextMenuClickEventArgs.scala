package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** parameter defines whether to execute the click event or not
    */
  var canExecute: js.UndefOr[Boolean] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the element of the object that was clicked
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the model of the diagram
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the id of the selected context menu item
    */
  var id: js.UndefOr[String] = js.undefined
  /** parameter returns the parent id of the selected context menu item
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** parameter returns the parent text of the selected context menu item
    */
  var parentText: js.UndefOr[String] = js.undefined
  /** parameter returns the object that is selected
    */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that was clicked
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the text of the selected context menu item
    */
  var text: js.UndefOr[String] = js.undefined
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(
    canExecute: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    element: js.Any = null,
    events: js.Any = null,
    id: String = null,
    parentId: String = null,
    parentText: String = null,
    selectedItem: js.Any = null,
    target: js.Any = null,
    text: String = null
  ): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canExecute)) __obj.updateDynamic("canExecute")(canExecute)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (parentText != null) __obj.updateDynamic("parentText")(parentText)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
}

