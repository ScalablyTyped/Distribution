package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportItemClickEventArgs extends js.Object {
  /** returns the export format value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ExportItemClickEventArgs {
  @scala.inline
  def apply(value: String = null): ExportItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportItemClickEventArgs]
  }
}

