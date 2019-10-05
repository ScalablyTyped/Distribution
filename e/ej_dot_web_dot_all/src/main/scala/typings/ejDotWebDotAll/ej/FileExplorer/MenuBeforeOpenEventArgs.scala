package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuBeforeOpenEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the name of ContextMenu items group.
    */
  var contextMenu: js.UndefOr[String] = js.undefined
  /** returns the dataSource of ContextMenu.
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** returns the element of ContextMenu.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event of ContextMenu.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.FileExplorer.Model] = js.undefined
  /** returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuBeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    dataSource: js.Array[_] = null,
    element: js.Any = null,
    events: js.Any = null,
    model: typings.ejDotWebDotAll.ej.FileExplorer.Model = null,
    target: js.Any = null,
    `type`: String = null
  ): MenuBeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (element != null) __obj.updateDynamic("element")(element)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuBeforeOpenEventArgs]
  }
}

