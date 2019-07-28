package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportPrintEventArgs extends js.Object {
  /** true if you have to load the external style file; otherwise, false.
    */
  var isStyleLoad: js.UndefOr[Boolean] = js.undefined
}

object ReportPrintEventArgs {
  @scala.inline
  def apply(isStyleLoad: js.UndefOr[Boolean] = js.undefined): ReportPrintEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStyleLoad)) __obj.updateDynamic("isStyleLoad")(isStyleLoad)
    __obj.asInstanceOf[ReportPrintEventArgs]
  }
}

