package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingCompleteEventArgs extends js.Object {
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the report model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the collection of parameters.
    */
  var reportParameters: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RenderingCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    reportParameters: js.Any = null,
    `type`: String = null
  ): RenderingCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (reportParameters != null) __obj.updateDynamic("reportParameters")(reportParameters)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RenderingCompleteEventArgs]
  }
}

