package typings.ejDotWebDotAll.ej.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemHoverEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the target of the current object.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the Toolbar model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Toolbar.Model] = js.undefined
  /** return the Toolbar state
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** returns the target of the current object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ItemHoverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentTarget: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Toolbar.Model = null,
    status: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    `type`: String = null
  ): ItemHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemHoverEventArgs]
  }
}

