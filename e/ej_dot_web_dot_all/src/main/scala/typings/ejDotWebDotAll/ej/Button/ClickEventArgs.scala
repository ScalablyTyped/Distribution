package typings.ejDotWebDotAll.ej.Button

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** return the event model for sever side processing.
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns the button model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Button.Model] = js.undefined
  /** return the button state
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Button.Model = null,
    status: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (e != null) __obj.updateDynamic("e")(e)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

