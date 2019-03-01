package typings
package ejDotWebDotAllLib.ejNs.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the ProgressBar model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current progress percentage
    */
  var percentage: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current progress value
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    percentage: js.Any = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): CompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CompleteEventArgs]
  }
}

