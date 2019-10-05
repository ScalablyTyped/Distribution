package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOpenEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the default context menu items to which we add custom items.
    */
  var contextMenuItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    contextMenuItems: js.Array[_] = null,
    model: js.Any = null,
    requestType: String = null,
    `type`: String = null
  ): ContextMenuOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (contextMenuItems != null) __obj.updateDynamic("contextMenuItems")(contextMenuItems)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuOpenEventArgs]
  }
}

