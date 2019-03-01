package typings
package ejDotWebDotAllLib.ejNs.MaskEditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyUpEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the mask edit model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns unstripped value in mask edit textbox control.
    */
  var unmaskedValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns the mask edit value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object KeyUpEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    `type`: java.lang.String = null,
    unmaskedValue: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): KeyUpEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unmaskedValue != null) __obj.updateDynamic("unmaskedValue")(unmaskedValue)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUpEventArgs]
  }
}

