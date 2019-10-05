package typings.ejDotWebDotAll.ej.ProgressBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the ProgressBar model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ProgressBar.Model] = js.undefined
  /** returns the current progress percentage
    */
  var percentage: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the current progress value
    */
  var value: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.ProgressBar.Model = null,
    percentage: js.Any = null,
    `type`: String = null,
    value: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

