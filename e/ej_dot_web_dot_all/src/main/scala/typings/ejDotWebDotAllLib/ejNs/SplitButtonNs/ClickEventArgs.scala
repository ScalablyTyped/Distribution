package typings
package ejDotWebDotAllLib.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the split button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** return the button state
    */
  var status: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the target of the current object.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

