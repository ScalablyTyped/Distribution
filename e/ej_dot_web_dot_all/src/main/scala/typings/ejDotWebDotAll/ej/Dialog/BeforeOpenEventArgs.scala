package typings.ejDotWebDotAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOpenEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Dialog.Model] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Dialog.Model = null,
    `type`: String = null
  ): BeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeOpenEventArgs]
  }
}

