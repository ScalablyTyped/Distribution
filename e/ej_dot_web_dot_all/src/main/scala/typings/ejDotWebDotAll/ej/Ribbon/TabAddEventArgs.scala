package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabAddEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns new added tab content panel.
    */
  var tabContent: js.UndefOr[js.Any] = js.undefined
  /** returns new added tab header.
    */
  var tabHeader: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    tabContent: js.Any = null,
    tabHeader: js.Any = null,
    `type`: String = null
  ): TabAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (tabContent != null) __obj.updateDynamic("tabContent")(tabContent)
    if (tabHeader != null) __obj.updateDynamic("tabHeader")(tabHeader)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabAddEventArgs]
  }
}

