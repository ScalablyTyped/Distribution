package typings
package ejDotWebDotAllLib.ejNs.DialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonClickEventArgs extends js.Object {
  /** Name of the event target attribute.
    */
  var buttonID: js.UndefOr[java.lang.String] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the event current target title.
    */
  var currentTarget: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var event: js.UndefOr[java.lang.String] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionButtonClickEventArgs {
  @scala.inline
  def apply(
    buttonID: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentTarget: java.lang.String = null,
    event: java.lang.String = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): ActionButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (buttonID != null) __obj.updateDynamic("buttonID")(buttonID)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionButtonClickEventArgs]
  }
}

