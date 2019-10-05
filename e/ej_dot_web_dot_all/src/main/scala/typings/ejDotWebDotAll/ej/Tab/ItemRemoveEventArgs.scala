package typings.ejDotWebDotAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRemoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Tab.Model] = js.undefined
  /** returns removed tab header.
    */
  var removedTab: js.UndefOr[HTMLElement] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ItemRemoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Tab.Model = null,
    removedTab: HTMLElement = null,
    `type`: String = null
  ): ItemRemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (removedTab != null) __obj.updateDynamic("removedTab")(removedTab)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemRemoveEventArgs]
  }
}

