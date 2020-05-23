package typings.ejWebAll.ej.MaskEdit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseOutEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the mask edit model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns unstripped value in mask edit textbox control.
    */
  var unmaskedValue: js.UndefOr[String] = js.undefined
  /** returns the mask edit value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object MouseOutEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `type`: String = null,
    unmaskedValue: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): MouseOutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unmaskedValue != null) __obj.updateDynamic("unmaskedValue")(unmaskedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseOutEventArgs]
  }
}

