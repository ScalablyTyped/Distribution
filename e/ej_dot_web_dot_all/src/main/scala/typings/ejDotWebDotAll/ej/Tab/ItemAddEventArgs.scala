package typings.ejDotWebDotAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Tab.Model] = js.undefined
  /** returns new added tab content panel.
    */
  var tabContent: js.UndefOr[js.Any] = js.undefined
  /** returns new added tab header.
    */
  var tabHeader: js.UndefOr[HTMLElement] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ItemAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Tab.Model = null,
    tabContent: js.Any = null,
    tabHeader: HTMLElement = null,
    `type`: String = null
  ): ItemAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (tabContent != null) __obj.updateDynamic("tabContent")(tabContent.asInstanceOf[js.Any])
    if (tabHeader != null) __obj.updateDynamic("tabHeader")(tabHeader.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAddEventArgs]
  }
}

