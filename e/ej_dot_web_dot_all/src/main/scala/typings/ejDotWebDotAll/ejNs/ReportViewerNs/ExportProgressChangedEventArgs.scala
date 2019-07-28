package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportProgressChangedEventArgs extends js.Object {
  /** returns ReportViewer container Id.
    */
  var containerId: js.UndefOr[String] = js.undefined
  /** returns the export format
    */
  var format: js.UndefOr[String] = js.undefined
  /** true if the event should be handled; otherwise, false.
    */
  var handled: js.UndefOr[Boolean] = js.undefined
  /** returns the stage of export processing.
    */
  var stage: js.UndefOr[String] = js.undefined
}

object ExportProgressChangedEventArgs {
  @scala.inline
  def apply(
    containerId: String = null,
    format: String = null,
    handled: js.UndefOr[Boolean] = js.undefined,
    stage: String = null
  ): ExportProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handled)) __obj.updateDynamic("handled")(handled)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[ExportProgressChangedEventArgs]
  }
}

