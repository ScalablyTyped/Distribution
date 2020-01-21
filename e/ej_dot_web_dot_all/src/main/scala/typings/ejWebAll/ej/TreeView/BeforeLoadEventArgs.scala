package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeLoadEventArgs extends js.Object {
  /** returns the AJAX settings object
    */
  var AjaxOptions: js.UndefOr[js.Any] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeLoadEventArgs {
  @scala.inline
  def apply(
    AjaxOptions: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `type`: String = null
  ): BeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (AjaxOptions != null) __obj.updateDynamic("AjaxOptions")(AjaxOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeLoadEventArgs]
  }
}

