package typings.ejWebAll.ej.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowCloseEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current  X position of the target .
    */
  var clientX: js.UndefOr[Double] = js.undefined
  /** Returns the current  Y position of the target .
    */
  var clientY: js.UndefOr[Double] = js.undefined
  /** returns the target of the current object.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the Toolbar model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OverflowCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    currentTarget: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): OverflowCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.get.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowCloseEventArgs]
  }
}

