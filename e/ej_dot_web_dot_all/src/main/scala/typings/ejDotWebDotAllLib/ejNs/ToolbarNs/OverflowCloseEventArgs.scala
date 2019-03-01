package typings
package ejDotWebDotAllLib.ejNs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowCloseEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current  X position of the target .
    */
  var clientX: js.UndefOr[scala.Double] = js.undefined
  /** Returns the current  Y position of the target .
    */
  var clientY: js.UndefOr[scala.Double] = js.undefined
  /** returns the target of the current object.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the Toolbar model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OverflowCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    currentTarget: js.Any = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): OverflowCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverflowCloseEventArgs]
  }
}

