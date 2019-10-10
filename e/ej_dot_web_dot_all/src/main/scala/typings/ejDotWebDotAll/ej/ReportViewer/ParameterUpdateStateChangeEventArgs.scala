package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterUpdateStateChangeEventArgs extends js.Object {
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** The parameter block id.
    */
  var containerId: js.UndefOr[String] = js.undefined
  /** true, if the event handled by user; otherwise, false.
    */
  var handled: js.UndefOr[Boolean] = js.undefined
  /** returns the report model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Its only to notify the the current parameter.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The progress text that is displayed on the loading indicator.
    */
  var progressText: js.UndefOr[String] = js.undefined
  /** Its only to notify the current parameter prompt value.
    */
  var prompt: js.UndefOr[String] = js.undefined
  /** The processing state.
    */
  var state: js.UndefOr[String] = js.undefined
}

object ParameterUpdateStateChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    containerId: String = null,
    handled: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    name: String = null,
    progressText: String = null,
    prompt: String = null,
    state: String = null
  ): ParameterUpdateStateChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (progressText != null) __obj.updateDynamic("progressText")(progressText)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ParameterUpdateStateChangeEventArgs]
  }
}

