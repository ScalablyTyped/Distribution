package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns new added tab content panel.
    */
  var tabContent: js.UndefOr[js.Any] = js.undefined
  /** returns new added tab header.
    */
  var tabHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ItemAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    tabContent: js.Any = null,
    tabHeader: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): ItemAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (tabContent != null) __obj.updateDynamic("tabContent")(tabContent)
    if (tabHeader != null) __obj.updateDynamic("tabHeader")(tabHeader)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemAddEventArgs]
  }
}

