package typings.ejDotWebDotAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusInEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FocusInEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, model: Model = null, `type`: String = null): FocusInEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusInEventArgs]
  }
}

