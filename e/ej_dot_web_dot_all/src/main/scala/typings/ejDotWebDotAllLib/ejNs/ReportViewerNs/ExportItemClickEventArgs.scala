package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportItemClickEventArgs extends js.Object {
  /** returns the export format value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ExportItemClickEventArgs {
  @scala.inline
  def apply(value: java.lang.String = null): ExportItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExportItemClickEventArgs]
  }
}

